package com.example.demokafkaproject.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
data class DebeziumResponceEntry(
    var car_id: String? = null,
    var year: String? = null,
    var mark: String? = null,
    var mileage: Int? = null
)