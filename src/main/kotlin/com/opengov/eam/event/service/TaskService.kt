package com.opengov.eam.event.service

import com.opengov.eam.event.message.TaskUpdatedEvent
import com.opengov.eam.event.publisher.KafkaTaskEventPublisher
import com.opengov.eam.event.publisher.KafkaTaskEventPublisher.Companion.generateMessageKey
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class TaskService(
    private val kafkaPublisher: KafkaTaskEventPublisher
) {

    fun createTask(task: TaskUpdated): TaskUpdatedResponse {
        val taskId = UUID.randomUUID().toString()
        val event = task.toEvent(taskId, "CREATED")
        kafkaPublisher.publishMessage(event)
        return  TaskUpdatedResponse(
            taskId
        )
    }
}

data class TaskUpdated(
    val entityId: String?,
    val assetId: String?,
    val recordId: String?,
    val recordType: String,
    val stepId: String
)

data class TaskUpdatedResponse(
    val taskId: String
)

fun TaskUpdated.toEvent(taskId: String, status: String): TaskUpdatedEvent = TaskUpdatedEvent(
    assetId,
    entityId,
    generateMessageKey(this::class, taskId),
    recordId,
    recordType,
    stepId,
    taskId,
    status
)


