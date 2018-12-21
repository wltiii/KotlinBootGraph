package com.changent.pricing.graphql

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.changent.pricing.dao.DayAheadMarketDao
import com.changent.pricing.data.DayAheadMarket
import com.changent.pricing.graphql.input.DayAheadMarketInput
import org.springframework.stereotype.Component

@Component
class Mutation(
        private val dayAheadMarketDao: DayAheadMarketDao
): GraphQLMutationResolver {
    fun dayAheadMarketCreate(input: DayAheadMarketInput) =
            dayAheadMarketDao.createDayAheadMarket(input.hourEnding, input.zone, input.price)
}
