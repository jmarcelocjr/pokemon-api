package br.com.mcerqueira.pokemon.repository

import br.com.mcerqueira.pokemon.entity.Pokeball
import br.com.mcerqueira.pokemon.entity.Pokemon
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PokemonRepository : MongoRepository<Pokemon, String> {

    fun findByNameIgnoreCase(name: String): Pokemon?
    fun findByType(type: String): List<Pokemon>?
}