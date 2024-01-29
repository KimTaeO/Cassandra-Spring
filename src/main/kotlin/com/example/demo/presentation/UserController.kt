package com.example.demo.presentation

import com.example.demo.presentation.dto.request.CreateUserRequest
import com.example.demo.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
    private val userService: UserService
) {
    @PostMapping
    fun createUser(@RequestBody request: CreateUserRequest): ResponseEntity<Void> {
        userService.createUser(request)
        return ResponseEntity.status(HttpStatus.CREATED).build()
    }
}