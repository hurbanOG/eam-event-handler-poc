package com.opengov.eam.event.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties("kafka.producer")
class KafkaProducerConfigProperties {
    lateinit var broker: String
    lateinit var serializer: String
    lateinit var keySerializer: String
    lateinit var schemaRegistryUrl: String
    lateinit var recordEventTopic: String
    lateinit var taskEventTopic: String
    lateinit var subjectNameStrategy: String
    lateinit var registerSchema: String
}
