package fr.prez.graphql

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.reactive.HandlerMapping
import org.springframework.web.reactive.handler.SimpleUrlHandlerMapping
import org.springframework.web.reactive.socket.WebSocketHandler
import org.springframework.web.reactive.socket.WebSocketMessage
import org.springframework.web.reactive.socket.WebSocketSession
import org.springframework.web.reactive.socket.client.ReactorNettyWebSocketClient
import org.springframework.web.reactive.socket.client.WebSocketClient
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker
import reactor.core.publisher.Mono
import java.net.URI
import java.time.Duration
import java.util.HashMap


@SpringBootApplication
class GraphqlApplication

fun main(args: Array<String>) {
    runApplication<GraphqlApplication>(*args)

//    val client: WebSocketClient = ReactorNettyWebSocketClient()
//    client.execute(
//            URI.create("ws://localhost:8081/event-emitter")
//    ) { session: WebSocketSession ->
//        session.send(
//                Mono.just(session.textMessage("event-spring-reactive-client-websocket")))
//                .thenMany(session.receive()
//                        .map(WebSocketMessage::getPayloadAsText)
//                        .log())
//                .then()
//    }
//            .block(Duration.ofSeconds(10L))

}

@Autowired
private lateinit var webSocketHandler: WebSocketHandler


@Bean
fun webSocketHandlerMapping(): HandlerMapping? {
    val map: MutableMap<String, WebSocketHandler?> = HashMap()
    map["/event-emitter"] = webSocketHandler
    val handlerMapping = SimpleUrlHandlerMapping()
    handlerMapping.order = 1
    handlerMapping.urlMap = map
    return handlerMapping
}
