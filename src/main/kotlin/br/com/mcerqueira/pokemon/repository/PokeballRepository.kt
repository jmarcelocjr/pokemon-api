package br.com.mcerqueira.pokemon.repository

import br.com.mcerqueira.pokemon.entity.Pokeball
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PokeballRepository : MongoRepository<Pokeball, String>