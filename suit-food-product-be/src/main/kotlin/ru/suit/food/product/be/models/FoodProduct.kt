package ru.suit.food.product.be.models

data class FoodProduct(
    var productId: FoodProductId = FoodProductId.NONE,
    var productName: String = ""
)
