package com.changent.pricing.data

import org.springframework.data.mongodb.core.mapping.Document
import java.util.*
import javax.persistence.Id

@Document(collection="dayAheadMarket")
data class DayAheadMarket(
        @Id
        val id: String = UUID.randomUUID().toString(),
        val hourEnding: Int,
        val zone: String,
        val price: Float
)
