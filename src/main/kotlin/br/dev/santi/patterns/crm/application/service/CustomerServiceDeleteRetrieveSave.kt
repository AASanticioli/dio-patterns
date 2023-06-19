package br.dev.santi.patterns.crm.application.service

import br.dev.santi.patterns.crm.application.port.`in`.CustomerDeleteUseCase
import br.dev.santi.patterns.crm.application.port.`in`.CustomerRetrieveUseCase
import br.dev.santi.patterns.crm.application.port.`in`.CustomerSaveUseCase
import br.dev.santi.patterns.crm.domain.Customer

class CustomerServiceDeleteRetrieveSave: CustomerDeleteUseCase, CustomerSaveUseCase, CustomerRetrieveUseCase {
    override fun delete(customer: Customer) {
        TODO("Not yet implemented")
    }

    override fun retrieveByFederalIdentification(federalIdentification: String): Customer {
        TODO("Not yet implemented")
    }

    override fun retrieveByName(name: String): List<Customer> {
        TODO("Not yet implemented")
    }

    override fun retrieveByExpendedValue(min: Double, max: Double): List<Customer> {
        TODO("Not yet implemented")
    }

    override fun save(customer: Customer): Customer {
        TODO("Not yet implemented")
    }
}