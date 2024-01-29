package com.example.demo.user

import org.springframework.data.annotation.Id
import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table
import java.util.UUID

@Table
class User(
    @Id
    @PrimaryKey
    private val id: UUID,
    private val profile1: String,
    private val profile2: String,
    private val profile3: String,
    private val profile4: String
)