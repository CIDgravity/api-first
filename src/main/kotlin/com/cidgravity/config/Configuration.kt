package com.cidgravity.config

import io.quarkus.runtime.annotations.RegisterForReflection
import io.swagger.v3.core.jackson.mixin.ExampleMixin
import io.swagger.v3.core.jackson.mixin.MediaTypeMixin
import io.swagger.v3.core.jackson.mixin.SchemaMixin
import io.swagger.v3.oas.models.*
import io.swagger.v3.oas.models.examples.Example
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.License
import io.swagger.v3.oas.models.media.*
import io.swagger.v3.oas.models.parameters.Parameter
import io.swagger.v3.oas.models.parameters.RequestBody
import io.swagger.v3.oas.models.responses.ApiResponse
import io.swagger.v3.oas.models.responses.ApiResponses
import io.swagger.v3.oas.models.security.SecurityRequirement
import io.swagger.v3.oas.models.security.SecurityScheme
import io.swagger.v3.oas.models.servers.Server
import io.swagger.v3.oas.models.servers.ServerVariables
import org.eclipse.microprofile.config.ConfigProvider

// Necessary for `quarkus build --native` to work properly.
// I faced this problem:
// "An even nastier possible outcome could be for no exception to be thrown,
// but instead the JSON result would be completely empty." (in my case YAML output)
// See https://quarkus.io/guides/writing-native-applications-tips#registering-for-reflection
// See https://github.com/remkop/picocli/issues/850#issuecomment-1373866919 for MixIn-related problem
@RegisterForReflection(
    targets = [
        OpenAPI::class,
        Server::class,
        ServerVariables::class,
        Paths::class,
        PathItem::class,
        Operation::class,
        Parameter::class,
        RequestBody::class,
        Content::class,
        ApiResponses::class,
        ApiResponse::class,
        SecurityRequirement::class,
        SecurityScheme::class,
        Info::class,
        Contact::class,
        License::class,
        Components::class,
        MediaType::class,
        MediaTypeMixin::class,
        Example::class,
        ExampleMixin::class,
        Encoding::class,
        ExternalDocumentation::class,
        Schema::class,
        SchemaMixin::class,
        StringSchema::class,
        BooleanSchema::class,
        IntegerSchema::class,
        DateSchema::class,
        DateTimeSchema::class,
    ]
)
object Configuration {
    private val config = ConfigProvider.getConfig()

    val VERSION: String = config.getValue("quarkus.application.version", String::class.java)

    val NAME: String = config.getValue("quarkus.package.output-name", String::class.java)
}