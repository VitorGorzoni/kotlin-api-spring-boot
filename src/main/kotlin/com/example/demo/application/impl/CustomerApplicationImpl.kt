package com.example.demo.application.impl

import com.example.demo.application.CustomerFacade
import com.example.demo.domain.entity.CustomerEntity
import com.example.demo.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*


@Service
class CustomerApplicationImpl : CustomerFacade {

    @Autowired
    lateinit var customerRepository: CustomerRepository

    override fun getCustomer(id: Int): Optional<CustomerEntity> {
        return customerRepository.findById(id)
    }
}
