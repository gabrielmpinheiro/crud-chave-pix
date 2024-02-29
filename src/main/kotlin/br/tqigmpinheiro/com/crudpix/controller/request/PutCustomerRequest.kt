package br.tqigmpinheiro.com.crudpix.controller.request

data class PutCustomerRequest(
    val id: Int,
    var nome: String,
    val email: String,
    val cpf: String,
    val telefone: String) {

}