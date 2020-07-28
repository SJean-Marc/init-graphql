package fr.prez.graphql.query

import com.expediagroup.graphql.annotations.GraphQLIgnore
import com.expediagroup.graphql.annotations.GraphQLName
import fr.prez.graphql.dto.EscalierQl
import fr.prez.graphql.dto.EtageQl
import fr.prez.graphql.service.EtageQlService
import graphql.schema.DataFetchingEnvironment
import org.springframework.beans.BeanUtils
import org.springframework.beans.factory.BeanFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

@Component
@Scope("prototype")
@GraphQLName("Escalier")
class EscalierComponentQuery(@GraphQLIgnore val escalierQl: EscalierQl) : EscalierQl() {

    @Autowired
    @GraphQLIgnore
    lateinit var etageQlService: EtageQlService

    init {
        BeanUtils.copyProperties(escalierQl, this)
    }

    suspend fun etage(refEtage: String?,
                      environment: DataFetchingEnvironment): List<EtageQl>? {
        return etageQlService
                .findByEscalierAndRef(this, refEtage)

    }

}
