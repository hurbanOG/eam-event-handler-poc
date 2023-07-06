package com.opengov.eam.event.controller

import com.opengov.eam.event.service.TaskService
import com.opengov.eam.event.service.TaskUpdated
import com.opengov.eam.event.service.TaskUpdatedResponse
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/task")
class TaskController(
    private val taskService: TaskService
) {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createTask(@RequestHeader headers: HttpHeaders, @RequestBody taskUpdated: TaskUpdated): TaskUpdatedResponse {
        val idk = headers.get("X-Idempotency-Key")?.get(0)
        return taskService.createTask(taskUpdated)
    }
}
