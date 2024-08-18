package ru.suit.food.product.be.models

import ru.suit.food.common.models.BeEnergyValue
import ru.suit.food.common.models.BeMeasure

data class FoodProduct(
    val productId: FoodProductId = FoodProductId.NONE,
    val productName: String = "",
    val productMeasure: BeMeasure = BeMeasure(),
    val productEnergyValue: BeEnergyValue = BeEnergyValue()
)
