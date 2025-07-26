package com.apt.model

data class FakeUserDTO (
    val id: String,
    val name: String,
    val isActive: Boolean = true,
    val email: String,
    val password: String
)