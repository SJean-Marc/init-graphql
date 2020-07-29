package fr.prez.graphql.dto

import com.expediagroup.graphql.annotations.GraphQLName

@GraphQLName("Escalier")
open class EscalierQl(
    var id: Long? = null,
    var ref: String? = null
){
    constructor() : this(null,null)
}
