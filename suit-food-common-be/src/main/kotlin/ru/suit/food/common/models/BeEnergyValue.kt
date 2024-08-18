package ru.suit.food.common.models

data class BeEnergyValue(
    val calories: BeMeasure = BeMeasure(),
    val proteins: BeMeasure = BeMeasure(),
    val fats: BeMeasure = BeMeasure(),
    val carbohydrates: BeMeasure = BeMeasure()
)
