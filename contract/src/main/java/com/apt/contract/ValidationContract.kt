package com.apt.contract

import com.apt.core.model.Response

interface ValidationContract {
    suspend fun isTitleValid(title: String): Response<Boolean>
    suspend fun isDescriptionValid(description: String): Response<Boolean>
}