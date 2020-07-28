package fr.prez.graphql.service

import fr.prez.graphql.dto.BatimentQl
import fr.prez.graphql.dto.EscalierQl
import fr.prez.graphql.dto.EtageQl
import fr.prez.graphql.mapper.Mapper
import fr.prez.graphql.repository.EscalierRepository
import fr.prez.graphql.repository.EtageRepository
import org.mapstruct.factory.Mappers
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EtageQlService(@Autowired val etageRepository: EtageRepository) {
    val mapper = Mappers.getMapper(Mapper::class.java)

    fun findByRef(ref: String?) : List<EtageQl> {
        val bats = if(ref == null) etageRepository.findAll() else etageRepository.findByRef(ref)
        return bats.mapNotNull { mapper.toEtageQl(it) }.toList()
    }

}
