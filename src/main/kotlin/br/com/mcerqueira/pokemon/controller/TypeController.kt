package br.com.mcerqueira.pokemon.controller

import br.com.mcerqueira.pokemon.entity.Type
import br.com.mcerqueira.pokemon.service.TypeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/type")
class TypeController {

    @Autowired
    lateinit var typeService: TypeService

    @GetMapping()
    fun findAll(): List<Type>? {
        return typeService.findAll()
    }
}