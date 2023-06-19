package br.dev.santi.patterns.location.domain

data class Address(
    val cep: Cep,
    val placeNumber: String,
    val complement: String
)