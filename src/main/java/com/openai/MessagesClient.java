// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai;

import com.openai.implementation.MessagesImpl;
import com.openai.models.CreateMessageRequest;
import com.openai.models.ListMessageFilesResponse;
import com.openai.models.ListMessagesResponse;
import com.openai.models.ListOrder;
import com.openai.models.MessageFileObject;
import com.openai.models.MessageObject;
import com.openai.models.ModifyMessageRequest;
import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.ServiceClient;
import io.clientcore.core.http.exception.HttpResponseException;
import io.clientcore.core.http.models.RequestOptions;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.util.binarydata.BinaryData;

/**
 * Initializes a new instance of the synchronous OpenAIClient type.
 */
@ServiceClient(builder = OpenAIClientBuilder.class)
public final class MessagesClient {
    @Metadata(generated = true)
    private final MessagesImpl serviceClient;

    /**
     * Initializes an instance of MessagesClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Metadata(generated = true)
    MessagesClient(MessagesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Create a message.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     role: String (Required)
     *     content: String (Required)
     *     file_ids (Optional): [
     *         String (Optional)
     *     ]
     *     metadata (Optional): {
     *         String: String (Required)
     *     }
     * }
     * }</pre>
     * 
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to create a message for.
     * @param message The message parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<MessageObject> createMessageWithResponse(String threadId, BinaryData message,
        RequestOptions requestOptions) {
        return this.serviceClient.createMessageWithResponse(threadId, message, requestOptions);
    }

    /**
     * Returns a list of messages for a given thread.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>limit</td><td>Integer</td><td>No</td><td>A limit on the number of objects to be returned. Limit can range
     * between 1 and 100, and the
     * default is 20.</td></tr>
     * <tr><td>order</td><td>String</td><td>No</td><td>Sort order by the `created_at` timestamp of the objects. `asc`
     * for ascending order and`desc`
     * for descending order. Allowed values: "asc", "desc".</td></tr>
     * <tr><td>after</td><td>String</td><td>No</td><td>A cursor for use in pagination. `after` is an object ID that
     * defines your place in the list.
     * For instance, if you make a list request and receive 100 objects, ending with obj_foo, your
     * subsequent call can include after=obj_foo in order to fetch the next page of the list.</td></tr>
     * <tr><td>before</td><td>String</td><td>No</td><td>A cursor for use in pagination. `before` is an object ID that
     * defines your place in the list.
     * For instance, if you make a list request and receive 100 objects, ending with obj_foo, your
     * subsequent call can include before=obj_foo in order to fetch the previous page of the list.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * 
     * @param threadId The ID of the [thread](/docs/api-reference/threads) the messages belong to.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<ListMessagesResponse> listMessagesWithResponse(String threadId, RequestOptions requestOptions) {
        return this.serviceClient.listMessagesWithResponse(threadId, requestOptions);
    }

    /**
     * Retrieve a message.
     * 
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
     * @param messageId The ID of the message to retrieve.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<MessageObject> getMessageWithResponse(String threadId, String messageId,
        RequestOptions requestOptions) {
        return this.serviceClient.getMessageWithResponse(threadId, messageId, requestOptions);
    }

    /**
     * Modifies a message.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     metadata (Optional): {
     *         String: String (Required)
     *     }
     * }
     * }</pre>
     * 
     * @param threadId The ID of the thread to which this message belongs.
     * @param messageId The ID of the message to modify.
     * @param message The message parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<MessageObject> modifyMessageWithResponse(String threadId, String messageId, BinaryData message,
        RequestOptions requestOptions) {
        return this.serviceClient.modifyMessageWithResponse(threadId, messageId, message, requestOptions);
    }

    /**
     * Returns a list of message files.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>limit</td><td>Integer</td><td>No</td><td>A limit on the number of objects to be returned. Limit can range
     * between 1 and 100, and the
     * default is 20.</td></tr>
     * <tr><td>order</td><td>String</td><td>No</td><td>Sort order by the `created_at` timestamp of the objects. `asc`
     * for ascending order and`desc`
     * for descending order. Allowed values: "asc", "desc".</td></tr>
     * <tr><td>after</td><td>String</td><td>No</td><td>A cursor for use in pagination. `after` is an object ID that
     * defines your place in the list.
     * For instance, if you make a list request and receive 100 objects, ending with obj_foo, your
     * subsequent call can include after=obj_foo in order to fetch the next page of the list.</td></tr>
     * <tr><td>before</td><td>String</td><td>No</td><td>A cursor for use in pagination. `before` is an object ID that
     * defines your place in the list.
     * For instance, if you make a list request and receive 100 objects, ending with obj_foo, your
     * subsequent call can include before=obj_foo in order to fetch the previous page of the list.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * 
     * @param threadId The ID of the thread that the message and files belong to.
     * @param messageId The ID of the message that the files belongs to.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<ListMessageFilesResponse> listMessageFilesWithResponse(String threadId, String messageId,
        RequestOptions requestOptions) {
        return this.serviceClient.listMessageFilesWithResponse(threadId, messageId, requestOptions);
    }

    /**
     * Retrieves a message file.
     * 
     * @param threadId The ID of the thread to which the message and File belong.
     * @param messageId The ID of the message the file belongs to.
     * @param fileId The ID of the file being retrieved.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return a list of files attached to a `message`.
     */
    @Metadata(generated = true)
    public Response<MessageFileObject> getMessageFileWithResponse(String threadId, String messageId, String fileId,
        RequestOptions requestOptions) {
        return this.serviceClient.getMessageFileWithResponse(threadId, messageId, fileId, requestOptions);
    }

