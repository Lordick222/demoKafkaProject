package com.example.demokafkaproject.config

import lombok.Data
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Data
@Configuration
@ConfigurationProperties(prefix = "kafka")
class KafkaProperties {
    var bootstrapAddress: String? = null
    var produceTopicName: String? = null
    var consumeTopicName: String? = null
    var groupId: String? = null
}