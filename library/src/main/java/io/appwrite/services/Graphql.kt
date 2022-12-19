package io.appwrite.services

import android.net.Uri
import io.appwrite.Client
import io.appwrite.models.*
import io.appwrite.exceptions.AppwriteException
import okhttp3.Cookie
import okhttp3.Response
import java.io.File

class Graphql : Service {

    public constructor (client: Client) : super(client) { }

    /**
     * GraphQL Endpoint
     *
     * Execute a GraphQL query.
     *
     * @param query The query to execute.
     * @param operationName The name of the operation to execute.
     * @param variables The JSON encoded variables to use in the query.
     * @return [Any]     
     */
    @JvmOverloads
    suspend fun 63a0228e7e93a(
		query: String,
		operationName: String? = null,
		variables: String? = null
	): Any {
        val path = "/graphql"
        val params = mutableMapOf<String, Any?>(
            "query" to query,
            "operationName" to operationName,
            "variables" to variables
        )
        val headers = mutableMapOf(
            "content-type" to "application/json"
        )
        val converter: (Any) -> Any = {
            it
        }
        return client.call(
            "GET",
            path,
            headers,
            params,
            responseType = Any::class.java,
            converter,
        )
    }
    
    /**
     * GraphQL Endpoint
     *
     * Execute a GraphQL mutation.
     *
     * @param query The query or queries to execute.
     * @return [Any]     
     */
    @JvmOverloads
    suspend fun query(
		query: Any
	): Any {
        val path = "/graphql"
        val params = mutableMapOf<String, Any?>(
            "query" to query
        )
        val headers = mutableMapOf(
            "x-sdk-graphql" to "true",
            "content-type" to "application/json"
        )
        val converter: (Any) -> Any = {
            it
        }
        return client.call(
            "POST",
            path,
            headers,
            params,
            responseType = Any::class.java,
            converter,
        )
    }
    
    /**
     * GraphQL Endpoint
     *
     * Execute a GraphQL mutation.
     *
     * @param query The query or queries to execute.
     * @return [Any]     
     */
    @JvmOverloads
    suspend fun mutation(
		query: Any
	): Any {
        val path = "/graphql/mutation"
        val params = mutableMapOf<String, Any?>(
            "query" to query
        )
        val headers = mutableMapOf(
            "x-sdk-graphql" to "true",
            "content-type" to "application/json"
        )
        val converter: (Any) -> Any = {
            it
        }
        return client.call(
            "POST",
            path,
            headers,
            params,
            responseType = Any::class.java,
            converter,
        )
    }
    
}