package br.dev.santi.patterns.location.adapter.out.persistence.repository

import br.dev.santi.patterns.location.adapter.out.persistence.entity.CityJpaEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CityRepository: CrudRepository<CityJpaEntity, Int> {
}