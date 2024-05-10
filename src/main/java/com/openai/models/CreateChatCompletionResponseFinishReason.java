// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

/**
 * Defines values for CreateChatCompletionResponseFinishReason.
 */
public enum CreateChatCompletionResponseFinishReason {
    /**
     * Enum value stop.
     */
    STOP("stop"),

    /**
     * Enum value length.
     */
    LENGTH("length"),

    /**
     * Enum value tool_calls.
     */
    TOOL_CALLS("tool_calls"),

    /**
     * Enum value content_filter.
     */
    CONTENT_FILTER("content_filter"),

    /**
     * Enum value function_call.
     */
    FUNCTION_CALL("function_call");

    /**
     * The actual serialized value for a CreateChatCompletionResponseFinishReason instance.
     */
    private final String value;

    CreateChatCompletionResponseFinishReason(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CreateChatCompletionResponseFinishReason instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed CreateChatCompletionResponseFinishReason object, or null if unable to parse.
     */
    public static CreateChatCompletionResponseFinishReason fromString(String value) {
        if (value == null) {
            return null;
        }
        CreateChatCompletionResponseFinishReason[] items = CreateChatCompletionResponseFinishReason.values();
        for (CreateChatCompletionResponseFinishReason item : items) {
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
