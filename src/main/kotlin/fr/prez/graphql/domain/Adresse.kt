package fr.prez.graphql.domain

import org.hibernate.annotations.Cache
import org.hibernate.annotations.CacheConcurrencyStrategy
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.persistence.Table


@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@Table(name = "t_adresse")
data class Adresse (
        @Id
        var id: Long?,

        @Column(name = "libelle", nullable = true)
        var libelle: String? = null,

        @OneToMany(mappedBy = "adresse", fetch = FetchType.LAZY)
        var batiments: MutableSet<Batiment>? = null
) {
    constructor() : this(null,null,null)
}

