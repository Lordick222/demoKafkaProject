package com.example.demokafkaproject.config

import lombok.Data
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Data
@Configuration
@ConfigurationProperties(prefix = "elastic")
class ElasticProperties {
    var host: String? = null
}