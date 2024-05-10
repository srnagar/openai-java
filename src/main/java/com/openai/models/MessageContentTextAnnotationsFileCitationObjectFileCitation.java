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
 * The MessageContentTextAnnotationsFileCitationObjectFileCitation model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class MessageContentTextAnnotationsFileCitationObjectFileCitation
    implements JsonSerializable<MessageContentTextAnnotationsFileCitationObjectFileCitation> {
    /*
     * The ID of the specific File the citation is from.
     */
    @Metadata(generated = true)
    private final String fileId;

    /*
     * The specific quote in the file.
     */
    @Metadata(generated = true)
    private final String quote;

    /**
     * Creates an instance of MessageContentTextAnnotationsFileCitationObjectFileCitation class.
     * 
     * @param fileId the fileId value to set.
     * @param quote the quote value to set.
     */
    @Metadata(generated = true)
    private MessageContentTextAnnotationsFileCitationObjectFileCitation(String fileId, String quote) {
        this.fileId = fileId;
        this.quote = quote;
    }

    /**
     * Get the fileId property: The ID of the specific File the citation is from.
     * 
     * @return the fileId value.
     */
    @Metadata(generated = true)
    public String getFileId() {
        return this.fileId;
    }

    /**
     * Get the quote property: The specific quote in the file.
     * 
     * @return the quote value.
     */
    @Metadata(generated = true)
    public String getQuote() {
        return this.quote;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("file_id", this.fileId);
        jsonWriter.writeStringField("quote", this.quote);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MessageContentTextAnnotationsFileCitationObjectFileCitation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MessageContentTextAnnotationsFileCitationObjectFileCitation if the JsonReader was pointing
     * to an instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the
     * MessageContentTextAnnotationsFileCitationObjectFileCitation.
     */
    @Metadata(generated = true)
    public static MessageContentTextAnnotationsFileCitationObjectFileCitation fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            String fileId = null;
            String quote = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("file_id".equals(fieldName)) {
                    fileId = reader.getString();
                } else if ("quote".equals(fieldName)) {
                    quote = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new MessageContentTextAnnotationsFileCitationObjectFileCitation(fileId, quote);
        });
    }
}