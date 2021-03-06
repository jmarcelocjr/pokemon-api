package br.com.mcerqueira.pokemon.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Pokemon(
    @Id var id: String?,
    var name: String,
    var type: Type,
    var pokeball: Pokeball
)