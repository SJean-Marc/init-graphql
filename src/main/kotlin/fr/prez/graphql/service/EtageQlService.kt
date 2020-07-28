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
import org.springframework.transaction.annotation.Transactional

@Service
class EtageQlService(@Autowired val etageRepository: EtageRepository,
                     @Autowired val escalierRepository: EscalierRepository) {
    val mapper = Mappers.getMapper(Mapper::class.java)

    fun findByRef(ref: String?) : List<EtageQl> {
        val bats = if(ref == null) etageRepository.findAll() else etageRepository.findByRef(ref)
        return bats.mapNotNull { mapper.toEtageQl(it) }.toList()
    }

    @Transactional
    fun findByEscalierAndRef(escalierQl: EscalierQl, ref: String?) : List<EtageQl> {
        return when {
            escalierQl == null  -> emptyList()
            ref == null -> escalierRepository.findById(escalierQl.id!!).get().etages.orEmpty()
            else -> etageRepository.findByEscalier_IdAndAndRef(escalierQl.id!!, ref)
        }.mapNotNull { mapper.toEtageQl(it) }.toList()
    }

}
