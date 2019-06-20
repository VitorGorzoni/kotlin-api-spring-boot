package com.example.demo.domain.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="customer")
class CustomerEntity {

    @Id
    var id: Int = 0
        get() = field
        set(value) {
            field = value
        }

    var name: String = ""
        get() = field
        set(value) {
            field = value
        }

    var email: String = ""
        get() = field
        set(value) {
            field = value
        }
}
