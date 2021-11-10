package com.example.demokafkaproject.config

import org.apache.kafka.clients.admin.AdminClientConfig
import org.apache.kafka.clients.admin.NewTopic
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.core.KafkaAdmin


@Configuration
class KafkaTopicConfig(private var kafkaProperties: KafkaProperties) {

    @Bean
    fun kafkaAdmin(): KafkaAdmin {
        val configs: MutableMap<String, Any> = HashMap()
        configs[AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG] = kafkaProperties.bootstrapAddress!!
        return KafkaAdmin(configs)
    }

    @Bean
    fun topic1(): NewTopic? {
        return NewTopic(kafkaProperties.produceTopicName, 1, 1.toShort())
    }
}