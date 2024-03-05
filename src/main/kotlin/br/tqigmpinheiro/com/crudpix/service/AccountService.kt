package br.tqigmpinheiro.com.crudpix.service

import br.tqigmpinheiro.com.crudpix.entities.AccountEntity
import br.tqigmpinheiro.com.crudpix.repository.AccountRepository
import org.springframework.stereotype.Service
import java.lang.Exception

@Service
class AccountService(
    //Faço a conexão com o repositorio de Account.
    var accountRepository: AccountRepository
) {
    fun getAll(): List<AccountEntity> {
        return accountRepository.findAll().toList()
    }

    fun create(account: AccountEntity) {
        accountRepository.save(account)
    }

    fun update(account: AccountEntity) {
        if (!accountRepository.existsById(account.id!!)){
            throw Exception()
        }

        accountRepository.save(account)
    }
    /* orElseThrow: caso não exista o registro por id, ele irá estourar uma exception*/
    fun getAccount(id: Int): AccountEntity {
        return accountRepository.findById(id).orElseThrow()
    }
}