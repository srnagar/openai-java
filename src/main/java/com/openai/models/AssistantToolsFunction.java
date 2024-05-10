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
 * The AssistantToolsFunction model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class AssistantToolsFunction implements JsonSerializable<AssistantToolsFunction> {
    /*
     * The type of tool being defined: `function`
     */
    @Metadata(generated = true)
    private final String type = "function";

    /*
     * The function property.
     */
    @Metadata(generated = true)
    private final FunctionObject function;

    /**
     * Creates an instance of AssistantToolsFunction class.
     * 
     * @param function the function value to set.
     */
    @Metadata(generated = true)
    public AssistantToolsFunction(FunctionObject function) {
        this.function = function;
    }

    /**
     * Get the type property: The type of tool being defined: `function`.
     * 
     * @return the type value.
     */
    @Metadata(generated = true)
    public String getType() {
        return this.type;
    }

    /**
     * Get the function property: The function property.
     * 
     * @return the function value.
     */
    @Metadata(generated = true)
    public FunctionObject getFunction() {
        return this.function;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeJsonField("function", this.function);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AssistantToolsFunction from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AssistantToolsFunction if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AssistantToolsFunction.
     */
    @Metadata(generated = true)
    public static AssistantToolsFunction fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FunctionObject function = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("function".equals(fieldName)) {
                    function = FunctionObject.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return new AssistantToolsFunction(function);
        });
    }
}
