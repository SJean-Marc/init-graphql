package fr.prez.graphql.repository

import fr.prez.graphql.domain.Batiment
import fr.prez.graphql.domain.Escalier
import fr.prez.graphql.domain.Etage
import org.springframework.data.jpa.repository.JpaRepository

interface EtageRepository:
        JpaRepository<Etage, Long> {
    fun findByRef(ref : String) : List<Etage>
}
