#!/usr/bin/env sh
set -e
echo "CHECKING IF SCHEMA REGISTRY IS UP"
attempt_counter=0
max_attempts=20

# Validate SCHEMA_REGISTRY_URL is defined
[[ -z "$SCHEMA_REGISTRY_URL" ]] && { echo "Error: SCHEMA_REGISTRY_URL not defined"; exit 1; }

until $(curl --output /dev/null --silent --head --fail http://$SCHEMA_REGISTRY_URL); do
    if [ ${attempt_counter} -eq ${max_attempts} ];then
      echo "Max attempts reached, exiting \n"
      exit 1
    fi

    printf '.'
    attempt_counter=$(($attempt_counter+1))
    echo "Unable to reach registry. Attempt: ${attempt_counter}"
    sleep 5
done
echo "SCHEMA REGISTRY UP"
SCHEMA_PREFIX='{"schema":'
TASKTOPIC='eam_task_events'
RECORDTOPIC='plc_record_events'

for SCHEMA_FILE in $(find ./avro-schemas -name 'task*.avsc')
do
  NAMESPACE=$(cat $SCHEMA_FILE | jq -r .namespace)
  EVENT_NAME=$(cat $SCHEMA_FILE | jq -r .name)
  SCHEMA_STRING=$(cat $SCHEMA_FILE | jq tojson)
  SCHEMA="$SCHEMA_PREFIX$SCHEMA_STRING}"
  SUBJECT="$TASKTOPIC-$NAMESPACE.$EVENT_NAME"
  curl -XPOST -i -H "Content-Type: application/vnd.schemaregistry.v1+json" --data $SCHEMA $SCHEMA_REGISTRY_URL/subjects/$SUBJECT/versions
done
for SCHEMA_FILE in $(find ./avro-schemas -name 'record*.avsc')
do
  NAMESPACE=$(cat $SCHEMA_FILE | jq -r .namespace)
  EVENT_NAME=$(cat $SCHEMA_FILE | jq -r .name)
  SCHEMA_STRING=$(cat $SCHEMA_FILE | jq tojson)
  SCHEMA="$SCHEMA_PREFIX$SCHEMA_STRING}"
  SUBJECT="$RECORDTOPIC-$NAMESPACE.$EVENT_NAME"
  curl -XPOST -i -H "Content-Type: application/vnd.schemaregistry.v1+json" --data $SCHEMA $SCHEMA_REGISTRY_URL/subjects/$SUBJECT/versions
done

sleep 5
echo "Schema upload finished"
