package br.tqigmpinheiro.com.crudpix.extension

import br.tqigmpinheiro.com.crudpix.controller.request.PostCustomerRequest
import br.tqigmpinheiro.com.crudpix.controller.request.PutCustomerRequest
import br.tqigmpinheiro.com.crudpix.entities.CustomerEntity

fun PostCustomerRequest.toCustomerEntity(): CustomerEntity {
    return CustomerEntity(nome = this.nome, email = this.email, telefone = this.telefone, cpf = this.cpf)
}

fun PutCustomerRequest.toCustomerEntity(id: Int): CustomerEntity {
    return CustomerEntity(id = id, nome = this.nome, email = this.email, telefone = this.telefone, cpf = this.cpf)
}