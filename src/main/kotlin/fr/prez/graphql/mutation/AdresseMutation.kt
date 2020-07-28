package fr.prez.graphql.mutation

import com.expediagroup.graphql.annotations.GraphQLDescription
import com.expediagroup.graphql.spring.operations.Mutation
import fr.prez.graphql.dto.AdresseQl
import fr.prez.graphql.repository.AdresseRepository
import fr.prez.graphql.service.AdresseQlService
import org.apache.commons.lang3.mutable.Mutable
import org.springframework.stereotype.Component


@Component
class AdresseMutation(val adresseQlService: AdresseQlService) : Mutation {

    private val data = mutableListOf<String>()

    @GraphQLDescription("add new adresse and return adresses in database")
    fun adresse(entry: String): List<AdresseQl> {
        return adresseQlService.save(entry)
    }

    @GraphQLDescription("stash data and print all stashed data")
    fun stash(entry: String): List<String> {
        data.add(entry)
        return data
    }

    @GraphQLDescription("clear stash data")
    fun clearStash(): List<String> {
        data.clear()
        return data
    }


}
