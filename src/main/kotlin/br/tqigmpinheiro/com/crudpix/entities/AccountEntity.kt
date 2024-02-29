package br.tqigmpinheiro.com.crudpix.entities


data class AccountEntity(

    val id: String,
    var banco: String,
    var conta: Int,
    var agencia: Int,
    val customerId: Int
)