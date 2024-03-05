package br.tqigmpinheiro.com.crudpix.controller.request

/* Mesma lógica do Post. Aqui no put, iremos atualizar um registro. Então nesse caso iremos precisar passar todos os
* campos, então fizemos a montagem do request da forma como está abaixo: */
data class PutAccountRequest (
    val id: Int,
    var banco: String,
    var conta: Int,
    var agencia: Int,
    val customerId: Int
)