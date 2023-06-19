package br.dev.santi.patterns.location.domain

data class Cep(
    val code: String,
    val street: String,
    val complement: String,
    val neighborhood: String,
    val city: City
)
