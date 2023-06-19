package br.dev.santi.patterns.personal.out.persistence.repository

import br.dev.santi.patterns.personal.out.persistence.entity.PersonJpaEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepository : CrudRepository<PersonJpaEntity, Long> {
}