package br.dev.santi.patterns.personal.domain

import br.dev.santi.patterns.location.domain.Address

 data class Person(
     val type: LegalType,
     val federalIdentification: String,
     val name: String,
     val address: Address
)
