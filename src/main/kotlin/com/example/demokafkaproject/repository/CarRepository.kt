package com.example.demokafkaproject.repository

import com.example.demokafkaproject.repository.entity.CarEntity
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository

interface CarRepository : ElasticsearchRepository<CarEntity, String> {
    fun findByMark(mark: String): List<CarEntity>
    fun findByMileageBefore(millage: Int): List<CarEntity>
    fun findByMileageAfter(millage: Int): List<CarEntity>
    fun findByMileageBetween(millageBefore: Int, millageAfter: Int): List<CarEntity>


}