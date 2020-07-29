package fr.prez.graphql.repository

import fr.prez.graphql.domain.Adresse
import fr.prez.graphql.domain.Batiment
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AdresseRepository:
        JpaRepository<Adresse, Long> {

    fun findTopByOrderByIdDesc() : Adresse

}
