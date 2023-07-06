package com.opengov.eam.event.consumer

import com.opengov.eam.event.message.RecordUpdatedEvent
import com.opengov.eam.event.message.TaskUpdatedEvent
import com.opengov.eam.event.publisher.KafkaTaskEventPublisher
import com.opengov.eam.event.service.TaskService
import com.opengov.eam.event.service.TaskUpdated
import com.opengov.eam.event.util.Logging
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.support.KafkaHeaders
import org.springframework.messaging.handler.annotation.Header
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.stereotype.Component
import java.util.*
import java.util.concurrent.atomic.AtomicInteger


@Component
class KafkaConsumer(private val taskService: TaskService): Logging {

    val counter = AtomicInteger()

    @KafkaListener(
        topics = ["plc_record_events"],
        groupId = "plc-record-cg",
        containerFactory = "kafkaListenerContainerFactory"
    )
    fun listen(@Header(KafkaHeaders.RECEIVED_KEY) key: String, @Payload command: RecordUpdatedEvent) {
        counter.getAndIncrement()
        logger.info("Received message [" + counter.get() + "] - key: " + key)
        logger.info("With Payload: $command")
        logger.info("Creating a Task on EAM")
        val taskId = taskService.createTask(command.toTaskUpdate())
        logger.info("Task created with ID $taskId")
    }
}

fun RecordUpdatedEvent.toTaskUpdate(): TaskUpdated = TaskUpdated(
    entityId.toString(),
    null,
    recordId.toString(),
    recordType.toString(),
    stepId.toString()
)

