package com.cidgravity.openapi.shared

import com.cidgravity.kong.ApiKeySecurityConfig.KEY_NAME
import com.cidgravity.shared.Util
import io.quarkus.runtime.annotations.RegisterForReflection
import io.swagger.v3.core.util.Yaml
import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.Operation
import io.swagger.v3.oas.models.PathItem
import io.swagger.v3.oas.models.PathItem.HttpMethod
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.License
import io.swagger.v3.oas.models.media.MediaType
import io.swagger.v3.oas.models.media.Schema
import io.swagger.v3.oas.models.security.SecurityRequirement
import io.swagger.v3.oas.models.security.SecurityScheme
import io.swagger.v3.oas.models.servers.Server
import java.io.File
import java.net.URL
import java.nio.file.Paths
import kotlin.io.path.absolutePathString

internal val OPENAPI_VERSION = "1.0.0"

internal val CONTACT = getContact()

internal val TERMS_OF_SERVICE = "https://www.example.com/terms/"

private fun getContact(): Contact {
    val contact = Contact()
    contact.name = "example team"
    contact.email = "contact@example.com"
    return contact
}

internal val API_GATEWAY_SERVER =
    Server()
        .url("https://services.example.com")

internal val OSS_LICENSE =
    License()
        .name("BSD-2-Clause-Patent")
        .url("https://spdx.org/licenses/BSD-2-Clause-Patent.html")

internal val PROPRIETARY_LICENSE =
    License()
        .name("Proprietary")

internal val V1 = "v1"

internal val APPLICATION_JSON = "application/json"

internal fun OpenAPI.addSchema(key: String, schemasItem: Schema<*>?): OpenAPI {
    return this.components(
        if (this.components != null) {
            this.components.addSchemas(key, schemasItem)
        } else {
            Components().addSchemas(key, schemasItem)
        }
    )
}

private data class XCodeSamplesExtension(
    val lang: String,
    val source: String,
    val label: String = lang,
)

private fun getXCodeSamplesExtension(source: String): Pair<String, List<XCodeSamplesExtension>> {
    return Pair(
        "x-codeSamples",
        listOf(
            XCodeSamplesExtension(
                lang = "cURL",
                source = source
            )
        )
    )
}

private fun buildCurlCommand(operation: Operation, fullPath: String, httpMethod: HttpMethod): String {
    return buildString {
        append("curl ")
        append("-X $httpMethod ")
        if (httpMethod == HttpMethod.HEAD) {
            append("--head ")
        }
        append("-H \"$KEY_NAME: <API_KEY>\" ") // code examples are only for public API protected by api key
        var queryParams = ""
        if (operation.parameters != null) {
            for (param in operation.parameters) {
                when (param.`in`) {
                    "header" -> {
                        append("-H \"${param.name}: <${param.name.uppercase()}>\" ")
                    }

                    "query" -> {
                        queryParams =
                            if (queryParams == "") {
                                "?${param.name}=<${param.name.uppercase()}>"
                            } else {
                                "${queryParams}&${param.name}=<${param.name.uppercase()}>"
                            }
                    }
                }
            }
        }
        if (operation.requestBody?.content != null) {
            try {
                val (mediaTypeName, mediaTypeObj: MediaType) = operation.requestBody.content.entries.toTypedArray()
                    .first()
                if (mediaTypeObj.schema == null) throw Exception("No schema")
                append("-H $mediaTypeName ")
                if (mediaTypeObj.schema.oneOf != null) {
                    val schema = mediaTypeObj.schema.oneOf.first()
                    if (schema.type != "object") {
                        append("-d '{ ${buildExampleFromSchema(schema)} }' ")
                    } else {
                        append("-d '${buildExampleFromSchema(schema)}' ")
                    }
                } else if (mediaTypeObj.schema.anyOf != null) {
                    val schema = mediaTypeObj.schema.anyOf.first()
                    if (schema.type != "object") {
                        append("-d '{ ${buildExampleFromSchema(schema)} }' ")
                    } else {
                        append("-d '${buildExampleFromSchema(schema)}' ")
                    }
                } else if (mediaTypeObj.schema.allOf != null) {
                    append("-d '{ ")
                    for ((index, schema) in mediaTypeObj.schema.allOf.withIndex()) {
                        var example = buildExampleFromSchema(schema)
                        // remove '{ ' (first 2 char)
                        if (schema.type == "object") {
                            example = example.drop(2)
                            // remove the last ' }' (last 2 char)
                            example = example.dropLast(2)
                        }
                        if (index != mediaTypeObj.schema.allOf.size - 1) {
                            // not the last schema!
                            // add a comma ', ' at the end
                            example = "$example, "
                        }
                        append(example)
                    }
                    append(" }' ")
                } else {
                    val schema = mediaTypeObj.schema
                    append("-d ${buildExampleFromSchema(schema)} ")
                }
            } catch (e: Exception) {
                println("Cannot add requestBody in curl code sample")
                e.printStackTrace()
            }
        }
        append("$fullPath$queryParams")
    }
}

