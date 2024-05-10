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
 * The RunStepDetailsToolCallsCodeOutputImageObject model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class RunStepDetailsToolCallsCodeOutputImageObject
    implements JsonSerializable<RunStepDetailsToolCallsCodeOutputImageObject> {
    /*
     * Always `image`.
     */
    @Metadata(generated = true)
    private final String type = "image";

    /*
     * The image property.
     */
    @Metadata(generated = true)
    private final RunStepDetailsToolCallsCodeOutputImageObjectImage image;

    /**
     * Creates an instance of RunStepDetailsToolCallsCodeOutputImageObject class.
     * 
     * @param image the image value to set.
     */
    @Metadata(generated = true)
    private RunStepDetailsToolCallsCodeOutputImageObject(RunStepDetailsToolCallsCodeOutputImageObjectImage image) {
        this.image = image;
    }

    /**
     * Get the type property: Always `image`.
     * 
     * @return the type value.
     */
    @Metadata(generated = true)
    public String getType() {
        return this.type;
    }

    /**
     * Get the image property: The image property.
     * 
     * @return the image value.
     */
    @Metadata(generated = true)
    public RunStepDetailsToolCallsCodeOutputImageObjectImage getImage() {
        return this.image;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeJsonField("image", this.image);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunStepDetailsToolCallsCodeOutputImageObject from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunStepDetailsToolCallsCodeOutputImageObject if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RunStepDetailsToolCallsCodeOutputImageObject.
     */
    @Metadata(generated = true)
    public static RunStepDetailsToolCallsCodeOutputImageObject fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RunStepDetailsToolCallsCodeOutputImageObjectImage image = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("image".equals(fieldName)) {
                    image = RunStepDetailsToolCallsCodeOutputImageObjectImage.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return new RunStepDetailsToolCallsCodeOutputImageObject(image);
        });
    }
}
