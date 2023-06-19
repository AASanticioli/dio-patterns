package br.dev.santi.patterns.location.adapter.out.persistence.entity

import jakarta.persistence.*

@Entity
@Table(name = "cities", indexes = [Index(columnList = "state")])
class CityJpaEntity (
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    @Column(nullable = false)
    val name: String,

    @Column(nullable = false)
    val state: String
)