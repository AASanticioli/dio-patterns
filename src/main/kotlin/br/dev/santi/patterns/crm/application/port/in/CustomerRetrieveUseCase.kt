package br.dev.santi.patterns.crm.application.port.`in`

import br.dev.santi.patterns.crm.domain.Customer

interface CustomerRetrieveUseCase {
    fun retrieveByFederalIdentification(federalIdentification: String): Customer

    fun retrieveByName(name: String): List<Customer>

    fun retrieveByExpendedValue(min: Double = 0.0, max: Double = Double.MAX_VALUE): List<Customer>
}