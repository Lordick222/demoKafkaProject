package com.example.demokafkaproject.service

import com.example.demokafkaproject.dto.Car
import com.example.demokafkaproject.repository.CarRepository
import org.springframework.stereotype.Service

@Service
class CarService(private val carRepository: CarRepository) {

    fun saveCar(car: Car): Car {
        return carRepository.save(car.of()).of()
    }
}