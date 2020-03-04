package com.afen.kolindemo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Greeting(@Id
                    @GeneratedValue
                    val id: Long,
                    val content: String)