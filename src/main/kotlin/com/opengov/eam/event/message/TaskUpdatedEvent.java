/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.opengov.eam.event.message;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class TaskUpdatedEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4192038375820443305L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TaskUpdatedEvent\",\"namespace\":\"com.opengov.eam.event.message\",\"fields\":[{\"name\":\"assetId\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"entityId\",\"type\":\"string\"},{\"name\":\"eventId\",\"type\":\"string\"},{\"name\":\"recordId\",\"type\":\"string\"},{\"name\":\"recordType\",\"type\":\"string\"},{\"name\":\"stepId\",\"type\":\"string\"},{\"name\":\"taskId\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<TaskUpdatedEvent> ENCODER =
      new BinaryMessageEncoder<TaskUpdatedEvent>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TaskUpdatedEvent> DECODER =
      new BinaryMessageDecoder<TaskUpdatedEvent>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<TaskUpdatedEvent> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<TaskUpdatedEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<TaskUpdatedEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TaskUpdatedEvent>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this TaskUpdatedEvent to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a TaskUpdatedEvent from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a TaskUpdatedEvent instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static TaskUpdatedEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence assetId;
   private java.lang.CharSequence entityId;
   private java.lang.CharSequence eventId;
   private java.lang.CharSequence recordId;
   private java.lang.CharSequence recordType;
   private java.lang.CharSequence stepId;
   private java.lang.CharSequence taskId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TaskUpdatedEvent() {}

  /**
   * All-args constructor.
   * @param assetId The new value for assetId
   * @param entityId The new value for entityId
   * @param eventId The new value for eventId
   * @param recordId The new value for recordId
   * @param recordType The new value for recordType
   * @param stepId The new value for stepId
   * @param taskId The new value for taskId
   */
  public TaskUpdatedEvent(java.lang.CharSequence assetId, java.lang.CharSequence entityId, java.lang.CharSequence eventId, java.lang.CharSequence recordId, java.lang.CharSequence recordType, java.lang.CharSequence stepId, java.lang.CharSequence taskId) {
    this.assetId = assetId;
    this.entityId = entityId;
    this.eventId = eventId;
    this.recordId = recordId;
    this.recordType = recordType;
    this.stepId = stepId;
    this.taskId = taskId;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return assetId;
    case 1: return entityId;
    case 2: return eventId;
    case 3: return recordId;
    case 4: return recordType;
    case 5: return stepId;
    case 6: return taskId;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: assetId = (java.lang.CharSequence)value$; break;
    case 1: entityId = (java.lang.CharSequence)value$; break;
    case 2: eventId = (java.lang.CharSequence)value$; break;
    case 3: recordId = (java.lang.CharSequence)value$; break;
    case 4: recordType = (java.lang.CharSequence)value$; break;
    case 5: stepId = (java.lang.CharSequence)value$; break;
    case 6: taskId = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'assetId' field.
   * @return The value of the 'assetId' field.
   */
  public java.lang.CharSequence getAssetId() {
    return assetId;
  }



  /**
   * Gets the value of the 'entityId' field.
   * @return The value of the 'entityId' field.
   */
  public java.lang.CharSequence getEntityId() {
    return entityId;
  }



  /**
   * Gets the value of the 'eventId' field.
   * @return The value of the 'eventId' field.
   */
  public java.lang.CharSequence getEventId() {
    return eventId;
  }



  /**
   * Gets the value of the 'recordId' field.
   * @return The value of the 'recordId' field.
   */
  public java.lang.CharSequence getRecordId() {
    return recordId;
  }



  /**
   * Gets the value of the 'recordType' field.
   * @return The value of the 'recordType' field.
   */
  public java.lang.CharSequence getRecordType() {
    return recordType;
  }



  /**
   * Gets the value of the 'stepId' field.
   * @return The value of the 'stepId' field.
   */
  public java.lang.CharSequence getStepId() {
    return stepId;
  }



  /**
   * Gets the value of the 'taskId' field.
   * @return The value of the 'taskId' field.
   */
  public java.lang.CharSequence getTaskId() {
    return taskId;
  }



  /**
   * Creates a new TaskUpdatedEvent RecordBuilder.
   * @return A new TaskUpdatedEvent RecordBuilder
   */
  public static com.opengov.eam.event.message.TaskUpdatedEvent.Builder newBuilder() {
    return new com.opengov.eam.event.message.TaskUpdatedEvent.Builder();
  }

  /**
   * Creates a new TaskUpdatedEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TaskUpdatedEvent RecordBuilder
   */
  public static com.opengov.eam.event.message.TaskUpdatedEvent.Builder newBuilder(com.opengov.eam.event.message.TaskUpdatedEvent.Builder other) {
    if (other == null) {
      return new com.opengov.eam.event.message.TaskUpdatedEvent.Builder();
    } else {
      return new com.opengov.eam.event.message.TaskUpdatedEvent.Builder(other);
    }
  }

  /**
   * Creates a new TaskUpdatedEvent RecordBuilder by copying an existing TaskUpdatedEvent instance.
   * @param other The existing instance to copy.
   * @return A new TaskUpdatedEvent RecordBuilder
   */
  public static com.opengov.eam.event.message.TaskUpdatedEvent.Builder newBuilder(com.opengov.eam.event.message.TaskUpdatedEvent other) {
    if (other == null) {
      return new com.opengov.eam.event.message.TaskUpdatedEvent.Builder();
    } else {
      return new com.opengov.eam.event.message.TaskUpdatedEvent.Builder(other);
    }
  }

  /**
   * RecordBuilder for TaskUpdatedEvent instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TaskUpdatedEvent>
    implements org.apache.avro.data.RecordBuilder<TaskUpdatedEvent> {

    private java.lang.CharSequence assetId;
    private java.lang.CharSequence entityId;
    private java.lang.CharSequence eventId;
    private java.lang.CharSequence recordId;
    private java.lang.CharSequence recordType;
    private java.lang.CharSequence stepId;
    private java.lang.CharSequence taskId;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.opengov.eam.event.message.TaskUpdatedEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.assetId)) {
        this.assetId = data().deepCopy(fields()[0].schema(), other.assetId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.entityId)) {
        this.entityId = data().deepCopy(fields()[1].schema(), other.entityId);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.eventId)) {
        this.eventId = data().deepCopy(fields()[2].schema(), other.eventId);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.recordId)) {
        this.recordId = data().deepCopy(fields()[3].schema(), other.recordId);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.recordType)) {
        this.recordType = data().deepCopy(fields()[4].schema(), other.recordType);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.stepId)) {
        this.stepId = data().deepCopy(fields()[5].schema(), other.stepId);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.taskId)) {
        this.taskId = data().deepCopy(fields()[6].schema(), other.taskId);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
    }

    /**
     * Creates a Builder by copying an existing TaskUpdatedEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(com.opengov.eam.event.message.TaskUpdatedEvent other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.assetId)) {
        this.assetId = data().deepCopy(fields()[0].schema(), other.assetId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.entityId)) {
        this.entityId = data().deepCopy(fields()[1].schema(), other.entityId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.eventId)) {
        this.eventId = data().deepCopy(fields()[2].schema(), other.eventId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.recordId)) {
        this.recordId = data().deepCopy(fields()[3].schema(), other.recordId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.recordType)) {
        this.recordType = data().deepCopy(fields()[4].schema(), other.recordType);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.stepId)) {
        this.stepId = data().deepCopy(fields()[5].schema(), other.stepId);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.taskId)) {
        this.taskId = data().deepCopy(fields()[6].schema(), other.taskId);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'assetId' field.
      * @return The value.
      */
    public java.lang.CharSequence getAssetId() {
      return assetId;
    }


    /**
      * Sets the value of the 'assetId' field.
      * @param value The value of 'assetId'.
      * @return This builder.
      */
    public com.opengov.eam.event.message.TaskUpdatedEvent.Builder setAssetId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.assetId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'assetId' field has been set.
      * @return True if the 'assetId' field has been set, false otherwise.
      */
    public boolean hasAssetId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'assetId' field.
      * @return This builder.
      */
    public com.opengov.eam.event.message.TaskUpdatedEvent.Builder clearAssetId() {
      assetId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'entityId' field.
      * @return The value.
      */
    public java.lang.CharSequence getEntityId() {
      return entityId;
    }


    /**
      * Sets the value of the 'entityId' field.
      * @param value The value of 'entityId'.
      * @return This builder.
      */
    public com.opengov.eam.event.message.TaskUpdatedEvent.Builder setEntityId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.entityId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'entityId' field has been set.
      * @return True if the 'entityId' field has been set, false otherwise.
      */
    public boolean hasEntityId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'entityId' field.
      * @return This builder.
      */
    public com.opengov.eam.event.message.TaskUpdatedEvent.Builder clearEntityId() {
      entityId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'eventId' field.
      * @return The value.
      */
    public java.lang.CharSequence getEventId() {
      return eventId;
    }


    /**
      * Sets the value of the 'eventId' field.
      * @param value The value of 'eventId'.
      * @return This builder.
      */
    public com.opengov.eam.event.message.TaskUpdatedEvent.Builder setEventId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.eventId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'eventId' field has been set.
      * @return True if the 'eventId' field has been set, false otherwise.
      */
    public boolean hasEventId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'eventId' field.
      * @return This builder.
      */
    public com.opengov.eam.event.message.TaskUpdatedEvent.Builder clearEventId() {
      eventId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'recordId' field.
      * @return The value.
      */
    public java.lang.CharSequence getRecordId() {
      return recordId;
    }


    /**
      * Sets the value of the 'recordId' field.
      * @param value The value of 'recordId'.
      * @return This builder.
      */
    public com.opengov.eam.event.message.TaskUpdatedEvent.Builder setRecordId(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.recordId = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'recordId' field has been set.
      * @return True if the 'recordId' field has been set, false otherwise.
      */
    public boolean hasRecordId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'recordId' field.
      * @return This builder.
      */
    public com.opengov.eam.event.message.TaskUpdatedEvent.Builder clearRecordId() {
      recordId = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'recordType' field.
      * @return The value.
      */
    public java.lang.CharSequence getRecordType() {
      return recordType;
    }


    /**
      * Sets the value of the 'recordType' field.
      * @param value The value of 'recordType'.
      * @return This builder.
      */
    public com.opengov.eam.event.message.TaskUpdatedEvent.Builder setRecordType(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.recordType = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'recordType' field has been set.
      * @return True if the 'recordType' field has been set, false otherwise.
      */
    public boolean hasRecordType() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'recordType' field.
      * @return This builder.
      */
    public com.opengov.eam.event.message.TaskUpdatedEvent.Builder clearRecordType() {
      recordType = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'stepId' field.
      * @return The value.
      */
    public java.lang.CharSequence getStepId() {
      return stepId;
    }


    /**
      * Sets the value of the 'stepId' field.
      * @param value The value of 'stepId'.
      * @return This builder.
      */
    public com.opengov.eam.event.message.TaskUpdatedEvent.Builder setStepId(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.stepId = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'stepId' field has been set.
      * @return True if the 'stepId' field has been set, false otherwise.
      */
    public boolean hasStepId() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'stepId' field.
      * @return This builder.
      */
    public com.opengov.eam.event.message.TaskUpdatedEvent.Builder clearStepId() {
      stepId = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'taskId' field.
      * @return The value.
      */
    public java.lang.CharSequence getTaskId() {
      return taskId;
    }


    /**
      * Sets the value of the 'taskId' field.
      * @param value The value of 'taskId'.
      * @return This builder.
      */
    public com.opengov.eam.event.message.TaskUpdatedEvent.Builder setTaskId(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.taskId = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'taskId' field has been set.
      * @return True if the 'taskId' field has been set, false otherwise.
      */
    public boolean hasTaskId() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'taskId' field.
      * @return This builder.
      */
    public com.opengov.eam.event.message.TaskUpdatedEvent.Builder clearTaskId() {
      taskId = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TaskUpdatedEvent build() {
      try {
        TaskUpdatedEvent record = new TaskUpdatedEvent();
        record.assetId = fieldSetFlags()[0] ? this.assetId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.entityId = fieldSetFlags()[1] ? this.entityId : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.eventId = fieldSetFlags()[2] ? this.eventId : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.recordId = fieldSetFlags()[3] ? this.recordId : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.recordType = fieldSetFlags()[4] ? this.recordType : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.stepId = fieldSetFlags()[5] ? this.stepId : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.taskId = fieldSetFlags()[6] ? this.taskId : (java.lang.CharSequence) defaultValue(fields()[6]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TaskUpdatedEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<TaskUpdatedEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TaskUpdatedEvent>
    READER$ = (org.apache.avro.io.DatumReader<TaskUpdatedEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.assetId == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.assetId);
    }

    out.writeString(this.entityId);

    out.writeString(this.eventId);

    out.writeString(this.recordId);

    out.writeString(this.recordType);

    out.writeString(this.stepId);

    out.writeString(this.taskId);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.assetId = null;
      } else {
        this.assetId = in.readString(this.assetId instanceof Utf8 ? (Utf8)this.assetId : null);
      }

      this.entityId = in.readString(this.entityId instanceof Utf8 ? (Utf8)this.entityId : null);

      this.eventId = in.readString(this.eventId instanceof Utf8 ? (Utf8)this.eventId : null);

      this.recordId = in.readString(this.recordId instanceof Utf8 ? (Utf8)this.recordId : null);

      this.recordType = in.readString(this.recordType instanceof Utf8 ? (Utf8)this.recordType : null);

      this.stepId = in.readString(this.stepId instanceof Utf8 ? (Utf8)this.stepId : null);

      this.taskId = in.readString(this.taskId instanceof Utf8 ? (Utf8)this.taskId : null);

    } else {
      for (int i = 0; i < 7; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.assetId = null;
          } else {
            this.assetId = in.readString(this.assetId instanceof Utf8 ? (Utf8)this.assetId : null);
          }
          break;

        case 1:
          this.entityId = in.readString(this.entityId instanceof Utf8 ? (Utf8)this.entityId : null);
          break;

        case 2:
          this.eventId = in.readString(this.eventId instanceof Utf8 ? (Utf8)this.eventId : null);
          break;

        case 3:
          this.recordId = in.readString(this.recordId instanceof Utf8 ? (Utf8)this.recordId : null);
          break;

        case 4:
          this.recordType = in.readString(this.recordType instanceof Utf8 ? (Utf8)this.recordType : null);
          break;

        case 5:
          this.stepId = in.readString(this.stepId instanceof Utf8 ? (Utf8)this.stepId : null);
          break;

        case 6:
          this.taskId = in.readString(this.taskId instanceof Utf8 ? (Utf8)this.taskId : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










