package fr.prez.graphql.query

import com.expediagroup.graphql.spring.operations.Query
import fr.prez.graphql.domain.Batiment
import fr.prez.graphql.dto.BatimentQl
import fr.prez.graphql.repository.BatimentRepository
import fr.prez.graphql.service.BatimentQlService
import graphql.schema.DataFetchingEnvironment
import org.springframework.stereotype.Component


@Component
class BatimentQuery(val batimentQlService: BatimentQlService) : Query {

    fun batiments(ref: String?, environment: DataFetchingEnvironment) : List<BatimentQl> {
        return batimentQlService.findByRef(ref)
    }


}
