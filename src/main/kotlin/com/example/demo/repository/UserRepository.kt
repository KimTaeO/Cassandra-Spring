package com.example.demo.repository

import com.example.demo.user.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, String> {
}