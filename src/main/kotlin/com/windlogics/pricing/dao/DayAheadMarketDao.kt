package com.changent.pricing.dao

import com.changent.pricing.repository.DayAheadMarketRepository
import org.springframework.stereotype.Component
import com.changent.pricing.data.DayAheadMarket

@Component
class DayAheadMarketDao(
    private val dayAheadMarketRepository: DayAheadMarketRepository
) {
    fun getDayAheadMarketById(id: String) =
            dayAheadMarketRepository.findById(id)

    fun getPricesByHourEnding(hourEnding: Int) =
            dayAheadMarketRepository.getPricesByHourEnding(hourEnding)

    fun getPricesByZone(zone: String) =
            dayAheadMarketRepository.getPricesByZone(zone)

    fun createDayAheadMarket(hourEnding: Int, zone: String, price: Float) =
        dayAheadMarketRepository.save(
			DayAheadMarket(
		        hourEnding = hourEnding,
		        zone = zone,
		        price = price
		    )
		)
}
