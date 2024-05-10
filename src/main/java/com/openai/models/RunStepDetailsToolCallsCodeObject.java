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
 * Details of the Code Interpreter tool call the run step was involved in.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class RunStepDetailsToolCallsCodeObject implements JsonSerializable<RunStepDetailsToolCallsCodeObject> {
    /*
     * The ID of the tool call.
     */
    @Metadata(generated = true)
    private final String id;

    /*
     * The type of tool call. This is always going to be `code_interpreter` for this type of tool
     * call.
     */
    @Metadata(generated = true)
    private final String type = "code_interpreter";

    /*
     * The Code Interpreter tool call definition.
     */
    @Metadata(generated = true)
    private final RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter;

    /**
     * Creates an instance of RunStepDetailsToolCallsCodeObject class.
     * 
     * @param id the id value to set.
     * @param codeInterpreter the codeInterpreter value to set.
     */
    @Metadata(generated = true)
    private RunStepDetailsToolCallsCodeObject(String id,
        RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter) {
        this.id = id;
        this.codeInterpreter = codeInterpreter;
    }

    /**
     * Get the id property: The ID of the tool call.
     * 
     * @return the id value.
     */
    @Metadata(generated = true)
    public String getId() {
        return this.id;
    }

    /**
     * Get the type property: The type of tool call. This is always going to be `code_interpreter` for this type of tool
     * call.
     * 
     * @return the type value.
     */
    @Metadata(generated = true)
    public String getType() {
        return this.type;
    }

    /**
     * Get the codeInterpreter property: The Code Interpreter tool call definition.
     * 
     * @return the codeInterpreter value.
     */
    @Metadata(generated = true)
    public RunStepDetailsToolCallsCodeObjectCodeInterpreter getCodeInterpreter() {
        return this.codeInterpreter;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeJsonField("code_interpreter", this.codeInterpreter);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunStepDetailsToolCallsCodeObject from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunStepDetailsToolCallsCodeObject if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RunStepDetailsToolCallsCodeObject.
     */
    @Metadata(generated = true)
    public static RunStepDetailsToolCallsCodeObject fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String id = null;
            RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("code_interpreter".equals(fieldName)) {
                    codeInterpreter = RunStepDetailsToolCallsCodeObjectCodeInterpreter.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return new RunStepDetailsToolCallsCodeObject(id, codeInterpreter);
        });
    }
}
