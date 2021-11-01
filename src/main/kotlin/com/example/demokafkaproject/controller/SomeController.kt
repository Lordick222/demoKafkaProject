package com.example.demokafkaproject.controller

import com.example.demokafkaproject.controller.dto.SendMessageRequest
import com.example.demokafkaproject.controller.dto.SendMessageResponse
import com.example.demokafkaproject.producer.KafkaProducer
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1")
class SomeController(private var kafkaProducer: KafkaProducer) {

    @PostMapping("/send_message")
    fun sendMessage(@RequestBody request: SendMessageRequest): SendMessageResponse {
        kafkaProducer.sendMessage(request.message!!)
        return SendMessageResponse("success")
    }
}