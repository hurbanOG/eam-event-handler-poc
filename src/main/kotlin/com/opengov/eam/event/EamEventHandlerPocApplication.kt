package com.opengov.eam.event

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EamEventPublisherPocApplication

fun main(args: Array<String>) {
	runApplication<EamEventPublisherPocApplication>(*args)
}
