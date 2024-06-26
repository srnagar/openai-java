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
 * The RunToolCallObjectFunction model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class RunToolCallObjectFunction implements JsonSerializable<RunToolCallObjectFunction> {
    /*
     * The name of the function.
     */
    @Metadata(generated = true)
    private final String name;

    /*
     * The arguments that the model expects you to pass to the function.
     */
    @Metadata(generated = true)
    private final String arguments;

    /**
     * Creates an instance of RunToolCallObjectFunction class.
     * 
     * @param name the name value to set.
     * @param arguments the arguments value to set.
     */
    @Metadata(generated = true)
    private RunToolCallObjectFunction(String name, String arguments) {
        this.name = name;
        this.arguments = arguments;
    }

    /**
     * Get the name property: The name of the function.
     * 
     * @return the name value.
     */
    @Metadata(generated = true)
    public String getName() {
        return this.name;
    }

    /**
     * Get the arguments property: The arguments that the model expects you to pass to the function.
     * 
     * @return the arguments value.
     */
    @Metadata(generated = true)
    public String getArguments() {
        return this.arguments;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("arguments", this.arguments);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunToolCallObjectFunction from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunToolCallObjectFunction if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RunToolCallObjectFunction.
     */
    @Metadata(generated = true)
    public static RunToolCallObjectFunction fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String name = null;
            String arguments = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else if ("arguments".equals(fieldName)) {
                    arguments = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new RunToolCallObjectFunction(name, arguments);
        });
    }
}
