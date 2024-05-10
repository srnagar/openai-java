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
 * The AssistantToolsCode model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class AssistantToolsCode implements JsonSerializable<AssistantToolsCode> {
    /*
     * The type of tool being defined: `code_interpreter`
     */
    @Metadata(generated = true)
    private final String type = "code_interpreter";

    /**
     * Creates an instance of AssistantToolsCode class.
     */
    @Metadata(generated = true)
    public AssistantToolsCode() {
    }

    /**
     * Get the type property: The type of tool being defined: `code_interpreter`.
     * 
     * @return the type value.
     */
    @Metadata(generated = true)
    public String getType() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AssistantToolsCode from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AssistantToolsCode if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AssistantToolsCode.
     */
    @Metadata(generated = true)
    public static AssistantToolsCode fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                reader.skipChildren();
            }
            return new AssistantToolsCode();
        });
    }
}
