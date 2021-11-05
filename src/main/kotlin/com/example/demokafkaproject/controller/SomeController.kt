package com.example.demokafkaproject.controller

import com.example.demokafkaproject.dto.*
import com.example.demokafkaproject.producer.KafkaProducer
import com.example.demokafkaproject.service.CarService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1")
class SomeController(private var kafkaProducer: KafkaProducer, private var carService: CarService) {

    @PostMapping("/send_message")
    fun sendMessage(@RequestBody request: SendMessageRequest): SendMessageResponse {
        kafkaProducer.sendMessage(request.message!!)
        return SendMessageResponse("success")
    }

    @PostMapping("/save_car")
    fun saveCar(@RequestBody request: SaveCarRequest): SaveCarResponse {
        val car = Car(request.id, request.date, request.mark, request.mileage)
        val result = carService.saveCar(car)
        return SaveCarResponse(result.id, result.date, result.mark, result.mileage)
    }
}