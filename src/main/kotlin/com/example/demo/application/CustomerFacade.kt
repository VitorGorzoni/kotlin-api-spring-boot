package com.example.demo.application

import com.example.demo.domain.entity.CustomerEntity
import java.util.*

interface CustomerFacade {
    fun getCustomer(id: Int): Optional<CustomerEntity>
    fun createCustomer(customerEntity: CustomerEntity): CustomerEntity
}
