package fr.prez.graphql.repository

import fr.prez.graphql.domain.Adresse
import fr.prez.graphql.domain.Batiment
import org.springframework.data.jpa.repository.JpaRepository

interface AdresseRepository:
        JpaRepository<Adresse, Long> {

}