    /**
     * Create a message.
     * 
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to create a message for.
     * @param message The message parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(generated = true)
    public MessageObject createMessage(String threadId, CreateMessageRequest message) {
        // Generated convenience method for createMessageWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return createMessageWithResponse(threadId, BinaryData.fromObject(message), requestOptions).getValue();
    }

    /**
     * Returns a list of messages for a given thread.
     * 
     * @param threadId The ID of the [thread](/docs/api-reference/threads) the messages belong to.
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
     * default is 20.
     * @param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and`desc`
     * for descending order.
     * @param after A cursor for use in pagination. `after` is an object ID that defines your place in the list.
     * For instance, if you make a list request and receive 100 objects, ending with obj_foo, your
     * subsequent call can include after=obj_foo in order to fetch the next page of the list.
     * @param before A cursor for use in pagination. `before` is an object ID that defines your place in the list.
     * For instance, if you make a list request and receive 100 objects, ending with obj_foo, your
     * subsequent call can include before=obj_foo in order to fetch the previous page of the list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(generated = true)
    public ListMessagesResponse listMessages(String threadId, Integer limit, ListOrder order, String after,
        String before) {
        // Generated convenience method for listMessagesWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (limit != null) {
            requestOptions.addQueryParam("limit", String.valueOf(limit));
        }
        if (order != null) {
            requestOptions.addQueryParam("order", order.toString());
        }
        if (after != null) {
            requestOptions.addQueryParam("after", after);
        }
        if (before != null) {
            requestOptions.addQueryParam("before", before);
        }
        return listMessagesWithResponse(threadId, requestOptions).getValue();
    }

    /**
     * Returns a list of messages for a given thread.
     * 
     * @param threadId The ID of the [thread](/docs/api-reference/threads) the messages belong to.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(generated = true)
    public ListMessagesResponse listMessages(String threadId) {
        // Generated convenience method for listMessagesWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return listMessagesWithResponse(threadId, requestOptions).getValue();
    }

    /**
     * Retrieve a message.
     * 
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
     * @param messageId The ID of the message to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(generated = true)
    public MessageObject getMessage(String threadId, String messageId) {
        // Generated convenience method for getMessageWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getMessageWithResponse(threadId, messageId, requestOptions).getValue();
    }

    /**
     * Modifies a message.
     * 
     * @param threadId The ID of the thread to which this message belongs.
     * @param messageId The ID of the message to modify.
     * @param message The message parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(generated = true)
    public MessageObject modifyMessage(String threadId, String messageId, ModifyMessageRequest message) {
        // Generated convenience method for modifyMessageWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return modifyMessageWithResponse(threadId, messageId, BinaryData.fromObject(message), requestOptions)
            .getValue();
    }

    /**
     * Returns a list of message files.
     * 
     * @param threadId The ID of the thread that the message and files belong to.
     * @param messageId The ID of the message that the files belongs to.
     * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
     * default is 20.
     * @param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and`desc`
     * for descending order.
     * @param after A cursor for use in pagination. `after` is an object ID that defines your place in the list.
     * For instance, if you make a list request and receive 100 objects, ending with obj_foo, your
     * subsequent call can include after=obj_foo in order to fetch the next page of the list.
     * @param before A cursor for use in pagination. `before` is an object ID that defines your place in the list.
     * For instance, if you make a list request and receive 100 objects, ending with obj_foo, your
     * subsequent call can include before=obj_foo in order to fetch the previous page of the list.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(generated = true)
    public ListMessageFilesResponse listMessageFiles(String threadId, String messageId, Integer limit, ListOrder order,
        String after, String before) {
        // Generated convenience method for listMessageFilesWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (limit != null) {
            requestOptions.addQueryParam("limit", String.valueOf(limit));
        }
        if (order != null) {
            requestOptions.addQueryParam("order", order.toString());
        }
        if (after != null) {
            requestOptions.addQueryParam("after", after);
        }
        if (before != null) {
            requestOptions.addQueryParam("before", before);
        }
        return listMessageFilesWithResponse(threadId, messageId, requestOptions).getValue();
    }

    /**
     * Returns a list of message files.
     * 
     * @param threadId The ID of the thread that the message and files belong to.
     * @param messageId The ID of the message that the files belongs to.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(generated = true)
    public ListMessageFilesResponse listMessageFiles(String threadId, String messageId) {
        // Generated convenience method for listMessageFilesWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return listMessageFilesWithResponse(threadId, messageId, requestOptions).getValue();
    }

    /**
     * Retrieves a message file.
     * 
     * @param threadId The ID of the thread to which the message and File belong.
     * @param messageId The ID of the message the file belongs to.
     * @param fileId The ID of the file being retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of files attached to a `message`.
     */
    @Metadata(generated = true)
    public MessageFileObject getMessageFile(String threadId, String messageId, String fileId) {
        // Generated convenience method for getMessageFileWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getMessageFileWithResponse(threadId, messageId, fileId, requestOptions).getValue();
    }
}
