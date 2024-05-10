package com.openai.models;

/**
 * Listener for handling server sent events containing completion response.
 */
@FunctionalInterface
public interface CreateCompletionResponseListener {

    /**
     * Called when Complete response event is received from the server
     * @param responseEvent
     */
    void onEvent(CreateCompletionResponse responseEvent);

    /**
     * Called when there is an error from the service
     * @param throwable
     */
    default void onError(Throwable throwable) {
        // Do nothing
    }

    /**
     * Called when the response is complete.
     */
    default void onClose() {
        // Do nothing
    }
}
