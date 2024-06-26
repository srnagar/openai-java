// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.util.ExpandableEnum;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Defines values for CreateEmbeddingRequestModel.
 */
public final class CreateEmbeddingRequestModel implements ExpandableEnum<String> {
    private static final Map<String, CreateEmbeddingRequestModel> VALUES = new ConcurrentHashMap<>();

    /**
     * Static value text-embedding-ada-002 for CreateEmbeddingRequestModel.
     */
    @Metadata(generated = true)
    public static final CreateEmbeddingRequestModel TEXT_EMBEDDING_ADA_002 = fromString("text-embedding-ada-002");

    /**
     * Static value text-embedding-3-small for CreateEmbeddingRequestModel.
     */
    @Metadata(generated = true)
    public static final CreateEmbeddingRequestModel TEXT_EMBEDDING_3_SMALL = fromString("text-embedding-3-small");

    /**
     * Static value text-embedding-3-large for CreateEmbeddingRequestModel.
     */
    @Metadata(generated = true)
    public static final CreateEmbeddingRequestModel TEXT_EMBEDDING_3_LARGE = fromString("text-embedding-3-large");

    private final String name;

    private CreateEmbeddingRequestModel(String name) {
        this.name = name;
    }

    /**
     * Creates or finds a CreateEmbeddingRequestModel.
     * 
     * @param name a name to look for.
     * @return the corresponding CreateEmbeddingRequestModel.
     */
    @Metadata(generated = true)
    public static CreateEmbeddingRequestModel fromString(String name) {
        if (name == null) {
            return null;
        }
        CreateEmbeddingRequestModel value = VALUES.get(name);
        if (value != null) {
            return value;
        }
        return VALUES.computeIfAbsent(name, key -> new CreateEmbeddingRequestModel(key));
    }

    /**
     * Gets the value of the CreateEmbeddingRequestModel instance.
     * 
     * @return the value of the CreateEmbeddingRequestModel instance.
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
