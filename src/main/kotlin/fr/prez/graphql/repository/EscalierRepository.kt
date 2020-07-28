package fr.prez.graphql.repository

import fr.prez.graphql.domain.Batiment
import fr.prez.graphql.domain.Escalier
import org.springframework.data.jpa.repository.JpaRepository

interface EscalierRepository:
        JpaRepository<Escalier, Long> {
    fun findByRef(ref : String) : List<Escalier>

    fun findByBatiment_IdAndRef(idBat: Long, ref: String) : List<Escalier>
}
