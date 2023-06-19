package br.dev.santi.patterns.location.adapter.out.persistence.repository

import br.dev.santi.patterns.location.adapter.out.persistence.entity.CepJpaEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CepRepository: CrudRepository<CepJpaEntity, Long> {
}