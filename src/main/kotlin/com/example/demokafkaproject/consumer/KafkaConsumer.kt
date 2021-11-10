package com.example.demokafkaproject.consumer

import com.example.demokafkaproject.config.KafkaProperties
import com.example.demokafkaproject.dto.DebeziumResponce
import com.google.gson.Gson
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service


@Service
class KafkaConsumer(private var kafkaProperties: KafkaProperties) {

    @KafkaListener(
        topics = ["\${kafka.consume-topic-name}"],
        groupId = "\${kafka.group_id}"
    )
    fun listenKafka(msg: String) {
        System.out.println("Received Message in group foo: $msg")
        val gson = Gson()
        val convertedObject = gson.fromJson(msg, DebeziumResponce::class.java)
    }
}