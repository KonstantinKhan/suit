package ru.suit.food.common.models

@JvmInline
value class UnitMeasureId(private val id: String) {
    fun asString() = id

    companion object {
        val NONE = UnitMeasureId("")
    }
}
