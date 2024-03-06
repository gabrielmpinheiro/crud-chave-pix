package br.tqigmpinheiro.com.crudpix.extension

import br.tqigmpinheiro.com.crudpix.controller.request.PostAccountRequest
import br.tqigmpinheiro.com.crudpix.controller.request.PostCustomerRequest
import br.tqigmpinheiro.com.crudpix.controller.request.PutAccountRequest
import br.tqigmpinheiro.com.crudpix.controller.request.PutCustomerRequest
import br.tqigmpinheiro.com.crudpix.entities.AccountEntity
import br.tqigmpinheiro.com.crudpix.entities.CustomerEntity

fun PostCustomerRequest.toCustomerEntity(): CustomerEntity {
    return CustomerEntity(nome = this.nome, email = this.email, telefone = this.telefone, cpf = this.cpf)
}

fun PutCustomerRequest.toCustomerEntity(id: Int): CustomerEntity {
    return CustomerEntity(id = id, nome = this.nome, email = this.email, telefone = this.telefone, cpf = this.cpf)
}

fun PostAccountRequest.toAccountEntity(): AccountEntity {
    return AccountEntity(banco = this.banco, conta = this.conta, agencia = this.agencia, customerId = this.customerId)
}

fun PutAccountRequest.toAccountEntity(id: Int): AccountEntity {
    return AccountEntity(id = id, banco = this.banco, conta = this.conta, agencia = this.agencia, customerId = this.customerId)
}