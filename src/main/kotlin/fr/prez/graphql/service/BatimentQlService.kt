package fr.prez.graphql.service

import fr.prez.graphql.dto.BatimentQl
import fr.prez.graphql.mapper.Mapper
import fr.prez.graphql.repository.BatimentRepository
import fr.prez.graphql.repository.EscalierRepository
import org.mapstruct.factory.Mappers
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BatimentQlService(@Autowired val batimentRepository: BatimentRepository) {

    val mapper = Mappers.getMapper(Mapper::class.java)

    fun findByRef(ref: String?) : List<BatimentQl> {
        val bats = if(ref == null) batimentRepository.findAll() else batimentRepository.findByRef(ref)
        return bats.mapNotNull { mapper.toBatimentQl(it) }.toList()
    }
}
