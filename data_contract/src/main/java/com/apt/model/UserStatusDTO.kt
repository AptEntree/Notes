package com.apt.model

data class UserStatusDTO(
    val user: UserDTO? = null,
    val isActive: Boolean,
)