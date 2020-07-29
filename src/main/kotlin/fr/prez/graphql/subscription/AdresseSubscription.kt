package fr.prez.graphql.subscription

import com.expediagroup.graphql.annotations.GraphQLDescription
import com.expediagroup.graphql.spring.operations.Subscription
import fr.prez.graphql.dto.AdresseQl
import fr.prez.graphql.service.AdresseQlService
import org.springframework.stereotype.Component
import reactor.core.publisher.Flux

@Component
class AdresseSubscription(
        val adresseQlService: AdresseQlService) : Subscription {

    @GraphQLDescription("Each 15s return the last adresse on the database")
    fun last(): Flux<AdresseQl> {
        return adresseQlService.last()
    }

    @GraphQLDescription("Return an adresse containing the content input when available")
    fun firstWith(content : String): Flux<AdresseQl> {
        return adresseQlService.firstWith(content)
    }
}
