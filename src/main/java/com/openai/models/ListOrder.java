// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.util.ExpandableEnum;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Defines values for ListOrder.
 */
public final class ListOrder implements ExpandableEnum<String> {
    private static final Map<String, ListOrder> VALUES = new ConcurrentHashMap<>();

    /**
     * Static value asc for ListOrder.
     */
    @Metadata(generated = true)
    public static final ListOrder ASC = fromString("asc");

    /**
     * Static value desc for ListOrder.
     */
    @Metadata(generated = true)
    public static final ListOrder DESC = fromString("desc");

    private final String name;

    private ListOrder(String name) {
        this.name = name;
    }

    /**
     * Creates or finds a ListOrder.
     * 
     * @param name a name to look for.
     * @return the corresponding ListOrder.
     */
    @Metadata(generated = true)
    public static ListOrder fromString(String name) {
        if (name == null) {
            return null;
        }
        ListOrder value = VALUES.get(name);
        if (value != null) {
            return value;
        }
        return VALUES.computeIfAbsent(name, key -> new ListOrder(key));
    }

    /**
     * Gets the value of the ListOrder instance.
     * 
     * @return the value of the ListOrder instance.
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
