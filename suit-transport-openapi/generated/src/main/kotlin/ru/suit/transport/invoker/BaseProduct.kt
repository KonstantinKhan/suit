/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package ru.suit.transport.invoker

import ru.suit.transport.invoker.BaseProductAllOfEnergyValue
import ru.suit.transport.invoker.MeasureMeasure

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The structure with data about the product to create request
 *
 * @param measure 
 * @param productName Product name
 * @param energyValue 
 */


data class BaseProduct (

    @Json(name = "measure")
    val measure: MeasureMeasure? = null,

    /* Product name */
    @Json(name = "productName")
    val productName: kotlin.String? = null,

    @Json(name = "energyValue")
    val energyValue: BaseProductAllOfEnergyValue? = null

) {


}

