package com.cidgravity.openapi

import com.cidgravity.service.IService
import io.swagger.v3.oas.models.OpenAPI

/**
 * Classes implementing this interface will generate an OpenAPI that will assemble multiple services together
 */
interface IApi {

    val associatedServices: List<IService>

    fun get(): OpenAPI?
}