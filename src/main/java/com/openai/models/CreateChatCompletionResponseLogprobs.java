// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonSerializable;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The CreateChatCompletionResponseLogprobs model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class CreateChatCompletionResponseLogprobs
    implements JsonSerializable<CreateChatCompletionResponseLogprobs> {
    /*
     * The content property.
     */
    @Metadata(generated = true)
    private final List<ChatCompletionTokenLogprob> content;

    /**
     * Creates an instance of CreateChatCompletionResponseLogprobs class.
     * 
     * @param content the content value to set.
     */
    @Metadata(generated = true)
    private CreateChatCompletionResponseLogprobs(List<ChatCompletionTokenLogprob> content) {
        this.content = content;
    }

    /**
     * Get the content property: The content property.
     * 
     * @return the content value.
     */
    @Metadata(generated = true)
    public List<ChatCompletionTokenLogprob> getContent() {
        return this.content;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("content", this.content, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CreateChatCompletionResponseLogprobs from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateChatCompletionResponseLogprobs if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CreateChatCompletionResponseLogprobs.
     */
    @Metadata(generated = true)
    public static CreateChatCompletionResponseLogprobs fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<ChatCompletionTokenLogprob> content = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("content".equals(fieldName)) {
                    content = reader.readArray(reader1 -> ChatCompletionTokenLogprob.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            return new CreateChatCompletionResponseLogprobs(content);
        });
    }
}
