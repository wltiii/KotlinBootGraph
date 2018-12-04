package com.windlogics.pricing.repository

import com.windlogics.pricing.data.DayAheadMarket
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface DayAheadMarketRepository : MongoRepository<DayAheadMarket, String> {
    fun getPricesByHourEnding(hourEnding: Int): List<DayAheadMarket>
    fun getPricesByZone(zone: String): List<DayAheadMarket>
}