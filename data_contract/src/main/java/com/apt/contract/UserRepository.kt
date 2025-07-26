package com.apt.contract

import com.apt.model.UserStatusDTO

interface UserRepository {
    fun tryUserLogin(email: String, password: String): UserStatusDTO
}