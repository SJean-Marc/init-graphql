package fr.prez.graphql.mapper

import fr.prez.graphql.domain.Adresse
import fr.prez.graphql.domain.Batiment
import fr.prez.graphql.domain.Escalier
import fr.prez.graphql.domain.Etage
import fr.prez.graphql.dto.AdresseQl
import fr.prez.graphql.dto.BatimentQl
import fr.prez.graphql.dto.EscalierQl
import fr.prez.graphql.dto.EtageQl
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper
public interface Mapper {
    fun toAdresseQl(adresse : Adresse) : AdresseQl?
    fun toBatimentQl(batiment : Batiment) : BatimentQl?
    fun toEscalierQl(escalier: Escalier) : EscalierQl?
    fun toEtageQl(etage: Etage) : EtageQl?
}
