package br.tqigmpinheiro.com.crudpix.controller

import br.tqigmpinheiro.com.crudpix.entities.CustomersEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController //avisa ao spring que esse é um controlador rest
@RequestMapping("customer") //Defino a rota para esse endpoint
class CustomerController {

    @GetMapping
    fun getCustomers(): CustomersEntity { //retorna a lista com todos os customers
        return CustomersEntity("1".toInt(),"gabriel","gabriel@tqi.com.br","08746033742".toInt(),"27995068399".toInt())
    }

    @GetMapping("/1")
    fun getCustomer(): String { // retorna um customer específico
        return "specific customer"
    }

    @PostMapping
    fun insertCustomer(): String {
        return "insert customer"
    }

    @PutMapping("/1")
    fun updateCustomer(): String {
        return "update customer"
    }

    @DeleteMapping("/1")
    fun deleteCustomer(): String {
        return "delete customer"
    }
}