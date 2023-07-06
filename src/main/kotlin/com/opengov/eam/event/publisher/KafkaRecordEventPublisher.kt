package com.opengov.eam.event.publisher

import com.opengov.eam.event.config.KafkaProducerConfigProperties
import com.opengov.eam.event.message.RecordUpdatedEvent
import com.opengov.eam.event.util.Logging
import io.confluent.kafka.serializers.AbstractKafkaSchemaSerDeConfig
import org.apache.kafka.clients.producer.KafkaProducer
import org.apache.kafka.clients.producer.ProducerConfig
import org.apache.kafka.clients.producer.ProducerRecord
import org.springframework.stereotype.Component
import java.util.*
import kotlin.reflect.KClass

@Component
class KafkaRecordEventPublisher(private val kafkaConfigProperties: KafkaProducerConfigProperties) : Logging {

    private val producerProps: Map<String, String> = mapOf(
        ProducerConfig.BOOTSTRAP_SERVERS_CONFIG to kafkaConfigProperties.broker,
        ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG to kafkaConfigProperties.keySerializer,
        ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG to kafkaConfigProperties.serializer,
        AbstractKafkaSchemaSerDeConfig.VALUE_SUBJECT_NAME_STRATEGY to kafkaConfigProperties.subjectNameStrategy,
        AbstractKafkaSchemaSerDeConfig.AUTO_REGISTER_SCHEMAS to kafkaConfigProperties.registerSchema,
        AbstractKafkaSchemaSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG to kafkaConfigProperties.schemaRegistryUrl
    )

    private val kafkaProducer: KafkaProducer<String, RecordUpdatedEvent> = KafkaProducer<String, RecordUpdatedEvent>(producerProps)

    fun publishMessage(value: RecordUpdatedEvent) {
        kafkaProducer.send(
            ProducerRecord(
                kafkaConfigProperties.recordEventTopic,
                value.getEventId().toString(),
                value
            )
        ).get()
        kafkaProducer.flush()
        logger.info("Event published: ${value.getEventId()}")
    }

    companion object {
        fun generateMessageKey(kClass: KClass<*>, idempKey: String? = null): String {
            val eventName = kClass.simpleName!!
            return "$eventName-${idempKey ?: UUID.randomUUID()}"
        }
    }
}