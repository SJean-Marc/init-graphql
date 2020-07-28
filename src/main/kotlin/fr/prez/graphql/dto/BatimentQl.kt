package fr.prez.graphql.dto

data class BatimentQl(
    var id: Long? = null,
    var ref: String? = null
) {
    constructor() : this(null,null)
}
