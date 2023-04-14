package com.cidgravity.openapi.schema

import com.cidgravity.openapi.shared.UnixTimestampSchema
import io.swagger.v3.oas.models.media.*

fun timestamp(): Schema<Any> {
    return UnixTimestampSchema().`$ref`("Timestamp")
}

fun someSchemaUnused(): Schema<Any> {
    val name = "SomeSchema"
    return ObjectSchema()
        .addProperty("id", IntegerSchema())
        .addProperty("someStuff", JsonSchema())
        .addProperty("someNumber", IntegerSchema().format("int64"))
        .addProperty("someBool", BooleanSchema())
        .`$ref`(name)
}