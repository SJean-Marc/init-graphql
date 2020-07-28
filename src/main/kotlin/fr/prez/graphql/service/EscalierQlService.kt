package fr.prez.graphql.service

import fr.prez.graphql.dto.BatimentQl
import fr.prez.graphql.dto.EscalierQl
import fr.prez.graphql.dto.EtageQl
import fr.prez.graphql.mapper.Mapper
import fr.prez.graphql.repository.BatimentRepository
import fr.prez.graphql.repository.EscalierRepository
import org.mapstruct.factory.Mappers
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class EscalierQlService(@Autowired val escalierRepository: EscalierRepository,
                        @Autowired val batimentRepository: BatimentRepository) {
    val mapper = Mappers.getMapper(Mapper::class.java)

    fun findByRef(ref: String?) : List<EscalierQl> {
        val bats = if(ref == null) escalierRepository.findAll() else escalierRepository.findByRef(ref)
        return bats.mapNotNull { mapper.toEscalierQl(it) }.toList()
    }

    @Transactional
    fun findByBatimentAndRef(batimentQl: BatimentQl, ref: String?) : List<EscalierQl> {
        return when {
            ref == null -> batimentRepository.findById(batimentQl.id!!).get().escaliers.orEmpty()
            else -> escalierRepository.findByBatiment_IdAndRef(batimentQl.id!!, ref)
        }.mapNotNull { mapper.toEscalierQl(it) }.toList()
    }

}
