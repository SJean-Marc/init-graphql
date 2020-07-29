package fr.prez.graphql.dto

import com.expediagroup.graphql.annotations.GraphQLName

@GraphQLName("Batiment")
open class BatimentQl(
    var id: Long? = null,
    var ref: String? = null
) {
    constructor() : this(null,null)
}
