package fr.prez.graphql.query

import com.expediagroup.graphql.annotations.GraphQLIgnore
import com.expediagroup.graphql.spring.operations.Query
import fr.prez.graphql.dto.EscalierQl
import fr.prez.graphql.service.EscalierQlService
import graphql.schema.DataFetchingEnvironment
import org.springframework.beans.factory.BeanFactory
import org.springframework.beans.factory.BeanFactoryAware
import org.springframework.stereotype.Component


@Component
class EscalierQuery(val escalierQlService: EscalierQlService) : Query, BeanFactoryAware {
    private lateinit var beanFactory: BeanFactory

    @GraphQLIgnore
    override fun setBeanFactory(beanFactory: BeanFactory) {
        this.beanFactory = beanFactory
    }

    fun escaliers(ref: String?, environment: DataFetchingEnvironment) : List<EscalierComponentQuery> {
        return escalierQlService.findByRef(ref)
                .map { beanFactory.getBean(EscalierComponentQuery::class.java, it)
        }
    }

}
