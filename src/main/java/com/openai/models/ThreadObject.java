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
import java.util.Map;

/**
 * Represents a thread that contains [messages](/docs/api-reference/messages).
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class ThreadObject implements JsonSerializable<ThreadObject> {
    /*
     * The identifier, which can be referenced in API endpoints.
     */
    @Metadata(generated = true)
    private final String id;

    /*
     * The object type, which is always `thread`.
     */
    @Metadata(generated = true)
    private final String object = "thread";

    /*
     * The Unix timestamp (in seconds) for when the thread was created.
     */
    @Metadata(generated = true)
    private final long createdAt;

    /*
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing
     * additional information about the object in a structured format. Keys can be a maximum of 64
     * characters long and values can be a maxium of 512 characters long.
     */
    @Metadata(generated = true)
    private final Map<String, String> metadata;

    /**
     * Creates an instance of ThreadObject class.
     * 
     * @param id the id value to set.
     * @param createdAt the createdAt value to set.
     * @param metadata the metadata value to set.
     */
    @Metadata(generated = true)
    private ThreadObject(String id, OffsetDateTime createdAt, Map<String, String> metadata) {
        this.id = id;
        this.createdAt = createdAt.toEpochSecond();
        this.metadata = metadata;
    }

    /**
     * Get the id property: The identifier, which can be referenced in API endpoints.
     * 
     * @return the id value.
     */
    @Metadata(generated = true)
    public String getId() {
        return this.id;
    }

    /**
     * Get the object property: The object type, which is always `thread`.
     * 
     * @return the object value.
     */
    @Metadata(generated = true)
    public String getObject() {
        return this.object;
    }

    /**
     * Get the createdAt property: The Unix timestamp (in seconds) for when the thread was created.
     * 
     * @return the createdAt value.
     */
    @Metadata(generated = true)
    public OffsetDateTime getCreatedAt() {
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.createdAt), ZoneOffset.UTC);
    }

    /**
     * Get the metadata property: Set of 16 key-value pairs that can be attached to an object. This can be useful for
     * storing
     * additional information about the object in a structured format. Keys can be a maximum of 64
     * characters long and values can be a maxium of 512 characters long.
     * 
     * @return the metadata value.
     */
    @Metadata(generated = true)
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("object", this.object);
        jsonWriter.writeLongField("created_at", this.createdAt);
        jsonWriter.writeMapField("metadata", this.metadata, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ThreadObject from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ThreadObject if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ThreadObject.
     */
    @Metadata(generated = true)
    public static ThreadObject fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            OffsetDateTime createdAt = null;
            Map<String, String> metadata = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("created_at".equals(fieldName)) {
                    createdAt = OffsetDateTime.ofInstant(Instant.ofEpochSecond(reader.getLong()), ZoneOffset.UTC);
                } else if ("metadata".equals(fieldName)) {
                    metadata = reader.readMap(reader1 -> reader1.getString());
                } else {
                    reader.skipChildren();
                }
            }
            return new ThreadObject(id, createdAt, metadata);
        });
    }
}
