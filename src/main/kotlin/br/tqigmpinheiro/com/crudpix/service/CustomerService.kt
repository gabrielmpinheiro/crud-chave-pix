package br.tqigmpinheiro.com.crudpix.service

import br.tqigmpinheiro.com.crudpix.controller.request.PostCustomerRequest
import br.tqigmpinheiro.com.crudpix.entities.CustomerEntity
import br.tqigmpinheiro.com.crudpix.repository.CustomerRepository
import org.springframework.stereotype.Service
import java.lang.Exception

@Service
class CustomerService(
    val customerRepository: CustomerRepository
) {

    fun getAll(name: String?): List<CustomerEntity> {
        name?.let {
            return customerRepository.findByNomeContaining(name)
        }
        return customerRepository.findAll().toList()
    }

    fun create(customer: CustomerEntity) {
        customerRepository.save(customer)
    }

    fun getCustomer(id: Int): CustomerEntity {
        return customerRepository.findById(id).orElseThrow()
    }

    fun update(customer: CustomerEntity) {
        if (!customerRepository.existsById(customer.id!!)){
            throw Exception()
        }

        customerRepository.save(customer)
    }

    fun delete(id: Int) {
        if (!customerRepository.existsById(id)){
            throw Exception()
        }

        return customerRepository.deleteById(id)
    }
}

