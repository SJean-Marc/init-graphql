package fr.prez.graphql.domain

import fr.prez.graphql.domain.Escalier
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table


@Entity
@Table(name = "t_etage_eta")
class Etage {
    @Id
    var id: Long? = null

    @Column(name = "ref", nullable = false)
    var ref: String? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "esc_id", referencedColumnName = "id")
    var escalier: Escalier? = null

}

