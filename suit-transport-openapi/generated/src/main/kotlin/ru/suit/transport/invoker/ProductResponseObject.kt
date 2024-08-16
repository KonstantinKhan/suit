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
 * Not defined
 *
 * @param measure 
 * @param productName Product name
 * @param energyValue 
 * @param productId Product ID
 * @param ownerId Author ID
 */


data class ProductResponseObject (

    @Json(name = "measure")
    val measure: MeasureMeasure? = null,

    /* Product name */
    @Json(name = "productName")
    val productName: kotlin.String? = null,

    @Json(name = "energyValue")
    val energyValue: BaseProductAllOfEnergyValue? = null,

    /* Product ID */
    @Json(name = "productId")
    val productId: kotlin.String? = null,

    /* Author ID */
    @Json(name = "ownerId")
    val ownerId: kotlin.String? = null

) {


}

