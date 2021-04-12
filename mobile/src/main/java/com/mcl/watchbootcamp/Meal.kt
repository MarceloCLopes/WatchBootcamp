package com.mcl.watchbootcamp

data class Meal(
    val title: String,
    val calories: Int,
    val ingredients: List<String>,
    val favorited: Boolean
)
