#!/bin/bash
set -e
./mvnw generate-sources
./mvnw clean package
docker build -t eam-event-handler-poc:local-build .
