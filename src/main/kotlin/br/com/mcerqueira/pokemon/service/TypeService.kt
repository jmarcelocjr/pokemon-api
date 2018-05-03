package br.com.mcerqueira.pokemon.service

import br.com.mcerqueira.pokemon.entity.Type
import br.com.mcerqueira.pokemon.repository.TypeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TypeService {

    @Autowired
    lateinit var typeRepository: TypeRepository

    fun findAll(): List<Type>? {
        return typeRepository.findAll()
    }
}