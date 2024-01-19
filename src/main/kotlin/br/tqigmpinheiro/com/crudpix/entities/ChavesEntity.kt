package br.tqigmpinheiro.com.crudpix.entities

import jakarta.persistence.*

@Entity(name = "Chaves")
data class ChavesEntity(
    @Id
    val id: Int,

    @Column(name = "customer_id")
    val userId: Int,

    @Column
    val chave: String,


    @Column(name = "account_id")
    val contaId: Int,
)