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
 * The ChatCompletionRequestMessageContentPartImage model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class ChatCompletionRequestMessageContentPartImage
    implements JsonSerializable<ChatCompletionRequestMessageContentPartImage> {
    /*
     * The type of the content part.
     */
    @Metadata(generated = true)
    private final String type = "image_url";

    /*
     * The image_url property.
     */
    @Metadata(generated = true)
    private final ChatCompletionRequestMessageContentPartImageImageUrl imageUrl;

    /**
     * Creates an instance of ChatCompletionRequestMessageContentPartImage class.
     * 
     * @param imageUrl the imageUrl value to set.
     */
    @Metadata(generated = true)
    public ChatCompletionRequestMessageContentPartImage(ChatCompletionRequestMessageContentPartImageImageUrl imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * Get the type property: The type of the content part.
     * 
     * @return the type value.
     */
    @Metadata(generated = true)
    public String getType() {
        return this.type;
    }

    /**
     * Get the imageUrl property: The image_url property.
     * 
     * @return the imageUrl value.
     */
    @Metadata(generated = true)
    public ChatCompletionRequestMessageContentPartImageImageUrl getImageUrl() {
        return this.imageUrl;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeJsonField("image_url", this.imageUrl);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ChatCompletionRequestMessageContentPartImage from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ChatCompletionRequestMessageContentPartImage if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ChatCompletionRequestMessageContentPartImage.
     */
    @Metadata(generated = true)
    public static ChatCompletionRequestMessageContentPartImage fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ChatCompletionRequestMessageContentPartImageImageUrl imageUrl = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("image_url".equals(fieldName)) {
                    imageUrl = ChatCompletionRequestMessageContentPartImageImageUrl.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return new ChatCompletionRequestMessageContentPartImage(imageUrl);
        });
    }
}