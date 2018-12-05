package com.changent.pricing.repository

import com.changent.pricing.data.DayAheadMarket
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface DayAheadMarketRepository : MongoRepository<DayAheadMarket, String> {
    fun getPricesByHourEnding(hourEnding: Int): List<DayAheadMarket>
    fun getPricesByZone(zone: String): List<DayAheadMarket>
}