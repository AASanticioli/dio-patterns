package br.dev.santi.patterns.crm.adapter.out.persistence.entity

import br.dev.santi.patterns.personal.out.persistence.entity.PersonJpaEntity
import jakarta.persistence.*

@Entity
@Table(name = "customers", indexes = [Index(columnList = "person_id")])
data class CustomerJpaEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @OneToOne(optional = false, fetch = FetchType.EAGER)
    @Column(name = "person_id", nullable = false)
    val personJpaEntity: PersonJpaEntity,

    @Column(nullable = false)
    val expendedValue : Double = 0.0
)