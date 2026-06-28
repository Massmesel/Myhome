package com.habesha.realestate.model

data class Property(
    val id: String,
    val title: String,
    val description: String,
    val price: Double,
    val location: String,
    val imageUrl: String,
    val isAvailable: Boolean = true
)
