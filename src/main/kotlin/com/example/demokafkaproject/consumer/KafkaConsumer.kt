package com.example.demokafkaproject.consumer

import com.example.demokafkaproject.config.KafkaProperties
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class KafkaConsumer(private var kafkaProperties: KafkaProperties) {

    @KafkaListener(
        topics = ["\${kafka.topic-name}"],
        groupId = "\${kafka.group_id}"
    )
    fun listenKafka(msg: String) {
        System.out.println("Received Message in group foo: $msg");
    }
}