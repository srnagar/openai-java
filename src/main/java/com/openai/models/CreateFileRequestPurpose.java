// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

/**
 * Defines values for CreateFileRequestPurpose.
 */
public enum CreateFileRequestPurpose {
    /**
     * Enum value fine-tune.
     */
    FINE_TUNE("fine-tune"),

    /**
     * Enum value assistants.
     */
    ASSISTANTS("assistants");

    /**
     * The actual serialized value for a CreateFileRequestPurpose instance.
     */
    private final String value;

    CreateFileRequestPurpose(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CreateFileRequestPurpose instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed CreateFileRequestPurpose object, or null if unable to parse.
     */
    public static CreateFileRequestPurpose fromString(String value) {
        if (value == null) {
            return null;
        }
        CreateFileRequestPurpose[] items = CreateFileRequestPurpose.values();
        for (CreateFileRequestPurpose item : items) {
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