private fun buildExampleFromSchema(schema: Schema<*>, propertyName: String? = null): String {
    when (schema.type) {
        "array" -> {
            val items = schema.items
            val value = buildExampleFromSchema(items)
            return if (propertyName != null) {
                "\"$propertyName\": [$value, ...]"
            } else {
                val variableName =
                    schema.`$ref`.takeLastWhile { it != '/' }.replaceFirstChar { char -> char.lowercase() }
                "\"$variableName\": [$value, ...]"
            }
        }

        "string", "number", "integer", "boolean" -> {
            return if (propertyName != null) {
                "\"$propertyName\": \"<${propertyName.uppercase()}>\""
            } else {
                val variableName =
                    schema.`$ref`.takeLastWhile { it != '/' }.replaceFirstChar { char -> char.lowercase() }
                "\"$variableName\": \"<${variableName.uppercase()}>\""
            }
        }

        "object" -> {
            val properties = schema.properties
            val value = buildString {
                append("{ ")
                properties.entries.forEachIndexed { index, (propertyName, schema) ->
                    append(buildExampleFromSchema(schema, propertyName))
                    if (index != properties.values.size - 1) {
                        append(", ")
                    } else {
                        append(" ")
                    }
                }
                append("}")
            }
            return value
        }

        else -> {
            println("Type in requestBody is invalid, cannot provide relevant cURL example: $schema")
            return ""
        }
    }
}

internal fun PathItem.addCodeSamples(pathName: String): PathItem {
    val server = API_GATEWAY_SERVER
    val fullPath = URL(
        URL(server.url),
        Util.getPrefixedPath(pathName, SecurityScheme.Type.APIKEY)
    ).toString()
    if (this.get != null) {
        val operation = this.get
        val curlCommand = buildCurlCommand(operation, fullPath, HttpMethod.GET)
        val (name, value) = getXCodeSamplesExtension(curlCommand)
        operation.addExtension(name, value)
    }
    if (this.put != null) {
        val operation = this.put
        val curlCommand = buildCurlCommand(operation, fullPath, HttpMethod.PUT)
        val (name, value) = getXCodeSamplesExtension(curlCommand)
        operation.addExtension(name, value)
    }
    if (this.post != null) {
        val operation = this.post
        val curlCommand = buildCurlCommand(operation, fullPath, HttpMethod.POST)
        val (name, value) = getXCodeSamplesExtension(curlCommand)
        operation.addExtension(name, value)
    }
    if (this.patch != null) {
        val operation = this.patch
        val curlCommand = buildCurlCommand(operation, fullPath, HttpMethod.PATCH)
        val (name, value) = getXCodeSamplesExtension(curlCommand)
        operation.addExtension(name, value)
    }
    if (this.delete != null) {
        val operation = this.delete
        val curlCommand = buildCurlCommand(operation, fullPath, HttpMethod.DELETE)
        val (name, value) = getXCodeSamplesExtension(curlCommand)
        operation.addExtension(name, value)
    }
    if (this.head != null) {
        val operation = this.head
        val curlCommand = buildCurlCommand(operation, fullPath, HttpMethod.HEAD)
        val (name, value) = getXCodeSamplesExtension(curlCommand)
        operation.addExtension(name, value)
    }
    if (this.options != null) {
        val operation = this.options
        val curlCommand = buildCurlCommand(operation, fullPath, HttpMethod.OPTIONS)
        val (name, value) = getXCodeSamplesExtension(curlCommand)
        operation.addExtension(name, value)
    }
    if (this.trace != null) {
        val operation = this.trace
        val curlCommand = buildCurlCommand(operation, fullPath, HttpMethod.TRACE)
        val (name, value) = getXCodeSamplesExtension(curlCommand)
        operation.addExtension(name, value)
    }
    return this
}

