// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonSerializable;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * The ModifyRunRequest model.
 */
@Metadata(conditions = { TypeConditions.FLUENT })
public final class ModifyRunRequest implements JsonSerializable<ModifyRunRequest> {
    /*
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing
     * additional information about the object in a structured format. Keys can be a maximum of 64
     * characters long and values can be a maxium of 512 characters long.
     */
    @Metadata(generated = true)
    private Map<String, String> metadata;

    /**
     * Creates an instance of ModifyRunRequest class.
     */
    @Metadata(generated = true)
    public ModifyRunRequest() {
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
     * Set the metadata property: Set of 16 key-value pairs that can be attached to an object. This can be useful for
     * storing
     * additional information about the object in a structured format. Keys can be a maximum of 64
     * characters long and values can be a maxium of 512 characters long.
     * 
     * @param metadata the metadata value to set.
     * @return the ModifyRunRequest object itself.
     */
    @Metadata(generated = true)
    public ModifyRunRequest setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("metadata", this.metadata, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ModifyRunRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ModifyRunRequest if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ModifyRunRequest.
     */
    @Metadata(generated = true)
    public static ModifyRunRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ModifyRunRequest deserializedModifyRunRequest = new ModifyRunRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("metadata".equals(fieldName)) {
                    Map<String, String> metadata = reader.readMap(reader1 -> reader1.getString());
                    deserializedModifyRunRequest.metadata = metadata;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedModifyRunRequest;
        });
    }
}
