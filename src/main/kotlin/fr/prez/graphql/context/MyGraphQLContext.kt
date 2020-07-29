package fr.prez.graphql.context

import com.expediagroup.graphql.execution.GraphQLContext
import org.springframework.http.server.ServerHttpRequest
import org.springframework.http.server.ServerHttpResponse

class MyGraphQLContext(val myCustomValue: String, val request: ServerHttpRequest, val response: ServerHttpResponse, var subscriptionValue: String? = null) : GraphQLContext

