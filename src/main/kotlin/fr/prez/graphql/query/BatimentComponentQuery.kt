package fr.prez.graphql.query

import com.expediagroup.graphql.annotations.GraphQLIgnore
import com.expediagroup.graphql.annotations.GraphQLName
import fr.prez.graphql.dto.BatimentQl
import fr.prez.graphql.service.EscalierQlService
import graphql.schema.DataFetchingEnvironment
import org.springframework.beans.BeanUtils
import org.springframework.beans.factory.BeanFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

@Component
@Scope("prototype")
@GraphQLName("Batiment")
class BatimentComponentQuery(@GraphQLIgnore val batimentQl: BatimentQl,
                             @GraphQLIgnore val beanFactory: BeanFactory) : BatimentQl() {

    @Autowired
    @GraphQLIgnore
    lateinit var escalierQlService: EscalierQlService


    init {
        BeanUtils.copyProperties(batimentQl, this)
    }

    fun escalier(refEscalier: String?): List<EscalierComponentQuery>? {
        return escalierQlService
                .findByBatimentAndRef(this, refEscalier)
                .map {
                    beanFactory.getBean(EscalierComponentQuery::class.java, it)
                }
    }
}
