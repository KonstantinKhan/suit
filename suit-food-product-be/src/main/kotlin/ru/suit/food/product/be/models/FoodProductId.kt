package ru.suit.food.product.be.models

@JvmInline
value class FoodProductId(private val id: String) {
    fun asString() = id

    companion object {
        val NONE = FoodProductId("")
    }
}
