package com.example.demokafkaproject.dto

import java.time.LocalDate

data class SaveCarRequest(
    var id: String,
    var date: LocalDate? = null,
    var mark: String? = null,
    var mileage: Int? = null
)