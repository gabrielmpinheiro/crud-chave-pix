package br.tqigmpinheiro.com.crudpix.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.springframework.context.annotation.Primary

@Entity(name="accounts")
data class AccountEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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