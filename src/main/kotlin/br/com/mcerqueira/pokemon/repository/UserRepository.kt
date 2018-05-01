package br.com.mcerqueira.pokemon.repository

import br.com.mcerqueira.pokemon.entity.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : MongoRepository<User, String> {

    fun findByLoginAndPassword(login: String, password: String): User?
}