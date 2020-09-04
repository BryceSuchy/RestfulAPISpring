package com.example.RestfulAPISpring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RestfulApiSpringApplication

fun main(args: Array<String>) {
	println("Hello World API is starting...")
	runApplication<RestfulApiSpringApplication>(*args)
}