internal fun cloneSchema(schema: Schema<*>): Schema<*> {
    return Schema<Any>()
        ._default(schema.default)
        .name(schema.name)
        .title(schema.title)
        .multipleOf(schema.multipleOf)
        .maximum(schema.maximum)
        .exclusiveMaximum(schema.exclusiveMaximum)
        .minimum(schema.minimum)
        .exclusiveMinimum(schema.exclusiveMinimum)
        .maxLength(schema.maxLength)
        .minLength(schema.minLength)
        .pattern(schema.pattern)
        .maxItems(schema.maxItems)
        .minItems(schema.minItems)
        .uniqueItems(schema.uniqueItems)
        .maxProperties(schema.maxProperties)
        .minProperties(schema.minProperties)
        .required(schema.required)
        .type(schema.type)
        .not(schema.not)
        .properties(schema.properties)
        .additionalProperties(schema.additionalProperties)
        .description(schema.description)
        .format(schema.format)
        .`$ref`(schema.`$ref`)
        .nullable(schema.nullable)
        .readOnly(schema.readOnly)
        .writeOnly(schema.writeOnly)
        .example(schema.example)
        .externalDocs(schema.externalDocs)
        .deprecated(schema.deprecated)
        .xml(schema.xml)
        .extensions(schema.extensions)
        ._enum(schema.enum)
        .discriminator(schema.discriminator)
        .exampleSetFlag(schema.exampleSetFlag)
        .prefixItems(schema.prefixItems)
        .allOf(schema.allOf)
        .anyOf(schema.anyOf)
        .oneOf(schema.oneOf)
        .items(schema.items)
        ._const(schema.const)
        .specVersion(schema.specVersion)
        .types(schema.types)
        .patternProperties(schema.patternProperties)
        .exclusiveMaximumValue(schema.exclusiveMaximumValue)
        .exclusiveMinimumValue(schema.exclusiveMinimumValue)
        .contains(schema.contains)
        .`$id`(schema.`$id`)
        .`$schema`(schema.`$schema`)
        .`$anchor`(schema.`$anchor`)
        .contentEncoding(schema.contentEncoding)
        .contentMediaType(schema.contentMediaType)
        .contentSchema(schema.contentSchema)
        .propertyNames(schema.propertyNames)
        .unevaluatedProperties(schema.unevaluatedProperties)
        ._if(schema.`if`)
        ._else(schema.`else`)
        .then(schema.then)
        .dependentSchemas(schema.dependentSchemas)
        .dependentRequired(schema.dependentRequired)
        .`$comment`(schema.`$comment`)
        .examples(schema.examples)
        .booleanSchemaValue(schema.booleanSchemaValue)
}

private fun SecurityRequirement.cloneSecurityRequirement(): SecurityRequirement {
    val newSecurityRequirement = SecurityRequirement()
    for ((key, value) in this) {
        newSecurityRequirement.addList(key, value)
    }
    return newSecurityRequirement
}

