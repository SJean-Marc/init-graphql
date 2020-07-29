package fr.prez.graphql.dto

import com.expediagroup.graphql.annotations.GraphQLName

@GraphQLName("Adresse")
open class AdresseQl (
        var id: Long?,
        var libelle: String? = null
) {
    constructor() : this(null,null)
}
