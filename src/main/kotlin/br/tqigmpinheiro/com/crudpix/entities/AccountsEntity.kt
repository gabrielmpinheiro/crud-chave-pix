package br.tqigmpinheiro.com.crudpix.entities

import jakarta.persistence.*

@Entity(name = "Accounts")
data class AccountsEntity(
    @Id
    val id: Int,

    @Column
    var banco: String,

    @Column
    var conta: Int,

    @Column
    var agencia: Int,

    @Column(name = "customer_id")
    val customerId: Int
)