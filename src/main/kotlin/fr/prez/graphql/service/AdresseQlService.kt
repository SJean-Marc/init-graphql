package fr.prez.graphql.service

import fr.prez.graphql.domain.Adresse
import fr.prez.graphql.dto.AdresseQl
import fr.prez.graphql.dto.BatimentQl
import fr.prez.graphql.mapper.Mapper
import fr.prez.graphql.repository.AdresseRepository
import fr.prez.graphql.repository.BatimentRepository
import org.mapstruct.factory.Mappers
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.time.Duration

@Service
class AdresseQlService(@Autowired val adresseRepository: AdresseRepository) {

    val mapper = Mappers.getMapper(Mapper::class.java)

    fun save(newAdr: String) : List<AdresseQl> {
        val adr = Adresse()
        adr.libelle = newAdr

        adresseRepository.save(adr)

        return adresseRepository.findAll().mapNotNull { mapper.toAdresseQl(it) }.toList()
    }

    fun last() : Flux<AdresseQl> {
        return Flux.interval(Duration.ofSeconds(1)).flatMap {
            val adresse = adresseRepository.findTopByOrderByIdDesc()?.let { mapper.toAdresseQl(it) }
            Mono.justOrEmpty(adresse)
        }
    }
}
