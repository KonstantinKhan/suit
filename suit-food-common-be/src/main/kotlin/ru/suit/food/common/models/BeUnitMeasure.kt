package ru.suit.food.common.models

data class BeUnitMeasure(
    val unitMeasureId: UnitMeasureId = UnitMeasureId.NONE,
    val unitMeasureName: String = "",
    val unitMeasureValue: String = ""
)
