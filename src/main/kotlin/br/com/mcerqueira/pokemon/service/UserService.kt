package br.com.mcerqueira.pokemon.service

import br.com.mcerqueira.pokemon.entity.User
import br.com.mcerqueira.pokemon.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    lateinit var userRepository: UserRepository

    fun findByLoginAndPassword(login: String, password: String): User? {
        return userRepository.findByLoginAndPassword(login, password)
    }

    fun save(user: User) {
        userRepository.save(user)
    }

}
