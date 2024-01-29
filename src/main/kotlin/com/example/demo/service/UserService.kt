package com.example.demo.service

import com.example.demo.presentation.dto.request.CreateUserRequest
import com.example.demo.repository.UserRepository
import com.example.demo.user.User
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class UserService(
    private val userRepository: UserRepository
) {
    fun createUser(createUserRequest: CreateUserRequest) {
        val user = User(
            id = UUID.randomUUID(),
            profile1 = createUserRequest.profile1,
            profile2 = createUserRequest.profile2,
            profile3 = createUserRequest.profile3,
            profile4 = createUserRequest.profile4
        )

        userRepository.save(user)
    }
}