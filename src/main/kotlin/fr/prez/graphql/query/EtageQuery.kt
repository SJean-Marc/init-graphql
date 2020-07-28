package fr.prez.graphql.query

import com.expediagroup.graphql.spring.operations.Query
import fr.prez.graphql.domain.Batiment
import fr.prez.graphql.dto.BatimentQl
import fr.prez.graphql.dto.EtageQl
import fr.prez.graphql.repository.BatimentRepository
import fr.prez.graphql.service.BatimentQlService
import fr.prez.graphql.service.EtageQlService
import graphql.schema.DataFetchingEnvironment
import org.springframework.stereotype.Component


@Component
class EtageQuery(val etageQlService: EtageQlService) : Query {

    fun etages(ref: String?, environment: DataFetchingEnvironment) : List<EtageQl> {
        return etageQlService.findByRef(ref)
    }

}
