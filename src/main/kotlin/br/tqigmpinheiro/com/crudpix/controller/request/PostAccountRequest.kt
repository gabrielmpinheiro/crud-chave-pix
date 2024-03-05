package br.tqigmpinheiro.com.crudpix.controller.request

/* A data Class Post Account Request é semelhante a Entidade, porém personalizamos e removemos os campos que
* não tem necessidade de aparecer. No caso aqui, ao criar uma nova conta, não iremos enviar o ID, esse será
* gerado automaticamente pelo banco. */

data class PostAccountRequest(
    var banco: String,
    var conta: Int,
    var agencia: Int,
    val customerId: Int
)