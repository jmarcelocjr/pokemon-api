package br.com.mcerqueira.pokemon.service

import br.com.mcerqueira.pokemon.entity.Pokeball
import br.com.mcerqueira.pokemon.repository.PokeballRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PokeballService {

    @Autowired
    lateinit var pokeballRepository: PokeballRepository

    fun findAll(): List<Pokeball>? {
        return pokeballRepository.findAll()
    }
}