// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonSerializable;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;

/**
 * Deletes the association between the assistant and the file, but does not delete the
 * [File](/docs/api-reference/files) object itself.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class DeleteAssistantFileResponse implements JsonSerializable<DeleteAssistantFileResponse> {
    /*
     * The id property.
     */
    @Metadata(generated = true)
    private final String id;

    /*
     * The deleted property.
     */
    @Metadata(generated = true)
    private final boolean deleted;

    /*
     * The object property.
     */
    @Metadata(generated = true)
    private final String object = "assistant.file.deleted";

    /**
     * Creates an instance of DeleteAssistantFileResponse class.
     * 
     * @param id the id value to set.
     * @param deleted the deleted value to set.
     */
    @Metadata(generated = true)
    private DeleteAssistantFileResponse(String id, boolean deleted) {
        this.id = id;
        this.deleted = deleted;
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
     * Get the deleted property: The deleted property.
     * 
     * @return the deleted value.
     */
    @Metadata(generated = true)
    public boolean isDeleted() {
        return this.deleted;
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
        jsonWriter.writeBooleanField("deleted", this.deleted);
        jsonWriter.writeStringField("object", this.object);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeleteAssistantFileResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeleteAssistantFileResponse if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DeleteAssistantFileResponse.
     */
    @Metadata(generated = true)
    public static DeleteAssistantFileResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            boolean deleted = false;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("deleted".equals(fieldName)) {
                    deleted = reader.getBoolean();
                } else {
                    reader.skipChildren();
                }
            }
            return new DeleteAssistantFileResponse(id, deleted);
        });
    }
}