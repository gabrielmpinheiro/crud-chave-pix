package br.tqigmpinheiro.com.crudpix.entities

import jakarta.persistence.*

@Entity(name = "customer")
data class CustomerEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,

    @Column
    var nome: String,

    @Column
    var email: String,

    @Column
    var cpf: String,

    @Column
    var telefone: String,

)