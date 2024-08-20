package ru.suit.food.product.mappers

import ru.suit.food.common.models.BeEnergyValue
import ru.suit.food.common.models.BeMeasure
import ru.suit.food.common.models.BeUnitMeasure
import ru.suit.food.common.models.UnitMeasureId
import ru.suit.food.product.be.FoodProductContext
import ru.suit.food.product.be.models.BeCommand
import ru.suit.food.product.be.models.FoodProduct
import ru.suit.food.product.be.models.FoodProductId
import ru.suit.food.product.be.models.OwnerId
import ru.suit.transport.models.*

fun FoodProductContext.toTransport(): IResponse = when (command) {
    BeCommand.CREATE -> toTransportCreate()
    BeCommand.READ -> toTransportRead()
    BeCommand.UPDATE -> toTransportUpdate()
    BeCommand.DELETE -> toTransportDelete()
    BeCommand.SEARCH -> toTransportSearch()
    BeCommand.NONE -> throw Throwable("Unknown command")
}

fun FoodProductContext.toTransportCreate() = ProductCreateResponse(
    responseType = "create",
    product = foodProductResponse.toTransportFoodProduct()
)

private fun FoodProduct.toTransportFoodProduct(): ProductResponseObject =
    ProductResponseObject(
        measure = productMeasure.toTransport(),
        productName = productName,
        energyValue = productEnergyValue.toTransport(),
        productId = productId.takeIf { it != FoodProductId.NONE }?.asString(),
        ownerId = ownerId.takeIf { it != OwnerId.NONE }?.asString(),
    )

private fun BeMeasure.toTransport() = Measure(
    measureValue = measureValue,
    unitMeasure = unitMeasure.toTransport()
)

private fun BeUnitMeasure.toTransport() = UnitMeasure(
    unitMeasureId = unitMeasureId.takeIf { it != UnitMeasureId.NONE }?.asString(),
    unitMeasureName = unitMeasureName,
    unitMeasureValue = unitMeasureValue
)

private fun BeEnergyValue.toTransport() = EnergyValue(
    calories = calories.toTransport(),
    proteins = proteins.toTransport(),
    fats = fats.toTransport(),
    carbohydrates = carbohydrates.toTransport()
)

fun FoodProductContext.toTransportRead() = ProductReadResponse(
    responseType = "read",
    product = foodProductResponse.toTransportFoodProduct()
)

fun FoodProductContext.toTransportUpdate() = ProductUpdateResponse(
    responseType = "update",
    product = foodProductResponse.toTransportFoodProduct()
)

fun FoodProductContext.toTransportDelete() = ProductDeleteResponse(
    responseType = "delete",
    product = foodProductResponse.toTransportFoodProduct()
)

fun FoodProductContext.toTransportSearch() = ProductSearchResponse(
    responseType = "search",
    products = foodProductsResponse.toTransportFoodProduct()
)

private fun List<FoodProduct>.toTransportFoodProduct() = this.map { product ->
    product.toTransportFoodProduct()
}