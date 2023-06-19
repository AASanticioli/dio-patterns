package br.dev.santi.patterns.crm.domain

import br.dev.santi.patterns.personal.domain.Person

data class Customer(
    val personalData: Person,
    val expendedValue : Double = 0.0
)
