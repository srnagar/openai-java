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
 * The FineTuningJobError model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class FineTuningJobError implements JsonSerializable<FineTuningJobError> {
    /*
     * A machine-readable error code.
     */
    @Metadata(generated = true)
    private final String code;

    /*
     * A human-readable error message.
     */
    @Metadata(generated = true)
    private final String message;

    /*
     * The parameter that was invalid, usually `training_file` or `validation_file`. This field will
     * be null if the failure was not parameter-specific.
     */
    @Metadata(generated = true)
    private final String param;

    /**
     * Creates an instance of FineTuningJobError class.
     * 
     * @param code the code value to set.
     * @param message the message value to set.
     * @param param the param value to set.
     */
    @Metadata(generated = true)
    private FineTuningJobError(String code, String message, String param) {
        this.code = code;
        this.message = message;
        this.param = param;
    }

    /**
     * Get the code property: A machine-readable error code.
     * 
     * @return the code value.
     */
    @Metadata(generated = true)
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message property: A human-readable error message.
     * 
     * @return the message value.
     */
    @Metadata(generated = true)
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the param property: The parameter that was invalid, usually `training_file` or `validation_file`. This field
     * will
     * be null if the failure was not parameter-specific.
     * 
     * @return the param value.
     */
    @Metadata(generated = true)
    public String getParam() {
        return this.param;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("code", this.code);
        jsonWriter.writeStringField("message", this.message);
        jsonWriter.writeStringField("param", this.param);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FineTuningJobError from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FineTuningJobError if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FineTuningJobError.
     */
    @Metadata(generated = true)
    public static FineTuningJobError fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String code = null;
            String message = null;
            String param = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code".equals(fieldName)) {
                    code = reader.getString();
                } else if ("message".equals(fieldName)) {
                    message = reader.getString();
                } else if ("param".equals(fieldName)) {
                    param = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new FineTuningJobError(code, message, param);
        });
    }
}
