package fr.prez.graphql.query

import com.expediagroup.graphql.annotations.GraphQLIgnore
import com.expediagroup.graphql.spring.operations.Query
import fr.prez.graphql.dto.BatimentQl
import fr.prez.graphql.service.BatimentQlService
import graphql.schema.DataFetchingEnvironment
import org.springframework.beans.factory.BeanFactory
import org.springframework.beans.factory.BeanFactoryAware
import org.springframework.stereotype.Component


@Component
class BatimentQuery(val batimentQlService: BatimentQlService) : Query, BeanFactoryAware {
    private lateinit var beanFactory: BeanFactory

    @GraphQLIgnore
    override fun setBeanFactory(beanFactory: BeanFactory) {
        this.beanFactory = beanFactory
    }

    fun batiments(ref: String?, environment: DataFetchingEnvironment) : List<BatimentComponentQuery> {
        return batimentQlService
                .findByRef(ref)
                .map { beanFactory.getBean(BatimentComponentQuery::class.java, it, beanFactory)
        }
    }

}
