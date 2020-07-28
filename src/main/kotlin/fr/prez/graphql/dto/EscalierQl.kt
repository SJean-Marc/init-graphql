package fr.prez.graphql.dto

data class EscalierQl(
    var id: Long? = null,
    var ref: String? = null
){
    constructor() : this(null,null)
}
