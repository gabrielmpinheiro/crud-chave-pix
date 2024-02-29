package br.tqigmpinheiro.com.crudpix.repository

import br.tqigmpinheiro.com.crudpix.entities.CustomerEntity
import org.springframework.data.repository.CrudRepository

//Para implementar o repositório, basta criarmos uma interface que extende CrudRepository, passando qual é a entity e também o tipo do Id
interface CustomerRepository: CrudRepository<CustomerEntity, Int> {

    //personalizando métodos para o repositorio
    fun findByNomeContaining(nome: String): List<CustomerEntity>

}