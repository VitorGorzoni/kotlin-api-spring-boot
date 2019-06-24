package com.example.demo.domain.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="customer")
class CustomerEntity {

    @Id
    @Column(name="id")
    var id: Int = 0
        get() = field
        set(value) {
            field = value
        }

    @Column(name="name")
    var name: String = ""
        get() = field
        set(value) {
            field = value
        }

    @Column(name="email")
    var email: String = ""
        get() = field
        set(value) {
            field = value
        }
}
