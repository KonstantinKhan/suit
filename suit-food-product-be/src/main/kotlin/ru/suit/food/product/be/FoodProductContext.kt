package ru.suit.food.product.be

import ru.suit.food.product.be.models.BeCommand
import ru.suit.food.product.be.models.FoodProduct
import ru.suit.food.product.be.models.FoodProductFilterRequest
import ru.suit.food.product.be.models.FoodRequestId

data class FoodProductContext(
    var command: BeCommand = BeCommand.NONE,
    var requestId: FoodRequestId = FoodRequestId.NONE,

    var foodProductRequest: FoodProduct = FoodProduct(),
    var foodProductFilterRequest: FoodProductFilterRequest = FoodProductFilterRequest(),

    var foodProductResponse: FoodProduct = FoodProduct(),
    var foodProductsResponse: MutableList<FoodProduct> = mutableListOf()
)
