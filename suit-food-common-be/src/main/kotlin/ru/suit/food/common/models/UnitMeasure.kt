package ru.suit.food.common.models

data class UnitMeasure(
    val unitMeasureId: UnitMeasureId = UnitMeasureId.NONE,
    val unitMeasureName: String = "",
    val unitMeasureValue: String = ""
)
