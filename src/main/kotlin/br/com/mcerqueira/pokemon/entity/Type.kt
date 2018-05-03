package br.com.mcerqueira.pokemon.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Type(
        @Id var id: String?,
        var name: String
)