/**
* OpenAPI Petstore
* This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.apis

import com.google.gson.Gson
import io.ktor.application.call
import io.ktor.auth.UserIdPrincipal
import io.ktor.auth.authentication
import io.ktor.auth.authenticate
import io.ktor.auth.OAuthAccessTokenResponse
import io.ktor.auth.OAuthServerSettings
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.Route
import org.openapitools.server.Paths
import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.delete
import io.ktor.locations.get
import io.ktor.locations.post
import io.ktor.locations.put
import io.ktor.locations.options
import io.ktor.locations.head

import org.openapitools.server.infrastructure.ApiPrincipal


import org.openapitools.server.models.Order

@KtorExperimentalLocationsAPI
fun Route.StoreApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()
    delete<Paths.deleteOrder> {
        call.respond(HttpStatusCode.NotImplemented)
    }

    authenticate("api_key") {
    get<Paths.getInventory> {
        val principal = call.authentication.principal<ApiPrincipal>()!!
        
        call.respond(HttpStatusCode.NotImplemented)
    }
    }

    get<Paths.getOrderById> {
        val exampleContentType = "application/json"
        val exampleContentString = """{
          "petId" : 6,
          "quantity" : 1,
          "id" : 0,
          "shipDate" : "2000-01-23T04:56:07.000+00:00",
          "complete" : false,
          "status" : "placed"
        }"""
        
        when (exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }

    post<Paths.placeOrder> {
        val exampleContentType = "application/json"
        val exampleContentString = """{
          "petId" : 6,
          "quantity" : 1,
          "id" : 0,
          "shipDate" : "2000-01-23T04:56:07.000+00:00",
          "complete" : false,
          "status" : "placed"
        }"""
        
        when (exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }

}