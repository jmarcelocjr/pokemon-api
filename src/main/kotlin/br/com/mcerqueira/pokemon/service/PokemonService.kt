package br.com.mcerqueira.pokemon.service

import br.com.mcerqueira.pokemon.entity.Pokemon
import br.com.mcerqueira.pokemon.entity.Type
import br.com.mcerqueira.pokemon.repository.PokemonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PokemonService {

    @Autowired
    lateinit var pokemonRepository: PokemonRepository

    fun findAll(): List<Pokemon> {
        return pokemonRepository.findAll()
    }

    fun findByName(name: String): Pokemon? {
        return pokemonRepository.findByNameIgnoreCase(name)
    }

    fun findByType(type: Type): List<Pokemon>? {
        return pokemonRepository.findByType(type)
    }

    fun save(pokemon: Pokemon) {
        pokemonRepository.save(pokemon)
    }

}