private fun Operation.clone(): Operation {
    var listOfSecurities: MutableList<SecurityRequirement>? = null
    if (this.security != null) {
        listOfSecurities = mutableListOf()
        for (securityRequirement in this.security) {
            listOfSecurities.add(securityRequirement.cloneSecurityRequirement())
        }
    }
    return Operation()
        .tags(this.tags?.toList())
        .summary(this.summary)
        .description(this.description)
        .externalDocs(this.externalDocs)
        .operationId(this.operationId)
        .parameters(this.parameters)
        .requestBody(this.requestBody)
        .responses(this.responses)
        .callbacks(this.callbacks?.toMap())
        .deprecated(this.deprecated)
        .security(listOfSecurities) // that's the important bit
        .servers(this.servers?.toList())
        .extensions(this.extensions?.toMap())
}

/**
 * deep equality is broken in Java
 * we need this because we use [addSecurities]
 * we don't really deep clon everything.
 * mainly what we need
 */
internal fun PathItem.clone(): PathItem {
    return PathItem()
        .summary(this.summary)
        .description(this.description)
        .get(this.get?.clone())
        .put(this.put?.clone())
        .post(this.post?.clone())
        .delete(this.delete?.clone())
        .options(this.options?.clone())
        .head(this.head?.clone())
        .patch(this.patch?.clone())
        .trace(this.trace?.clone())
        .servers(this.servers?.toList())
        .parameters(this.parameters)
        .`$ref`(this.`$ref`)
        .extensions(this.extensions)
}

internal fun PathItem.addSecurities(securities: Set<Set<SecuritySchemeParams>>): PathItem {
    for (securitiesUnion in securities) {
        // avoid filling "- []"
        if (securitiesUnion.isEmpty()) {
            continue
        }
        if (this.get != null) {
            val operation = this.get
            val securityRequirement = SecurityRequirement().addSecuritySchemes(securitiesUnion)
            operation.addSecurityItem(securityRequirement)
        }
        if (this.put != null) {
            val operation = this.put
            val securityRequirement = SecurityRequirement().addSecuritySchemes(securitiesUnion)
            operation.addSecurityItem(securityRequirement)
        }
        if (this.post != null) {
            val operation = this.post
            val securityRequirement = SecurityRequirement().addSecuritySchemes(securitiesUnion)
            operation.addSecurityItem(securityRequirement)
        }
        if (this.patch != null) {
            val operation = this.patch
            val securityRequirement = SecurityRequirement().addSecuritySchemes(securitiesUnion)
            operation.addSecurityItem(securityRequirement)
        }
        if (this.delete != null) {
            val operation = this.delete
            val securityRequirement = SecurityRequirement().addSecuritySchemes(securitiesUnion)
            operation.addSecurityItem(securityRequirement)
        }
        if (this.head != null) {
            val operation = this.head
            val securityRequirement = SecurityRequirement().addSecuritySchemes(securitiesUnion)
            operation.addSecurityItem(securityRequirement)
        }
        if (this.options != null) {
            val operation = this.options
            val securityRequirement = SecurityRequirement().addSecuritySchemes(securitiesUnion)
            operation.addSecurityItem(securityRequirement)
        }
        if (this.trace != null) {
            val operation = this.trace
            val securityRequirement = SecurityRequirement().addSecuritySchemes(securitiesUnion)
            operation.addSecurityItem(securityRequirement)
        }
    }
    return this
}

internal fun OpenAPI.addPath(name: String, path: PathItem): OpenAPI {
    return this.path(name, path)
}

fun OpenAPI.addSecurityRequirements(securitySchemes: Set<SecuritySchemeParams>): OpenAPI {
    var openAPI = this
    for (securityScheme in securitySchemes) {
        openAPI =
            openAPI.schemaRequirement(
                securityScheme.KEY,
                securityScheme.SECURITY_SCHEME
            )
    }
    return openAPI
}

