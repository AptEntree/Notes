package com.apt.model

data class TaskDTO (
    val id: String,
    val title: String,
    val description: String,
    val status: String,
    val priority: Int,
    val isFavorite: Boolean
)