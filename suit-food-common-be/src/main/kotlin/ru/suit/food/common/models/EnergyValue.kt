package ru.suit.food.common.models

data class EnergyValue(
    val calories: Measure = Measure(),
    val proteins: Measure = Measure(),
    val fats: Measure = Measure(),
    val carbohydrates: Measure = Measure()
)
