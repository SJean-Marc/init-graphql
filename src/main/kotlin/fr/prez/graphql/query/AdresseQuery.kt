package fr.prez.graphql.query

import com.expediagroup.graphql.annotations.GraphQLIgnore
import com.expediagroup.graphql.spring.operations.Query
import fr.prez.graphql.dto.AdresseQl
import fr.prez.graphql.dto.BatimentQl
import fr.prez.graphql.service.AdresseQlService
import fr.prez.graphql.service.BatimentQlService
import graphql.schema.DataFetchingEnvironment
import org.springframework.beans.factory.BeanFactory
import org.springframework.beans.factory.BeanFactoryAware
import org.springframework.stereotype.Component


@Component
class AdresseQuery(val adresseQlService: AdresseQlService) : Query {

    fun adresses() =  adresseQlService.all()

}
