package com.cidgravity.openapi.shared

import io.swagger.v3.oas.models.media.Schema
import java.sql.Timestamp
import java.util.*

class UnixTimestampSchema : Schema<Timestamp>("string", "timestamp") {

    override fun type(type: String?): UnixTimestampSchema {
        super.setType(type)
        return this
    }

    override fun format(format: String?): UnixTimestampSchema {
        super.setFormat(format)
        return this
    }

    override fun _default(timestamp: Timestamp?): UnixTimestampSchema {
        super.setDefault(timestamp)
        return this
    }

    override fun cast(value: Any?): Timestamp? {
        if (value != null) {
            try {
                if (value is Timestamp) {
                    return value
                } else if (value is Long) {
                    return Timestamp(value)
                }
            } catch (_: Exception) {
            }
        }
        return null
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        return if (other == null || javaClass != other.javaClass) {
            false
        } else super.equals(other)
    }

    override fun hashCode(): Int {
        return Objects.hash(super.hashCode())
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class UnixTimestampSchema {\n")
        sb.append("    ").append(toIndentedString(super.toString())).append("\n")
        sb.append("}")
        return sb.toString()
    }
}