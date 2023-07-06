package com.opengov.eam.event.controller

import com.opengov.eam.event.service.*
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/record/event")
class RecordController(
    private val recordService: RecordService
) {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun publish(@RequestHeader headers: HttpHeaders, @RequestBody recordUpdated: RecordUpdated): RecordUpdatedResponse {
        val idk = headers.get("X-Idempotency-Key")?.get(0)
        return recordService.createEvent(recordUpdated, idk)
    }
}
