package com.opengov.eam.event.consumer

import com.opengov.eam.event.message.TaskUpdatedEvent
import com.opengov.eam.event.util.Logging
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono

@Component
class RecordUpdateRequestHandler:Logging {

    fun handleTaskUpdate(taskUpdatedEvent: TaskUpdatedEvent) : Mono<Void> {
        logger.info("message handled: $taskUpdatedEvent")
        return Mono.empty()
    }
}