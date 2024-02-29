package br.tqigmpinheiro.com.crudpix.controller

import br.tqigmpinheiro.com.crudpix.controller.request.PostCustomerRequest
import br.tqigmpinheiro.com.crudpix.controller.request.PutCustomerRequest
import br.tqigmpinheiro.com.crudpix.entities.CustomerEntity
import br.tqigmpinheiro.com.crudpix.extension.toCustomerEntity
import br.tqigmpinheiro.com.crudpix.service.CustomerService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController


/* Nota: Controller não conhece regra de negócio. Ele é apenas uma ponte que recebe as requisições */

@RestController //avisa ao spring que esse é um controlador rest
@RequestMapping("customer") //Defino a rota para esse endpoint
class CustomerController(
    val customerService: CustomerService
) {

    @GetMapping
    fun getAll(): List<CustomerEntity> { //retorna a lista com todos os customers
        return customerService.getAll(null)
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody customer: PostCustomerRequest) {
        customerService.create(customer.toCustomerEntity())
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: Int, @RequestBody customer: PutCustomerRequest) {
        customerService.update(customer.toCustomerEntity(id))
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Int)  {
        customerService.delete(id)
    }
}