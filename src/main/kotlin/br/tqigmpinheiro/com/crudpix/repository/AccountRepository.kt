package br.tqigmpinheiro.com.crudpix.repository

import br.tqigmpinheiro.com.crudpix.entities.AccountEntity
import org.springframework.data.repository.CrudRepository

/* Implementação do repositorio: Crie uma nova interface que extende CrudRepository. Os parametros são: 1) a entidade e 2) o tipo do Id */
interface AccountRepository: CrudRepository<AccountEntity, Int> {
}