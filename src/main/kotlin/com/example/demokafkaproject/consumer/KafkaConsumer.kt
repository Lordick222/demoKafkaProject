package com.example.demokafkaproject.consumer

import com.example.demokafkaproject.config.KafkaProperties
import org.springframework.beans.factory.annotation.Value
import org.springframework.kafka.annotation.KafkaHandler
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class KafkaConsumer(private var kafkaProperties: KafkaProperties) {

    @KafkaListener(topics = [kafkaProperties.topicName])
    fun listenKafka(msg:String){

    }

}