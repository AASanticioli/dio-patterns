package br.dev.santi.patterns.location.adapter.out.persistence.entity

import jakarta.persistence.*

@Entity
@Table(name = "addresses", indexes = [Index(columnList = "cep")])
data class AddressJpaEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name="cep")
    val cepJpaEntity: CepJpaEntity,

    @Column(nullable = false)
    val placeNumber: String,

    @Column(nullable = true)
    val complement: String
)
