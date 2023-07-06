package com.opengov.eam.event.util

import org.apache.avro.Schema
import org.apache.avro.generic.GenericData
import org.apache.avro.reflect.ReflectData
import org.springframework.beans.PropertyAccessorFactory
import org.springframework.util.Assert
import java.util.function.Consumer


object GenericRecordMapper {

    fun mapObjectToRecord(obj: Any): GenericData.Record {
        Assert.notNull(obj, "object must not be null")
        val schema: Schema = ReflectData.AllowNull.get().getSchema(obj.javaClass)
        val record = GenericData.Record(schema)
        schema.fields.forEach { r ->
            record.put(
                r.name(),
                PropertyAccessorFactory.forDirectFieldAccess(obj).getPropertyValue(r.name())
            )
        }
        return record
    }

    fun <T> mapRecordToObject(record: GenericData.Record, obj: T): T {
        Assert.notNull(record, "record must not be null")
        Assert.notNull(obj, "object must not be null")
        val schema: Schema = ReflectData.AllowNull.get().getSchema(obj!!.javaClass)
        Assert.isTrue(schema.getFields().equals(record.schema.fields), "Schema fields didn't match")
        record.schema.fields.forEach(
            Consumer { d: Schema.Field ->
                PropertyAccessorFactory.forDirectFieldAccess(
                    obj
                ).setPropertyValue(
                    d.name(),
                    if (record[d.name()] == null) record[d.name()] else record[d.name()].toString()
                )
            }
        )
        return obj
    }

    fun <T> mapFromRecord(record: GenericData.Record, obj: T): T {
        Assert.notNull(record, "record must not be null")
        Assert.notNull(obj, "object must not be null")
        val schema = ReflectData.AllowNull.get().getSchema(obj!!.javaClass)
        Assert.isTrue(schema.fields == record.schema.fields, "Schema fields didn't match")
        record
            .schema
            .fields
            .forEach(
                Consumer { field: Schema.Field ->
                    PropertyAccessorFactory
                        .forDirectFieldAccess(obj)
                        .setPropertyValue(field.name(), record[field.name()])
                }
            )
        return obj
    }
}

