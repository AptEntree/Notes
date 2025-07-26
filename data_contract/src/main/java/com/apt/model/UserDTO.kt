package com.apt.model

data class UserDTO(
    val id: String,
    val name: String,
    val isActive: Boolean = true
)
