package fr.prez.graphql.domain

import org.hibernate.annotations.Cache
import org.hibernate.annotations.CacheConcurrencyStrategy
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.OneToMany
import javax.persistence.Table


@Entity
@Table(name = "t_batiment")
class Batiment {
    @Id
    @Column(name="id")
    var id: Long? = null

    @Column(name = "ref", nullable = false)
    lateinit var ref: String

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "adr_id", referencedColumnName = "id")
    var adresse: Adresse? = null

    @OneToMany(mappedBy = "batiment", fetch = FetchType.LAZY)
    var escaliers: MutableList<Escalier>? = null


}


