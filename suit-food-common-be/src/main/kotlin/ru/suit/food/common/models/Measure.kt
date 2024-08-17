package ru.suit.food.common.models

data class Measure(
    val measureName: String = "",
    val measureValue: Double = 0.0,
    val unit: UnitMeasure = UnitMeasure()
)
