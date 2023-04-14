package com.cidgravity.service

import com.cidgravity.openapi.schema.timestamp
import com.cidgravity.openapi.shared.APPLICATION_JSON
import com.cidgravity.openapi.shared.V1
import com.cidgravity.shared.Util
import com.cidgravity.shared.Util.StandardEndpoint
import com.cidgravity.shared.Util.StandardSecurity
import io.swagger.v3.oas.models.Operation
import io.swagger.v3.oas.models.PathItem
import io.swagger.v3.oas.models.media.*
import io.swagger.v3.oas.models.parameters.RequestBody
import io.swagger.v3.oas.models.responses.ApiResponse
import io.swagger.v3.oas.models.responses.ApiResponses
import java.net.URL

object SomeService : IService() {

    override val id: String = "reporting"

    override val servers = listOf(URL("https://some-service.example.com/"))

    val securities: Set<StandardSecurity> = setOf(
        Util.apiKeySecurity,
        Util.oauth2Security()
    )

    override val endpoints: List<StandardEndpoint> =
        listOf(
            StandardEndpoint(
                path = "/$V1/some-endpoint",
                openapiPath = getSomeEndpoint(),
                isPublic = true,
                securities = securities
            ),
            StandardEndpoint(
                path = "/$V1/some-endpoint-2",
                openapiPath = getSomeEndpoint2(),
                isPublic = true,
                securities = securities
            ),
        )

    private fun validTimeRange(): Schema<Any> {
        val name = "ValidTimeRange"
        return StringSchema()
            .addEnumItem("1hour")
            .addEnumItem("5day")
            .addEnumItem("1month")
            .addEnumItem("3months")
            .`$ref`(name)
    }


    private fun someSchemaDef(): Schema<Any> {
        return ObjectSchema()
            .addProperty(
                "value",
                Schema<Any>()
                    .oneOf(
                        listOf(
                            StringSchema(),
                            NumberSchema(),
                        )
                    )
            )
            .addProperty(
                "createdAt",
                StringSchema()
            )
            .addProperty("someCount", IntegerSchema())
            .addProperty("someProperty", IntegerSchema())
            .`$ref`("someSchemaDef")
    }

    private fun someSchemaPropertySchema(): Schema<Any> {
        val name = "SomeSchemaPropertySchema"
        return ObjectSchema()
            .addProperty("someStuff", ArraySchema().items(someSchemaDef()))
            .addProperty("someProperty", ArraySchema().items(someSchemaDef()))
            .addProperty("anotherOne", ArraySchema().items(someSchemaDef()))
            .`$ref`(name)
    }

    private fun someResponseSchema(): Schema<Any> {
        val name = "SomeResponseSchema"
        return ObjectSchema()
            .addProperty("thing", ArraySchema().items(someSchemaDef()))
            .addProperty("thing2", ArraySchema().items(someSchemaDef()))
            .addProperty("thing3", ArraySchema().items(someSchemaDef()))
            .addProperty("thing4", ArraySchema().items(someSchemaDef()))
            .`$ref`(name)
    }

    private fun getSomeEndpoint(): PathItem {
        return PathItem().post(
            Operation()
                .tags(listOf(id))
                .summary("Some summary ")
                .description("Some description")
                .requestBody(
                    RequestBody()
                        .content(
                            Content()
                                .addMediaType(
                                    APPLICATION_JSON,
                                    MediaType()
                                        .schema(
                                            Schema<Any>().oneOf(
                                                listOf(
                                                    validTimeRange(),
                                                    timestamp()
                                                )
                                            )
                                        )
                                )
                        )
                        .description("Some description")
                )
                .responses(
                    ApiResponses()
                        .addApiResponse(
                            "200",
                            ApiResponse()
                                .description("OK")
                                .content(
                                    Content()
                                        .addMediaType(
                                            APPLICATION_JSON,
                                            MediaType()
                                                .schema(
                                                    ArraySchema().items(
                                                        someSchemaDef()
                                                    )
                                                )
                                        )
                                )
                        )
                        .addApiResponse("400", ApiResponse().description("Invalid request body found"))
                )
        )
    }

    private fun getSomeEndpoint2(): PathItem {
        return PathItem().post(
            Operation()
                .tags(listOf(id))
                .summary("Some summary")
                .description("Some description")
                .requestBody(
                    RequestBody()
                                .content(
                                    Content()
                                        .addMediaType(
                                            APPLICATION_JSON,
                                            MediaType()
                                                .schema(
                                                    someSchemaPropertySchema()
                                                )
                                        )
                                )
                        .description("Some description")
                )
                .responses(
                    ApiResponses()
                        .addApiResponse(
                            "200",
                            ApiResponse()
                                .description("OK")
                                .content(
                                    Content()
                                        .addMediaType(
                                            APPLICATION_JSON,
                                            MediaType()
                                                .schema(
                                                    someResponseSchema()
                                                )
                                        )
                                )
                        )
                        .addApiResponse("400", ApiResponse().description("Some description"))
                )
        )
    }
}
