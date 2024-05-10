// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

/**
 * Defines values for CreateSpeechRequestResponseFormat.
 */
public enum CreateSpeechRequestResponseFormat {
    /**
     * Enum value mp3.
     */
    MP3("mp3"),

    /**
     * Enum value opus.
     */
    OPUS("opus"),

    /**
     * Enum value aac.
     */
    AAC("aac"),

    /**
     * Enum value flac.
     */
    FLAC("flac"),

    /**
     * Enum value wav.
     */
    WAV("wav"),

    /**
     * Enum value pcm.
     */
    PCM("pcm");

    /**
     * The actual serialized value for a CreateSpeechRequestResponseFormat instance.
     */
    private final String value;

    CreateSpeechRequestResponseFormat(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CreateSpeechRequestResponseFormat instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed CreateSpeechRequestResponseFormat object, or null if unable to parse.
     */
    public static CreateSpeechRequestResponseFormat fromString(String value) {
        if (value == null) {
            return null;
        }
        CreateSpeechRequestResponseFormat[] items = CreateSpeechRequestResponseFormat.values();
        for (CreateSpeechRequestResponseFormat item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}