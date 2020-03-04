package com.afen.kolindemo.controller

import com.afen.kolindemo.model.Greeting
import com.afen.kolindemo.repository.GreetingRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class DemoController(private val greetingRepository: GreetingRepository){
    val counter = AtomicLong()

    @GetMapping("/getAll")
    fun getAll(): List<Greeting> = greetingRepository.findAll()

    @GetMapping("/hello")
    fun create(@RequestParam(value = "name", defaultValue = "World") name: String) {
        greetingRepository.save(Greeting(counter.incrementAndGet(), "Hello, $name"))
    }
}