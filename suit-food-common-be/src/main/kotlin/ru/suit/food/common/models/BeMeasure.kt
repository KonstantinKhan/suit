package ru.suit.food.common.models

data class BeMeasure(
    val measureValue: Double = 0.0,
    val unit: BeUnitMeasure = BeUnitMeasure()
)
