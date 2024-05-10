// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

/**
 * Defines values for CreateCompletionResponseFinishReason.
 */
public enum CreateCompletionResponseFinishReason {
    /**
     * Enum value stop.
     */
    STOP("stop"),

    /**
     * Enum value length.
     */
    LENGTH("length"),

    /**
     * Enum value content_filter.
     */
    CONTENT_FILTER("content_filter");

    /**
     * The actual serialized value for a CreateCompletionResponseFinishReason instance.
     */
    private final String value;

    CreateCompletionResponseFinishReason(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CreateCompletionResponseFinishReason instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed CreateCompletionResponseFinishReason object, or null if unable to parse.
     */
    public static CreateCompletionResponseFinishReason fromString(String value) {
        if (value == null) {
            return null;
        }
        CreateCompletionResponseFinishReason[] items = CreateCompletionResponseFinishReason.values();
        for (CreateCompletionResponseFinishReason item : items) {
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