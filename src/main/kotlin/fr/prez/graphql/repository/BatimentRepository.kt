package fr.prez.graphql.repository

import fr.prez.graphql.domain.Batiment
import org.springframework.data.jpa.repository.JpaRepository

interface BatimentRepository:
        JpaRepository<Batiment, Long> {

    fun findByRef(ref : String) : List<Batiment>
}
