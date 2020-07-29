package fr.prez.graphql.subscription

import com.expediagroup.graphql.spring.operations.Subscription
import fr.prez.graphql.domain.Adresse
import fr.prez.graphql.dto.AdresseQl
import fr.prez.graphql.repository.AdresseRepository
import fr.prez.graphql.service.AdresseQlService
import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.time.Duration

@Component
class AdresseSubscription(
        val adresseQlService: AdresseQlService) : Subscription {

    fun last(): Flux<AdresseQl> {
        return adresseQlService.last()
    }
}
