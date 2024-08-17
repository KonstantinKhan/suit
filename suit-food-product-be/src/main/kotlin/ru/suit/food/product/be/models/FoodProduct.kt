package ru.suit.food.product.be.models

import ru.suit.food.common.models.EnergyValue
import ru.suit.food.common.models.Measure

data class FoodProduct(
    val productId: FoodProductId = FoodProductId.NONE,
    val productName: String = "",
    val productMeasure: Measure = Measure(),
    val productEnergyValue: EnergyValue = EnergyValue()
)