private fun SecurityRequirement.addSecuritySchemes(securitySchemes: Set<SecuritySchemeParams>): SecurityRequirement {
    for (securityScheme in securitySchemes) {
        this.addList(securityScheme.KEY)
    }
    return this
}

/**
 * @see https://redocly.com/docs/api-reference-docs/specification-extensions/x-logo/
 */
@RegisterForReflection
private data class LogoExtension (
    val url: String = "https://app.example.com/images/example.png",
    val backgroundColor: String = "#ffffff",
    val altText: String = "example logo",
)
internal fun Info.addXLogo(): Info {
    this.addExtension(
        "x-logo",
        LogoExtension()
    )
    return this
}

// basename == filename slug without extension
internal fun OpenAPI.writeToYamlFile(basename: String, directory: String = Paths.get("").absolutePathString()) {
    val filename = "${directory}/${basename}.yaml"
    try {
        Yaml
            .pretty()
            .writeValue(File(filename), this)
        println("Successfully generated '${filename}'")
    } catch (e: Exception) {
        println("Error while attempting to generate '${filename}'")
        e.printStackTrace()
    }
}

// internal fun Schema<*>.getUsedSchemaRefs(): Set<String> {
//     val refs = mutableSetOf<String>()
//     this.`$ref`?.let { refs.add(it) }
//     this.not?.let {  refs.addAll(it.getUsedSchemaRefs()) }
//     this.properties?.forEach { (_, schema) -> refs.addAll(schema.getUsedSchemaRefs())  }
//     this.prefixItems?.forEach { schema -> refs.addAll(schema.getUsedSchemaRefs()) }
//     this.allOf?.forEach { schema -> refs.addAll(schema.getUsedSchemaRefs())  }
//     this.anyOf?.forEach { schema -> refs.addAll(schema.getUsedSchemaRefs()) }
//     this.oneOf?.forEach { schema -> refs.addAll(schema.getUsedSchemaRefs()) }
//     this.items?.let {  refs.addAll(it.getUsedSchemaRefs()) }
//     return refs.toSet()
// }
//
// internal fun PathItem.getUsedSchemaRefs(): Set<String> {
//     val refs = mutableSetOf<String>()
//     val pathItem = this
//     pathItem.`$ref`?.let { refs.add(it) }
//     // Request Body
//     pathItem.get?.requestBody?.let {
//         run {
//             it.`$ref`?.let { refs.add(it) }
//             it.content.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemaRefs()) } }
//         }
//     }
//     pathItem.put?.requestBody?.let {
//         run {
//             it.`$ref`?.let { refs.add(it) }
//             it.content.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemaRefs()) } }
//         }
//     }
//     pathItem.post?.requestBody?.let {
//         run {
//             it.`$ref`?.let { refs.add(it) }
//             it.content.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemaRefs()) } }
//         }
//     }
//     pathItem.delete?.requestBody?.let {
//         run {
//             it.`$ref`?.let { refs.add(it) }
//             it.content.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemaRefs()) } }
//         }
//     }
//     pathItem.options?.requestBody?.let {
//         run {
//             it.`$ref`?.let { refs.add(it) }
//             it.content.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemaRefs()) } }
//         }
//     }
//     pathItem.head?.requestBody?.let {
//         run {
//             it.`$ref`?.let { refs.add(it) }
//             it.content.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemaRefs()) } }
//         }
//     }
//     pathItem.patch?.requestBody?.let {
//         run {
//             it.`$ref`?.let { refs.add(it) }
//             it.content.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemaRefs()) } }
//         }
//     }
//     pathItem.trace?.requestBody?.let {
//         run {
//             it.`$ref`?.let { refs.add(it) }
//             it.content.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemaRefs()) } }
//         }
//     }
//     // Parameters
//     pathItem.get?.parameters?.forEach { param -> param.`$ref`?.let { refs.add(it) } }
//     pathItem.put?.parameters?.forEach { param -> param.`$ref`?.let { refs.add(it) } }
//     pathItem.post?.parameters?.forEach { param -> param.`$ref`?.let { refs.add(it) } }
//     pathItem.delete?.parameters?.forEach { param -> param.`$ref`?.let { refs.add(it) } }
//     pathItem.options?.parameters?.forEach { param -> param.`$ref`?.let { refs.add(it) } }
//     pathItem.head?.parameters?.forEach { param -> param.`$ref`?.let { refs.add(it) } }
//     pathItem.patch?.parameters?.forEach { param -> param.`$ref`?.let { refs.add(it) } }
//     pathItem.trace?.parameters?.forEach { param -> param.`$ref`?.let { refs.add(it) } }
//     // Responses
//     pathItem.get?.responses?.forEach { _, response ->
//         run {
//             response.`$ref`?.let { refs.add(it) }
//             response.headers?.forEach { (_, header) -> header.`$ref`?.let { refs.add(it) } }
//             response.links.forEach { (_, link) -> link.`$ref`?.let { refs.add(it) } }
//             response.content.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemaRefs()) } }
//         }
//     }
//     pathItem.put?.responses?.forEach { _, response ->
//         run {
//             response.`$ref`?.let { refs.add(it) }
//             response.headers?.forEach { (_, header) -> header.`$ref`?.let { refs.add(it) } }
//             response.links.forEach { (_, link) -> link.`$ref`?.let { refs.add(it) } }
//             response.content.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemaRefs()) } }
//         }
//     }
//     pathItem.post?.responses?.forEach { _, response ->
//         run {
//             response.`$ref`?.let { refs.add(it) }
//             response.headers?.forEach { (_, header) -> header.`$ref`?.let { refs.add(it) } }
//             response.links?.forEach { (_, link) -> link.`$ref`?.let { refs.add(it) } }
//             response.content?.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemaRefs()) } }
//         }
//     }
//     pathItem.delete?.responses?.forEach { _, response ->
//         run {
//             response.`$ref`?.let { refs.add(it) }
//             response.headers?.forEach { (_, header) -> header.`$ref`?.let { refs.add(it) } }
//             response.links?.forEach { (_, link) -> link.`$ref`?.let { refs.add(it) } }
//             response.content?.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemaRefs()) } }
//         }
//     }
//     pathItem.options?.responses?.forEach { _, response ->
//         run {
//             response.`$ref`?.let { refs.add(it) }
//             response.headers?.forEach { (_, header) -> header.`$ref`?.let { refs.add(it) } }
//             response.links?.forEach { (_, link) -> link.`$ref`?.let { refs.add(it) } }
//             response.content?.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemaRefs()) } }
//         }
//     }
//     pathItem.head?.responses?.forEach { _, response ->
//         run {
//             response.`$ref`?.let { refs.add(it) }
//             response.headers?.forEach { (_, header) -> header.`$ref`?.let { refs.add(it) } }
//             response.links?.forEach { (_, link) -> link.`$ref`?.let { refs.add(it) } }
//             response.content?.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemaRefs()) } }
//         }
//     }
//     pathItem.patch?.responses?.forEach { _, response ->
//         run {
//             response.`$ref`?.let { refs.add(it) }
//             response.headers?.forEach { (_, header) -> header.`$ref`?.let { refs.add(it) } }
//             response.links?.forEach { (_, link) -> link.`$ref`?.let { refs.add(it) } }
//             response.content?.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemaRefs()) } }
//         }
//     }
//     pathItem.trace?.responses?.forEach { _, response ->
//         run {
//             response.`$ref`?.let { refs.add(it) }
//             response.headers?.forEach { (_, header) -> header.`$ref`?.let { refs.add(it) } }
//             response.links?.forEach { (_, link) -> link.`$ref`?.let { refs.add(it) } }
//             response.content?.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemaRefs()) } }
//         }
//     }
//     // Callback
//     pathItem.get?.callbacks?.forEach { (_, callback) ->
//         run {
//             callback?.`$ref`?.let { refs.add(it) }
//             callback.forEach { (_, pathItem) -> refs.addAll(pathItem.getUsedSchemaRefs()) }
//         }
//     }
//     return refs.toSet()
// }
//
// internal fun OpenAPI.getUsedSchemaRefs(): Set<String> {
//     val refs = mutableSetOf<String>()
//     for (path in this.paths) {
//         for ((_, pathItem) in paths) {
//             refs.addAll(pathItem.getUsedSchemaRefs())
//         }
//     }
//     return refs.toSet()
// }

