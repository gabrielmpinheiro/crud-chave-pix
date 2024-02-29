package br.tqigmpinheiro.com.crudpix.controller.request

data class PostCustomerRequest(
    var nome: String,
    val email: String,
    val cpf: String,
    val telefone: String,
)