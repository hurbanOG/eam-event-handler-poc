package com.opengov.eam.event.config

import com.opengov.eam.event.message.RecordUpdatedEvent
import io.confluent.kafka.serializers.KafkaAvroDeserializer
import io.confluent.kafka.serializers.KafkaAvroDeserializerConfig
import org.apache.kafka.clients.consumer.ConsumerConfig
import org.apache.kafka.common.serialization.StringDeserializer
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory
import org.springframework.kafka.core.ConsumerFactory
import org.springframework.kafka.core.DefaultKafkaConsumerFactory
import org.springframework.kafka.support.serializer.ErrorHandlingDeserializer


@Configuration
class KafkaConsumerConfig {



    @Bean
    fun kafkaListenerContainerFactory(consumerFactory: ConsumerFactory<String, RecordUpdatedEvent>): ConcurrentKafkaListenerContainerFactory<String, RecordUpdatedEvent>? {
        val factory: ConcurrentKafkaListenerContainerFactory<String, RecordUpdatedEvent> =
            ConcurrentKafkaListenerContainerFactory<String, RecordUpdatedEvent>()
        factory.consumerFactory = consumerFactory
        return factory
    }

    @Bean
    fun consumerFactory(
        @Value("\${kafka.consumer.bootstrap-servers}") bootstrapServers: String,
        @Value("\${kafka.consumer.schema-registry-url}") schemaRegistryUrl: String
    ): ConsumerFactory<String, RecordUpdatedEvent> {
        val config: MutableMap<String, Any> = HashMap()
        config[ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG] = bootstrapServers
        config[ConsumerConfig.GROUP_ID_CONFIG] = "plc-record-cg"
        config[ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG] = ErrorHandlingDeserializer::class.java
        config[ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG] = ErrorHandlingDeserializer::class.java
        config[ErrorHandlingDeserializer.KEY_DESERIALIZER_CLASS] = StringDeserializer::class.java
        config[ErrorHandlingDeserializer.VALUE_DESERIALIZER_CLASS] = KafkaAvroDeserializer::class.java
        config[KafkaAvroDeserializerConfig.SCHEMA_REGISTRY_URL_CONFIG] = schemaRegistryUrl
        config[KafkaAvroDeserializerConfig.AUTO_REGISTER_SCHEMAS] = false
        config[KafkaAvroDeserializerConfig.SPECIFIC_AVRO_READER_CONFIG] = true
        return DefaultKafkaConsumerFactory(config)
    }
}