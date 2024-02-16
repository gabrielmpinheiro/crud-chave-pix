package br.tqigmpinheiro.com.crudpix.entities

import jakarta.persistence.*
import org.hibernate.Hibernate

@Entity(name = "customers")
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