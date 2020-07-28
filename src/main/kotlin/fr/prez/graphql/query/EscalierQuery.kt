package fr.prez.graphql.query

import com.expediagroup.graphql.spring.operations.Query
import fr.prez.graphql.domain.Batiment
import fr.prez.graphql.dto.BatimentQl
import fr.prez.graphql.dto.EscalierQl
import fr.prez.graphql.dto.EtageQl
import fr.prez.graphql.repository.BatimentRepository
import fr.prez.graphql.service.BatimentQlService
import fr.prez.graphql.service.EscalierQlService
import fr.prez.graphql.service.EtageQlService
import graphql.schema.DataFetchingEnvironment
import org.springframework.stereotype.Component


@Component
class EscalierQuery(val escalierQlService: EscalierQlService) : Query {

    fun etages(ref: String?, environment: DataFetchingEnvironment) : List<EscalierQl> {
        return escalierQlService.findByRef(ref)
    }

}
