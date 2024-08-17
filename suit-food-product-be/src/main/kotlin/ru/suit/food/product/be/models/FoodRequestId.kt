package ru.suit.food.product.be.models

@JvmInline
value class FoodRequestId(private val id: String) {
    fun asString() = id

    companion object {
        val NONE = FoodRequestId("")
    }
}
