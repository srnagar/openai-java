// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonSerializable;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

/**
 * Represents a verbose json transcription response returned by model, based on the provided input.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class CreateTranscriptionResponseVerboseJson
    implements JsonSerializable<CreateTranscriptionResponseVerboseJson> {
    /*
     * The task label.
     */
    @Metadata(generated = true)
    private final String task = "transcribe";

    /*
     * The language of the input audio.
     */
    @Metadata(generated = true)
    private final String language;

    /*
     * The duration of the input audio.
     */
    @Metadata(generated = true)
    private final double duration;

    /*
     * The transcribed text.
     */
    @Metadata(generated = true)
    private final String text;

    /*
     * Extracted words and their corresponding timestamps.
     */
    @Metadata(generated = true)
    private List<TranscriptionWord> words;

    /*
     * Segments of the transcribed text and their corresponding details.
     */
    @Metadata(generated = true)
    private List<TranscriptionSegment> segments;

    /**
     * Creates an instance of CreateTranscriptionResponseVerboseJson class.
     * 
     * @param language the language value to set.
     * @param duration the duration value to set.
     * @param text the text value to set.
     */
    @Metadata(generated = true)
    private CreateTranscriptionResponseVerboseJson(String language, Duration duration, String text) {
        this.language = language;
        this.duration = (double) duration.toNanos() / 1000_000_000L;
        this.text = text;
    }

    /**
     * Get the task property: The task label.
     * 
     * @return the task value.
     */
    @Metadata(generated = true)
    public String getTask() {
        return this.task;
    }

    /**
     * Get the language property: The language of the input audio.
     * 
     * @return the language value.
     */
    @Metadata(generated = true)
    public String getLanguage() {
        return this.language;
    }

    /**
     * Get the duration property: The duration of the input audio.
     * 
     * @return the duration value.
     */
    @Metadata(generated = true)
    public Duration getDuration() {
        return Duration.ofNanos((long) (this.duration * 1000_000_000L));
    }

    /**
     * Get the text property: The transcribed text.
     * 
     * @return the text value.
     */
    @Metadata(generated = true)
    public String getText() {
        return this.text;
    }

    /**
     * Get the words property: Extracted words and their corresponding timestamps.
     * 
     * @return the words value.
     */
    @Metadata(generated = true)
    public List<TranscriptionWord> getWords() {
        return this.words;
    }

    /**
     * Get the segments property: Segments of the transcribed text and their corresponding details.
     * 
     * @return the segments value.
     */
    @Metadata(generated = true)
    public List<TranscriptionSegment> getSegments() {
        return this.segments;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("task", this.task);
        jsonWriter.writeStringField("language", this.language);
        jsonWriter.writeDoubleField("duration", this.duration);
        jsonWriter.writeStringField("text", this.text);
        jsonWriter.writeArrayField("words", this.words, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("segments", this.segments, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CreateTranscriptionResponseVerboseJson from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateTranscriptionResponseVerboseJson if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CreateTranscriptionResponseVerboseJson.
     */
    @Metadata(generated = true)
    public static CreateTranscriptionResponseVerboseJson fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String language = null;
            Duration duration = null;
            String text = null;
            List<TranscriptionWord> words = null;
            List<TranscriptionSegment> segments = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("language".equals(fieldName)) {
                    language = reader.getString();
                } else if ("duration".equals(fieldName)) {
                    duration = Duration.ofNanos((long) (reader.getDouble() * 1000_000_000L));
                } else if ("text".equals(fieldName)) {
                    text = reader.getString();
                } else if ("words".equals(fieldName)) {
                    words = reader.readArray(reader1 -> TranscriptionWord.fromJson(reader1));
                } else if ("segments".equals(fieldName)) {
                    segments = reader.readArray(reader1 -> TranscriptionSegment.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            CreateTranscriptionResponseVerboseJson deserializedCreateTranscriptionResponseVerboseJson
                = new CreateTranscriptionResponseVerboseJson(language, duration, text);
            deserializedCreateTranscriptionResponseVerboseJson.words = words;
            deserializedCreateTranscriptionResponseVerboseJson.segments = segments;

            return deserializedCreateTranscriptionResponseVerboseJson;
        });
    }
}
