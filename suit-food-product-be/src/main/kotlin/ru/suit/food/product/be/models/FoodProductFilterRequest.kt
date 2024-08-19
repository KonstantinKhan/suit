package ru.suit.food.product.be.models

data class FoodProductFilterRequest(
    val searchString: String = "",
    val caloriesFilter: BeFilterMeasure = BeFilterMeasure(),
    val proteinsFilter: BeFilterMeasure = BeFilterMeasure(),
    val fatsFilter: BeFilterMeasure = BeFilterMeasure(),
    val carbohydratesFilter: BeFilterMeasure = BeFilterMeasure(),
)
