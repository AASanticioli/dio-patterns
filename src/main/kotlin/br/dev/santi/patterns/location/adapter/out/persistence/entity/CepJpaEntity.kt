package br.dev.santi.patterns.location.adapter.out.persistence.entity

import jakarta.persistence.*

@Entity
@Table(name = "cep", indexes = [Index(columnList = "code")])
class CepJpaEntity(
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(unique = true, nullable = false)
    val code: String,

    @Column(nullable = false)
    val street: String,

    val complement: String,

    val neighborhood: String,

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name="city_id")
    val cityJpaEntity: CityJpaEntity
)
