/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.apis

import com.fasterxml.jackson.annotation.JsonProperty

import org.springframework.web.client.RestClient
import org.springframework.web.client.RestClientResponseException

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
import org.springframework.http.ResponseEntity
import org.springframework.http.MediaType


import org.openapitools.client.infrastructure.*

class FormApi(client: RestClient) : ApiClient(client) {

    constructor(baseUrl: String) : this(RestClient.builder()
        .baseUrl(baseUrl)
        .messageConverters { it.add(MappingJackson2HttpMessageConverter()) }
        .build()
    )


    @Throws(RestClientResponseException::class)
    fun testFormIntegerBooleanString(integerForm: kotlin.Int? = null, booleanForm: kotlin.Boolean? = null, stringForm: kotlin.String? = null): kotlin.String {
        val result = testFormIntegerBooleanStringWithHttpInfo(integerForm = integerForm, booleanForm = booleanForm, stringForm = stringForm)
        return result.body!!
    }

    @Throws(RestClientResponseException::class)
    fun testFormIntegerBooleanStringWithHttpInfo(integerForm: kotlin.Int? = null, booleanForm: kotlin.Boolean? = null, stringForm: kotlin.String? = null): ResponseEntity<kotlin.String> {
        val localVariableConfig = testFormIntegerBooleanStringRequestConfig(integerForm = integerForm, booleanForm = booleanForm, stringForm = stringForm)
        return request<Map<String, PartConfig<*>>, kotlin.String>(
            localVariableConfig
        )
    }

    fun testFormIntegerBooleanStringRequestConfig(integerForm: kotlin.Int? = null, booleanForm: kotlin.Boolean? = null, stringForm: kotlin.String? = null) : RequestConfig<Map<String, PartConfig<*>>> {
        val localVariableBody = mapOf(
            "integer_form" to PartConfig(body = integerForm, headers = mutableMapOf()),
            "boolean_form" to PartConfig(body = booleanForm, headers = mutableMapOf()),
            "string_form" to PartConfig(body = stringForm, headers = mutableMapOf()),)
        val localVariableQuery = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "application/x-www-form-urlencoded")
        localVariableHeaders["Accept"] = "text/plain"

        val params = mutableMapOf<String, Any>(
        )

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/form/integer/boolean/string",
            params = params,
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }


    @Throws(RestClientResponseException::class)
    fun testFormOneof(form1: kotlin.String? = null, form2: kotlin.Int? = null, form3: kotlin.String? = null, form4: kotlin.Boolean? = null, id: kotlin.Long? = null, name: kotlin.String? = null): kotlin.String {
        val result = testFormOneofWithHttpInfo(form1 = form1, form2 = form2, form3 = form3, form4 = form4, id = id, name = name)
        return result.body!!
    }

    @Throws(RestClientResponseException::class)
    fun testFormOneofWithHttpInfo(form1: kotlin.String? = null, form2: kotlin.Int? = null, form3: kotlin.String? = null, form4: kotlin.Boolean? = null, id: kotlin.Long? = null, name: kotlin.String? = null): ResponseEntity<kotlin.String> {
        val localVariableConfig = testFormOneofRequestConfig(form1 = form1, form2 = form2, form3 = form3, form4 = form4, id = id, name = name)
        return request<Map<String, PartConfig<*>>, kotlin.String>(
            localVariableConfig
        )
    }

    fun testFormOneofRequestConfig(form1: kotlin.String? = null, form2: kotlin.Int? = null, form3: kotlin.String? = null, form4: kotlin.Boolean? = null, id: kotlin.Long? = null, name: kotlin.String? = null) : RequestConfig<Map<String, PartConfig<*>>> {
        val localVariableBody = mapOf(
            "form1" to PartConfig(body = form1, headers = mutableMapOf()),
            "form2" to PartConfig(body = form2, headers = mutableMapOf()),
            "form3" to PartConfig(body = form3, headers = mutableMapOf()),
            "form4" to PartConfig(body = form4, headers = mutableMapOf()),
            "id" to PartConfig(body = id, headers = mutableMapOf()),
            "name" to PartConfig(body = name, headers = mutableMapOf()),)
        val localVariableQuery = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "application/x-www-form-urlencoded")
        localVariableHeaders["Accept"] = "text/plain"

        val params = mutableMapOf<String, Any>(
        )

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/form/oneof",
            params = params,
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

}