package br.dev.santi.patterns.crm.adapter.out.persistence.entity

import br.dev.santi.patterns.personal.out.persistence.entity.PersonJpaEntity
import jakarta.persistence.*

@Entity
@Table(name = "customers")
data class CustomerJpaEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @ManyToOne(optional = false, fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
    @JoinColumn(name="person_id")
    val personJpaEntity: PersonJpaEntity,

    @Column(nullable = false)
    val expendedValue : Double = 0.0
)