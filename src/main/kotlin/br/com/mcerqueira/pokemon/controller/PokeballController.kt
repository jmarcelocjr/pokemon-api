package br.com.mcerqueira.pokemon.controller

import br.com.mcerqueira.pokemon.entity.Pokeball
import br.com.mcerqueira.pokemon.service.PokeballService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/pokeball")
class PokeballController {

    @Autowired
    lateinit var pokeballService: PokeballService

    @GetMapping()
    fun findAll(): List<Pokeball>? {
        return pokeballService.findAll()
    }
}