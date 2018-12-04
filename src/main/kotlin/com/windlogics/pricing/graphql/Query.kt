package com.windlogics.pricing.graphql

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class Query: GraphQLQueryResolver {
    fun version() = "0.0.3-SNAPSHOT"
}
