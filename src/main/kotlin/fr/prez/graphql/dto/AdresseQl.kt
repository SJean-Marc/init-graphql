package fr.prez.graphql.dto

data class AdresseQl (
        var id: Long?,
        var libelle: String? = null
) {
    constructor() : this(null,null)
}
