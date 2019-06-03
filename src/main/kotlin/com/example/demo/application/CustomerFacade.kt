package com.example.demo.application

import com.example.demo.domain.entity.CustomerEntity

interface CustomerFacade {
    fun getCustomer(id: String): CustomerEntity
}
