package fr.prez.graphql.execution

import com.expediagroup.graphql.spring.execution.ApolloSubscriptionHooks
import fr.prez.graphql.context.MyGraphQLContext
import kotlinx.coroutines.reactor.mono
import org.springframework.web.reactive.socket.WebSocketSession
import reactor.core.publisher.Mono

open class MySubscriptionHooks :
        ApolloSubscriptionHooks {
    override fun onConnect(
            connectionParams: Map<String, String>,
            session: WebSocketSession,
            graphQLContext: Any?
    ): Mono<Unit> = mono {
        val bearer = connectionParams["Authorization"] ?: "none"
        val context = graphQLContext as? MyGraphQLContext
        context?.subscriptionValue = bearer
    }
}
