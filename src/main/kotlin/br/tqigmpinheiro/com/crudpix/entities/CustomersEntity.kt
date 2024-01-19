package br.tqigmpinheiro.com.crudpix.entities

import jakarta.persistence.*

@Entity(name = "Customers")
data class CustomersEntity(
    @Id
    val id: Int,

    @Column
    var nome: String,

    @Column
    val email: String,

    @Column
    val cpf: Int,

    @Column
    val telefone: Int,

)