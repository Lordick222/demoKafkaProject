package com.example.demokafkaproject.dto

import com.example.demokafkaproject.repository.entity.CarEntity
import java.time.LocalDate

data class Car(
    var id: String,
    var date: LocalDate? = null,
    var mark: String? = null,
    var mileage: Int? = null
) {

    fun of(): CarEntity {
        val result = CarEntity()
        result.id = this.id
        result.mileage = this.mileage
        result.mark = this.mark
        result.date = this.date
        return result
    }
}