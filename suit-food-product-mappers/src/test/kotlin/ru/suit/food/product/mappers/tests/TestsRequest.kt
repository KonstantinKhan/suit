package ru.suit.food.product.mappers.tests

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import ru.suit.food.product.be.FoodProductContext
import ru.suit.food.product.mappers.fromTransport
import ru.suit.transport.models.ProductSearchFilter
import ru.suit.transport.models.ProductSearchRequest

class FilterRequestSuccess: ShouldSpec({
    should("return correct filter request") {
        val filterRequest = ProductSearchRequest(
            requestType = "search",
            searchFilter = ProductSearchFilter(
                searchString = "говядина",
                caloriesFilter = null,
                proteinsFilter = null,
                fatsFilter = null,
                carbohydratesFilter = null
            )
        )
        val context = FoodProductContext()
        context.fromTransport(filterRequest)

        context.foodProductFilterRequest.searchString shouldBe filterRequest.searchFilter?.searchString
    }
})