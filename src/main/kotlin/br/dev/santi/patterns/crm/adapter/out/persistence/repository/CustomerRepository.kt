package br.dev.santi.patterns.crm.adapter.out.persistence.repository

import br.dev.santi.patterns.crm.adapter.out.persistence.entity.CustomerJpaEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: CrudRepository<CustomerJpaEntity, Long> {
}