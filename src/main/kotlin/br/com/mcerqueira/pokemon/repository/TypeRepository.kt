package br.com.mcerqueira.pokemon.repository

import br.com.mcerqueira.pokemon.entity.Type
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface TypeRepository : MongoRepository<Type, String>