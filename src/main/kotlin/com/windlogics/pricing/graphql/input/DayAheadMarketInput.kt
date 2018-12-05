package com.changent.pricing.graphql.input

data class DayAheadMarketInput(
    val hourEnding: Int,
    val zone: String,
    val price: Float
)
