package com.example.demokafkaproject.producer

import org.springframework.beans.factory.annotation.Value
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class KafkaProducer(
    private var kafkaTemplate: KafkaTemplate<String, String>
) {
    @Value("\${kafka.topic-name}")
    private val topicName: String? = null

    fun sendMessage(msg: String) {
        kafkaTemplate.send(topicName!!, msg)
    }
}