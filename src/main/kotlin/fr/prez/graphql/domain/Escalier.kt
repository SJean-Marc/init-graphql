package fr.prez.graphql.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "t_escalier_esc")
class Escalier {
    @Id
    var id: Long? = null

    @Column(name = "ref", nullable = false)
    var ref: String? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bat_id", referencedColumnName = "id")
    var batiment: Batiment? = null

    @OneToMany(mappedBy = "escalier")
    var etages: MutableList<Etage>? = null

}

