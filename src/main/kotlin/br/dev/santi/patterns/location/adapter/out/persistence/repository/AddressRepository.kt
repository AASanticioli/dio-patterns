package br.dev.santi.patterns.location.adapter.out.persistence.repository

import br.dev.santi.patterns.location.adapter.out.persistence.entity.AddressJpaEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface AddressRepository: CrudRepository<AddressJpaEntity, Long> {
}