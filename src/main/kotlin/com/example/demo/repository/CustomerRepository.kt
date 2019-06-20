package com.example.demo.repository

import com.example.demo.domain.entity.CustomerEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository : CrudRepository<CustomerEntity, Int>  {

}
