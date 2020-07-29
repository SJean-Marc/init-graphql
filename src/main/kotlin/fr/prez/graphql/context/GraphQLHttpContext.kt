package fr.prez.graphql.context

import com.expediagroup.graphql.execution.GraphQLContext
import com.expediagroup.graphql.spring.execution.GraphQLContextFactory
import org.springframework.http.server.reactive.ServerHttpRequest
import org.springframework.http.server.reactive.ServerHttpResponse
import org.springframework.stereotype.Component

class GraphQLHttpContext(val token: String) : GraphQLContext {

}


@Component
class GraphQLHttpContextFactory(): GraphQLContextFactory<GraphQLHttpContext> {
    override suspend fun generateContext(
            request: ServerHttpRequest,
            response: ServerHttpResponse
    ): GraphQLHttpContext {
        return GraphQLHttpContext(
                token = request.headers.getFirst("access_token") ?: "NONE"
        )

    }
}
