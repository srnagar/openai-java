// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.util.ExpandableEnum;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Defines values for CreateImageEditRequestModel.
 */
public final class CreateImageEditRequestModel implements ExpandableEnum<String> {
    private static final Map<String, CreateImageEditRequestModel> VALUES = new ConcurrentHashMap<>();

    /**
     * Static value dall-e-2 for CreateImageEditRequestModel.
     */
    @Metadata(generated = true)
    public static final CreateImageEditRequestModel DALL_E_2 = fromString("dall-e-2");

    private final String name;

    private CreateImageEditRequestModel(String name) {
        this.name = name;
    }

    /**
     * Creates or finds a CreateImageEditRequestModel.
     * 
     * @param name a name to look for.
     * @return the corresponding CreateImageEditRequestModel.
     */
    @Metadata(generated = true)
    public static CreateImageEditRequestModel fromString(String name) {
        if (name == null) {
            return null;
        }
        CreateImageEditRequestModel value = VALUES.get(name);
        if (value != null) {
            return value;
        }
        return VALUES.computeIfAbsent(name, key -> new CreateImageEditRequestModel(key));
    }

    /**
     * Gets the value of the CreateImageEditRequestModel instance.
     * 
     * @return the value of the CreateImageEditRequestModel instance.
     */
    @Metadata(generated = true)
    @Override
    public String getValue() {
        return this.name;
    }

    @Metadata(generated = true)
    @Override
    public String toString() {
        return name;
    }
}
