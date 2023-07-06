#!/bin/bash

cd $(dirname "$0")
export HOST_APPLICATION="host.docker.internal"
export HOST_DOCKER_ENGINE="localhost"
export RESOURCES="../../src/main/resources"

docker-compose -p eam-kafka-integration up -d --build --remove-orphans
