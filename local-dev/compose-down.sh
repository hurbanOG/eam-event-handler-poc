#!/bin/bash

cd $(dirname "$0")
docker-compose -p eam-kafka-integration down -v
