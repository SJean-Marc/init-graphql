package fr.prez.graphql.dto

import com.expediagroup.graphql.annotations.GraphQLName

@GraphQLName("Etage")
open class EtageQl(
    var id: Long? = null,
    var ref: String? = null
){
    constructor(): this(null, null)
}
