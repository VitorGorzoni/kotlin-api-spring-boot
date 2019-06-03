package com.example.demo.repository

import com.example.demo.domain.entity.CustomerEntity
import org.springframework.stereotype.Repository

@Repository
class CustomerRepository  {

    fun getCustomer(id: String): CustomerEntity {
        val customer: CustomerEntity = CustomerEntity()

        customer.name = "Vitor"
        customer.email = "vitorgorzoni.contato@gmail.com"

        return customer
    }
}
