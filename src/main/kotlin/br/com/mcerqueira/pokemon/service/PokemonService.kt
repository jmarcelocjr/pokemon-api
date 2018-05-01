package br.com.mcerqueira.pokemon.service

import br.com.mcerqueira.pokemon.entity.Pokeball
import br.com.mcerqueira.pokemon.entity.Pokemon
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

    fun findByPokeball(pokeball: Pokeball): List<Pokemon>? {
        return pokemonRepository.findByPokeball(pokeball)
    }

    fun save(pokemon: Pokemon) {
        pokemonRepository.save(pokemon)
    }

}
