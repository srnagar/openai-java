// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonSerializable;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * Fine-tuning job event object.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class FineTuningJobEvent implements JsonSerializable<FineTuningJobEvent> {
    /*
     * The id property.
     */
    @Metadata(generated = true)
    private final String id;

    /*
     * The created_at property.
     */
    @Metadata(generated = true)
    private final long createdAt;

    /*
     * The level property.
     */
    @Metadata(generated = true)
    private final FineTuningJobEventLevel level;

    /*
     * The message property.
     */
    @Metadata(generated = true)
    private final String message;

    /*
     * The object property.
     */
    @Metadata(generated = true)
    private final String object = "fine_tuning.job.event";

    /**
     * Creates an instance of FineTuningJobEvent class.
     * 
     * @param id the id value to set.
     * @param createdAt the createdAt value to set.
     * @param level the level value to set.
     * @param message the message value to set.
     */
    @Metadata(generated = true)
    private FineTuningJobEvent(String id, OffsetDateTime createdAt, FineTuningJobEventLevel level, String message) {
        this.id = id;
        this.createdAt = createdAt.toEpochSecond();
        this.level = level;
        this.message = message;
    }

    /**
     * Get the id property: The id property.
     * 
     * @return the id value.
     */
    @Metadata(generated = true)
    public String getId() {
        return this.id;
    }

    /**
     * Get the createdAt property: The created_at property.
     * 
     * @return the createdAt value.
     */
    @Metadata(generated = true)
    public OffsetDateTime getCreatedAt() {
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.createdAt), ZoneOffset.UTC);
    }

    /**
     * Get the level property: The level property.
     * 
     * @return the level value.
     */
    @Metadata(generated = true)
    public FineTuningJobEventLevel getLevel() {
        return this.level;
    }

    /**
     * Get the message property: The message property.
     * 
     * @return the message value.
     */
    @Metadata(generated = true)
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the object property: The object property.
     * 
     * @return the object value.
     */
    @Metadata(generated = true)
    public String getObject() {
        return this.object;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeLongField("created_at", this.createdAt);
        jsonWriter.writeStringField("level", this.level == null ? null : this.level.toString());
        jsonWriter.writeStringField("message", this.message);
        jsonWriter.writeStringField("object", this.object);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FineTuningJobEvent from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FineTuningJobEvent if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FineTuningJobEvent.
     */
    @Metadata(generated = true)
    public static FineTuningJobEvent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            OffsetDateTime createdAt = null;
            FineTuningJobEventLevel level = null;
            String message = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("created_at".equals(fieldName)) {
                    createdAt = OffsetDateTime.ofInstant(Instant.ofEpochSecond(reader.getLong()), ZoneOffset.UTC);
                } else if ("level".equals(fieldName)) {
                    level = FineTuningJobEventLevel.fromString(reader.getString());
                } else if ("message".equals(fieldName)) {
                    message = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new FineTuningJobEvent(id, createdAt, level, message);
        });
    }
}
