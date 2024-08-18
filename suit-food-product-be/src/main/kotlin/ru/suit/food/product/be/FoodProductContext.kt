package ru.suit.food.product.be

import ru.suit.food.product.be.models.FoodProduct
import ru.suit.food.product.be.models.FoodRequestId

data class FoodProductContext(
    var requestId: FoodRequestId = FoodRequestId.NONE,

    var foodProductRequest: FoodProduct = FoodProduct(),

    var foodProductResponse: FoodProduct = FoodProduct()
)
