package ru.suit.food.product.mappers.tests

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import ru.suit.food.common.models.BeEnergyValue
import ru.suit.food.common.models.BeMeasure
import ru.suit.food.common.models.BeUnitMeasure
import ru.suit.food.common.models.UnitMeasureId
import ru.suit.food.product.be.FoodProductContext
import ru.suit.food.product.be.models.FoodProduct
import ru.suit.food.product.be.models.FoodProductId
import ru.suit.food.product.be.models.OwnerId
import ru.suit.food.product.mappers.toTransportUpdate

class UpdateResponseSuccess : ShouldSpec({
    should("return correct UpdateResponse") {
        val context = FoodProductContext(
            foodProductResponse = FoodProduct(
                productId = FoodProductId(id = "39d4ff07-206e-4c0d-9a19-1aa236b1095b"),
                ownerId = OwnerId(id = "e5a09754-5cc2-42b8-914e-eab3be7d8797"),
                productName = "Филе куриной грудки",
                productMeasure = BeMeasure(
                    measureValue = 100.0,
                    unitMeasure = BeUnitMeasure(
                        unitMeasureId = UnitMeasureId(id = "bebbe68c-dc7b-4505-aa83-4d559254b639"),
                        unitMeasureName = "масса",
                        unitMeasureValue = "кг."
                    )
                ), productEnergyValue = BeEnergyValue(
                    calories = BeMeasure(
                        measureValue = 21.0,
                        unitMeasure = BeUnitMeasure(
                            unitMeasureId = UnitMeasureId(id = "bebbe68c-dc7b-4505-aa83-4d559254b639"),
                            unitMeasureName = "масса",
                            unitMeasureValue = "кг."
                        )
                    ), proteins = BeMeasure(
                        measureValue = 0.0,
                        unitMeasure = BeUnitMeasure(
                            unitMeasureId = UnitMeasureId(id = "bebbe68c-dc7b-4505-aa83-4d559254b639"),
                            unitMeasureName = "масса",
                            unitMeasureValue = "кг."
                        )
                    ), fats = BeMeasure(
                        measureValue = 0.0,
                        unitMeasure = BeUnitMeasure(
                            unitMeasureId = UnitMeasureId(id = "bebbe68c-dc7b-4505-aa83-4d559254b639"),
                            unitMeasureName = "масса",
                            unitMeasureValue = "кг."
                        )
                    ), carbohydrates = BeMeasure(
                        measureValue = 0.0,
                        unitMeasure = BeUnitMeasure(
                            unitMeasureId = UnitMeasureId(id = "bebbe68c-dc7b-4505-aa83-4d559254b639"),
                            unitMeasureName = "масса",
                            unitMeasureValue = "кг."
                        )
                    )
                )

            )
        )
        val response = context.toTransportUpdate()

        response.product?.measure?.measureValue shouldBe 100.0
    }
})