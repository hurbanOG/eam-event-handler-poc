package com.opengov.eam.event.service

import com.opengov.eam.event.message.RecordUpdatedEvent
import com.opengov.eam.event.publisher.KafkaRecordEventPublisher
import org.springframework.stereotype.Service

@Service
class RecordService(
    val kafkaPublisher: KafkaRecordEventPublisher
) {

    fun createEvent(record: RecordUpdated, idempKey: String? = null): RecordUpdatedResponse {
        val event = record.toEvent(idempKey)
        kafkaPublisher.publishMessage(event)
        return  RecordUpdatedResponse(
            event.getEventId().toString()
        )
    }
}

data class RecordUpdated(
    val entityId: String?,
    val recordId: String?,
    val recordType: String?,
    val stepId: String?,
    val address1: String?,
    val address2: String?,
    val city: String?,
    val state: String?,
    val zip: String?,
    val latitude: String?,
    val longitude: String?
)

data class RecordUpdatedResponse(
    val eventId: String
)

fun RecordUpdated.toEvent(idempKey: String? = null): RecordUpdatedEvent = RecordUpdatedEvent(
    KafkaRecordEventPublisher.generateMessageKey(this::class, idempKey),
    entityId,
    recordId,
    recordType,
    stepId,
    address1,
    address2,
    city,
    state,
    zip,
    latitude,
    longitude
)


