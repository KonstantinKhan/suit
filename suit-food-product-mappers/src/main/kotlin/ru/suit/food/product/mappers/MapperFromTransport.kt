package ru.suit.food.product.mappers

import ru.suit.food.product.be.FoodProductContext
import ru.suit.food.product.be.models.FoodProduct
import ru.suit.transport.models.*
import ru.suit.food.common.models.*
import ru.suit.food.common.models.BeUnitMeasure
import ru.suit.food.product.be.models.FoodProductId
import ru.suit.transport.models.Measure

fun FoodProductContext.fromTransport(request: IRequest) = when (request) {
    is ProductCreateRequest -> fromTransport(request)
    is ProductReadRequest -> fromTransport(request)
    is ProductUpdateRequest -> fromTransport(request)
    is ProductDeleteRequest -> fromTransport(request)
    is ProductSearchRequest -> fromTransport(request)
    else -> throw IllegalArgumentException("Unsupported request type: ${request::class.simpleName}")
}

fun FoodProductContext.fromTransport(request: ProductCreateRequest) {
    foodProductRequest = request.product?.toInternal() ?: FoodProduct()
}

private fun ProductCreateObject.toInternal(): FoodProduct = FoodProduct(
    productName = this.productName ?: "",
    productMeasure = this.measure?.toInternal() ?: BeMeasure(),
    productEnergyValue = this.energyValue?.toInternal() ?: BeEnergyValue()
)

private fun Measure.toInternal(): BeMeasure = BeMeasure(
    measureValue = this.measureValue ?: 0.0,
    unit = this.unitMeasure?.toInternal() ?: BeUnitMeasure()
)

private fun UnitMeasure.toInternal(): BeUnitMeasure = BeUnitMeasure(
    unitMeasureId = this.unitId?.let { UnitMeasureId(it) } ?: UnitMeasureId.NONE,
    unitMeasureName = this.unitName ?: "",
    unitMeasureValue = this.unitValue ?: ""
)

private fun EnergyValue.toInternal(): BeEnergyValue = BeEnergyValue(
    calories = this.calories?.toInternal() ?: BeMeasure(),
    proteins = this.proteins?.toInternal() ?: BeMeasure(),
    fats = this.fats?.toInternal() ?: BeMeasure(),
    carbohydrates = this.carbohydrates?.toInternal() ?: BeMeasure()
)

fun FoodProductContext.fromTransport(request: ProductReadRequest) {
    foodProductRequest = request.product?.toInternal() ?: FoodProduct()
}

fun ProductReadObject.toInternal(): FoodProduct = FoodProduct(
    productId = this.productId?.let { FoodProductId(it) } ?: FoodProductId.NONE
)