// internal fun OpenAPI.getUsedSchemas(): Set<Schema<*>> {
//     val refs = mutableSetOf<Schema<*>>()
//     for (path in this.paths) {
//         for ((_, pathItem) in paths) {
//             refs.addAll(pathItem.getUsedSchemas())
//         }
//     }
//     return refs.toSet()
// }

internal fun Schema<*>.getUsedSchemas(): Set<Schema<*>> {
    val refs = mutableSetOf<Schema<*>>()
    refs.add(this)
    this.not?.let { refs.add(this.not) }
    this.properties?.forEach { (_, schema) -> refs.addAll(schema.getUsedSchemas()) }
    this.prefixItems?.forEach { schema -> refs.addAll(schema.getUsedSchemas()) }
    this.allOf?.forEach { schema -> refs.addAll(schema.getUsedSchemas()) }
    this.anyOf?.forEach { schema -> refs.addAll(schema.getUsedSchemas()) }
    this.oneOf?.forEach { schema -> refs.addAll(schema.getUsedSchemas()) }
    this.items?.let { refs.addAll(it.getUsedSchemas()) }
    return refs.toSet()
}

internal fun PathItem.getUsedSchemas(): Set<Schema<*>> {
    val refs = mutableSetOf<Schema<*>>()
    val pathItem = this
    // Request Body
    pathItem.get?.requestBody?.let {
        run {
            it.content?.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemas()) } }
        }
    }
    pathItem.put?.requestBody?.let {
        run {
            it.content?.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemas()) } }
        }
    }
    pathItem.post?.requestBody?.let {
        run {
            it.content?.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemas()) } }
        }
    }
    pathItem.delete?.requestBody?.let {
        run {
            it.content?.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemas()) } }
        }
    }
    pathItem.options?.requestBody?.let {
        run {
            it.content?.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemas()) } }
        }
    }
    pathItem.head?.requestBody?.let {
        run {
            it.content?.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemas()) } }
        }
    }
    pathItem.patch?.requestBody?.let {
        run {
            it.content?.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemas()) } }
        }
    }
    pathItem.trace?.requestBody?.let {
        run {
            it.content?.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemas()) } }
        }
    }
    // Responses
    pathItem.get?.responses?.forEach { _, response ->
        run {
            response.content?.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemas()) } }
        }
    }
    pathItem.put?.responses?.forEach { _, response ->
        run {
            response.content?.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemas()) } }
        }
    }
    pathItem.post?.responses?.forEach { _, response ->
        run {
            response.content?.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemas()) } }
        }
    }
    pathItem.delete?.responses?.forEach { _, response ->
        run {
            response.content?.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemas()) } }
        }
    }
    pathItem.options?.responses?.forEach { _, response ->
        run {
            response.content?.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemas()) } }
        }
    }
    pathItem.head?.responses?.forEach { _, response ->
        run {
            response.content?.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemas()) } }
        }
    }
    pathItem.patch?.responses?.forEach { _, response ->
        run {
            response.content?.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemas()) } }
        }
    }
    pathItem.trace?.responses?.forEach { _, response ->
        run {
            response.content?.forEach { (_, mediaType) -> mediaType.schema?.let { refs.addAll(it.getUsedSchemas()) } }
        }
    }
    return refs.filter { schema -> schema.`$ref` != null }.toSet()
}
