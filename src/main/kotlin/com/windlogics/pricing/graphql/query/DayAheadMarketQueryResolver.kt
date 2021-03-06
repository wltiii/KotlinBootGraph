package com.changent.pricing.graphql.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.changent.pricing.dao.DayAheadMarketDao
import com.changent.pricing.data.DayAheadMarket
import org.springframework.stereotype.Component

@Component
class DayAheadMarketQueryResolver(
    private val dayAheadMarketDao: DayAheadMarketDao
): GraphQLQueryResolver {
    fun dayAheadMarket(id: String) =
            dayAheadMarketDao.getDayAheadMarketById(id)

    fun pricesByHourEnding(hourEnding: Int) =
            dayAheadMarketDao.getPricesByHourEnding(hourEnding)

    fun pricesByZone(zone: String) =
            dayAheadMarketDao.getPricesByZone(zone)
}
