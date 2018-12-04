package com.windlogics.pricing.graphql

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.windlogics.pricing.dao.DayAheadMarketDao
import com.windlogics.pricing.data.DayAheadMarket
import com.windlogics.pricing.graphql.input.DayAheadMarketInput
import org.springframework.stereotype.Component

@Component
class Mutation(
        private val dayAheadMarketDao: DayAheadMarketDao
): GraphQLMutationResolver {
    fun dayAheadMarketCreate(input: DayAheadMarketInput) =
            dayAheadMarketDao.createDayAheadMarket(input.hourEnding, input.zone, input.price)
}
