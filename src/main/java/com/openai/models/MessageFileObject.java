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
 * A list of files attached to a `message`.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class MessageFileObject implements JsonSerializable<MessageFileObject> {
    /*
     * TThe identifier, which can be referenced in API endpoints.
     */
    @Metadata(generated = true)
    private final String id;

    /*
     * The object type, which is always `thread.message.file`.
     */
    @Metadata(generated = true)
    private final String object = "thread.message.file";

    /*
     * The Unix timestamp (in seconds) for when the message file was created.
     */
    @Metadata(generated = true)
    private final long createdAt;

    /*
     * The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to.
     */
    @Metadata(generated = true)
    private final String messageId;

    /**
     * Creates an instance of MessageFileObject class.
     * 
     * @param id the id value to set.
     * @param createdAt the createdAt value to set.
     * @param messageId the messageId value to set.
     */
    @Metadata(generated = true)
    private MessageFileObject(String id, OffsetDateTime createdAt, String messageId) {
        this.id = id;
        this.createdAt = createdAt.toEpochSecond();
        this.messageId = messageId;
    }

    /**
     * Get the id property: TThe identifier, which can be referenced in API endpoints.
     * 
     * @return the id value.
     */
    @Metadata(generated = true)
    public String getId() {
        return this.id;
    }

    /**
     * Get the object property: The object type, which is always `thread.message.file`.
     * 
     * @return the object value.
     */
    @Metadata(generated = true)
    public String getObject() {
        return this.object;
    }

    /**
     * Get the createdAt property: The Unix timestamp (in seconds) for when the message file was created.
     * 
     * @return the createdAt value.
     */
    @Metadata(generated = true)
    public OffsetDateTime getCreatedAt() {
        return OffsetDateTime.ofInstant(Instant.ofEpochSecond(this.createdAt), ZoneOffset.UTC);
    }

    /**
     * Get the messageId property: The ID of the [message](/docs/api-reference/messages) that the
     * [File](/docs/api-reference/files) is attached to.
     * 
     * @return the messageId value.
     */
    @Metadata(generated = true)
    public String getMessageId() {
        return this.messageId;
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
        jsonWriter.writeStringField("message_id", this.messageId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MessageFileObject from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MessageFileObject if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MessageFileObject.
     */
    @Metadata(generated = true)
    public static MessageFileObject fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            OffsetDateTime createdAt = null;
            String messageId = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("created_at".equals(fieldName)) {
                    createdAt = OffsetDateTime.ofInstant(Instant.ofEpochSecond(reader.getLong()), ZoneOffset.UTC);
                } else if ("message_id".equals(fieldName)) {
                    messageId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new MessageFileObject(id, createdAt, messageId);
        });
    }
}
