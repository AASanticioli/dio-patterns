package br.dev.santi.patterns.personal.out.persistence.entity

import br.dev.santi.patterns.location.adapter.out.persistence.entity.AddressJpaEntity
import jakarta.persistence.*

@Entity
@Table(
    name = "persons",
    indexes = [
        Index(columnList = "federal_identification"),
        Index(columnList = "name")
    ]
)
data class PersonJpaEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(nullable = false, name = "federal_identification")
    val federalIdentification: String,

    @Column(nullable = false)
    val name: String,

    @ManyToOne
    val addressJpaEntity: AddressJpaEntity
)
