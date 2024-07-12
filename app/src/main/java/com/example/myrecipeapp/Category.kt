package com.example.myrecipeapp

data class Category(val idCategory:String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryCategoryDescription: String
)

data class CategoriesResponse(val categories: List<Category>)
