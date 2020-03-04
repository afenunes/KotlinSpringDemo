package com.afen.kolindemo.repository

import com.afen.kolindemo.model.Greeting
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface GreetingRepository : JpaRepository<Greeting, Long>
