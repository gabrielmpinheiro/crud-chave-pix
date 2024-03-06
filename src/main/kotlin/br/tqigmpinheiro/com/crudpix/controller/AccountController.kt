package br.tqigmpinheiro.com.crudpix.controller

import br.tqigmpinheiro.com.crudpix.controller.request.PostAccountRequest
import br.tqigmpinheiro.com.crudpix.controller.request.PutAccountRequest
import br.tqigmpinheiro.com.crudpix.entities.AccountEntity
import br.tqigmpinheiro.com.crudpix.extension.toAccountEntity
import br.tqigmpinheiro.com.crudpix.service.AccountService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("account")
class AccountController(
    var accountService: AccountService
) {

    @GetMapping
    fun getAll(): List<AccountEntity> {
        return accountService.getAll()
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody account: PostAccountRequest) {
        //Account vem pelo corpo da requisição, aqui ele irá ser preenchido por um PostAccountRequest, que é
        //a forma como os dados serão recebidos.
        accountService.create(account.toAccountEntity())
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: Int, @RequestBody account: PutAccountRequest) {
        //Criamos o Put Account Request
        accountService.update(account.toAccountEntity(id))
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Int){
        return accountService.delete(id)
    }
}