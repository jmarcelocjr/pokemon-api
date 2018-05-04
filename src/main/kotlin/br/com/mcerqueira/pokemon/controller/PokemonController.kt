package br.com.mcerqueira.pokemon.controller

import br.com.mcerqueira.pokemon.entity.Pokemon
import br.com.mcerqueira.pokemon.entity.Type
import br.com.mcerqueira.pokemon.service.PokemonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/pokemon")
class PokemonController {

    @Autowired
    lateinit var pokemonService: PokemonService

    @GetMapping
    fun findAll(): List<Pokemon> {
        return pokemonService.findAll()
    }

    @GetMapping("/name/{name}")
    fun findByName(@PathVariable("name", required=true) name: String): Pokemon? {
        return pokemonService.findByName(name)
    }

    @GetMapping("/type/{type}")
    fun findByType(@PathVariable("type", required=true) typeName: String): List<Pokemon>? {
        val type = Type(null, typeName )
        return pokemonService.findByType(type)
    }

    @PostMapping
    fun save(@RequestBody pokemon: Pokemon) {
        pokemonService.save(pokemon)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id", required=true) id: String) {
        pokemonService.delete(id)
    }
}