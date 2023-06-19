package br.dev.santi.patterns.crm.application.port.`in`

import br.dev.santi.patterns.crm.domain.Customer

interface CustomerDeleteUseCase {
    fun delete(customer: Customer)
}