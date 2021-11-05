package com.example.demokafkaproject.repository.entity

import com.example.demokafkaproject.dto.Car
import org.springframework.data.elasticsearch.annotations.Document
import java.time.LocalDate

@Document(indexName = "cars")
class CarEntity {
    var id: String? = null
    var date: LocalDate? = null
    var mark: String? = null
    var mileage: Int? = null


    fun of(): Car {
        return Car(
            this.id!!,
            this.date,
            this.mark,
            this.mileage
        )
    }
}