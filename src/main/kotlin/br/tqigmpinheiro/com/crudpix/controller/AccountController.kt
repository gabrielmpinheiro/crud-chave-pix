package br.tqigmpinheiro.com.crudpix.controller

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("account")
class AccountController {

    @GetMapping
    fun getAll() {

    }

    @PostMapping
    fun insert() {

    }

    @PutMapping
    fun update() {

    }

    @DeleteMapping
    fun delete(){

    }
}