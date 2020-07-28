package fr.prez.graphql.mapper

import fr.prez.graphql.domain.Batiment
import fr.prez.graphql.dto.BatimentQl
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper
public interface Mapper {
    fun toBatimentQl(batiment : Batiment) : BatimentQl?
}
