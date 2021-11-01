package com.example.demokafkaproject

import com.example.demokafkaproject.config.KafkaProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(KafkaProperties::class)
class DemoKafkaProjectApplication

fun main(args: Array<String>) {
    runApplication<DemoKafkaProjectApplication>(*args)
}
