// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai;

import com.openai.implementation.AssistantsImpl;
import com.openai.models.AssistantFileObject;
import com.openai.models.AssistantObject;
import com.openai.models.CreateAssistantFileRequest;
import com.openai.models.CreateAssistantRequest;
import com.openai.models.DeleteAssistantFileResponse;
import com.openai.models.DeleteAssistantResponse;
import com.openai.models.ListAssistantFilesResponse;
import com.openai.models.ListAssistantsResponse;
import com.openai.models.ListOrder;
import com.openai.models.ModifyAssistantRequest;
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
public final class AssistantsClient {
    @Metadata(generated = true)
    private final AssistantsImpl serviceClient;

    /**
     * Initializes an instance of AssistantsClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Metadata(generated = true)
    AssistantsClient(AssistantsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Create an assistant with a model and instructions.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     model: String (Required)
     *     name: String (Optional)
     *     description: String (Optional)
     *     instructions: String (Optional)
     *     tools (Optional): [
     *         BinaryData (Optional)
     *     ]
     *     file_ids (Optional): [
     *         String (Optional)
     *     ]
     *     metadata (Optional): {
     *         String: String (Required)
     *     }
     * }
     * }</pre>
     * 
     * @param assistant The assistant parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents an `assistant` that can call the model and use tools.
     */
    @Metadata(generated = true)
    public Response<AssistantObject> createAssistantWithResponse(BinaryData assistant, RequestOptions requestOptions) {
        return this.serviceClient.createAssistantWithResponse(assistant, requestOptions);
    }

    /**
     * Returns a list of assistants.
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
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<ListAssistantsResponse> listAssistantsWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.listAssistantsWithResponse(requestOptions);
    }

    /**
     * Retrieves an assistant.
     * 
     * @param assistantId The ID of the assistant to retrieve.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents an `assistant` that can call the model and use tools.
     */
    @Metadata(generated = true)
    public Response<AssistantObject> getAssistantWithResponse(String assistantId, RequestOptions requestOptions) {
        return this.serviceClient.getAssistantWithResponse(assistantId, requestOptions);
    }

    /**
     * Modifies an assistant.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     model: String (Optional)
     *     name: String (Optional)
     *     description: String (Optional)
     *     instructions: String (Optional)
     *     tools (Optional): [
     *         BinaryData (Optional)
     *     ]
     *     file_ids (Optional): [
     *         String (Optional)
     *     ]
     *     metadata (Optional): {
     *         String: String (Required)
     *     }
     * }
     * }</pre>
     * 
     * @param assistantId The ID of the assistant to modify.
     * @param assistant The assistant parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents an `assistant` that can call the model and use tools.
     */
    @Metadata(generated = true)
    public Response<AssistantObject> modifyAssistantWithResponse(String assistantId, BinaryData assistant,
        RequestOptions requestOptions) {
        return this.serviceClient.modifyAssistantWithResponse(assistantId, assistant, requestOptions);
    }

    /**
     * Delete an assistant.
     * 
     * @param assistantId The ID of the assistant to delete.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<DeleteAssistantResponse> deleteAssistantWithResponse(String assistantId,
        RequestOptions requestOptions) {
        return this.serviceClient.deleteAssistantWithResponse(assistantId, requestOptions);
    }

    /**
     * Create an assistant file by attaching a [File](/docs/api-reference/files) to a
     * [assistant](/docs/api-reference/assistants).
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     file_id: String (Required)
     * }
     * }</pre>
     * 
     * @param assistantId The ID of the assistant for which to create a file.
     * @param file The file parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return a list of [Files](/docs/api-reference/files) attached to an `assistant`.
     */
    @Metadata(generated = true)
    public Response<AssistantFileObject> createAssistantFileWithResponse(String assistantId, BinaryData file,
        RequestOptions requestOptions) {
        return this.serviceClient.createAssistantFileWithResponse(assistantId, file, requestOptions);
    }

    /**
     * Returns a list of assistant files.
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
     * @param assistantId The ID of the assistant the file belongs to.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<ListAssistantFilesResponse> listAssistantFilesWithResponse(String assistantId,
        RequestOptions requestOptions) {
        return this.serviceClient.listAssistantFilesWithResponse(assistantId, requestOptions);
    }

    /**
     * Retrieves an assistant file.
     * 
     * @param assistantId The ID of the assistant the file belongs to.
     * @param fileId The ID of the file we're getting.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return a list of [Files](/docs/api-reference/files) attached to an `assistant`.
     */
    @Metadata(generated = true)
    public Response<AssistantFileObject> getAssistantFileWithResponse(String assistantId, String fileId,
        RequestOptions requestOptions) {
        return this.serviceClient.getAssistantFileWithResponse(assistantId, fileId, requestOptions);
    }

    /**
     * Delete an assistant file.
     * 
     * @param assistantId The ID of the assistant the file belongs to.
     * @param fileId The ID of the file to delete.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return deletes the association between the assistant and the file, but does not delete the
     * [File](/docs/api-reference/files) object itself.
     */
    @Metadata(generated = true)
    public Response<DeleteAssistantFileResponse> deleteAssistantFileWithResponse(String assistantId, String fileId,
        RequestOptions requestOptions) {
        return this.serviceClient.deleteAssistantFileWithResponse(assistantId, fileId, requestOptions);
    }

    /**
     * Create an assistant with a model and instructions.
     * 
     * @param assistant The assistant parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an `assistant` that can call the model and use tools.
     */
    @Metadata(generated = true)
    public AssistantObject createAssistant(CreateAssistantRequest assistant) {
        // Generated convenience method for createAssistantWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return createAssistantWithResponse(BinaryData.fromObject(assistant), requestOptions).getValue();
    }

    /**
     * Returns a list of assistants.
     * 
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
    public ListAssistantsResponse listAssistants(Integer limit, ListOrder order, String after, String before) {
        // Generated convenience method for listAssistantsWithResponse
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
        return listAssistantsWithResponse(requestOptions).getValue();
    }

    /**
     * Returns a list of assistants.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(generated = true)
    public ListAssistantsResponse listAssistants() {
        // Generated convenience method for listAssistantsWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return listAssistantsWithResponse(requestOptions).getValue();
    }

    /**
     * Retrieves an assistant.
     * 
     * @param assistantId The ID of the assistant to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an `assistant` that can call the model and use tools.
     */
    @Metadata(generated = true)
    public AssistantObject getAssistant(String assistantId) {
        // Generated convenience method for getAssistantWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getAssistantWithResponse(assistantId, requestOptions).getValue();
    }

    /**
     * Modifies an assistant.
     * 
     * @param assistantId The ID of the assistant to modify.
     * @param assistant The assistant parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents an `assistant` that can call the model and use tools.
     */
    @Metadata(generated = true)
    public AssistantObject modifyAssistant(String assistantId, ModifyAssistantRequest assistant) {
        // Generated convenience method for modifyAssistantWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return modifyAssistantWithResponse(assistantId, BinaryData.fromObject(assistant), requestOptions).getValue();
    }

    /**
     * Delete an assistant.
     * 
     * @param assistantId The ID of the assistant to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(generated = true)
    public DeleteAssistantResponse deleteAssistant(String assistantId) {
        // Generated convenience method for deleteAssistantWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return deleteAssistantWithResponse(assistantId, requestOptions).getValue();
    }

    /**
     * Create an assistant file by attaching a [File](/docs/api-reference/files) to a
     * [assistant](/docs/api-reference/assistants).
     * 
     * @param assistantId The ID of the assistant for which to create a file.
     * @param file The file parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of [Files](/docs/api-reference/files) attached to an `assistant`.
     */
    @Metadata(generated = true)
    public AssistantFileObject createAssistantFile(String assistantId, CreateAssistantFileRequest file) {
        // Generated convenience method for createAssistantFileWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return createAssistantFileWithResponse(assistantId, BinaryData.fromObject(file), requestOptions).getValue();
    }

    /**
     * Returns a list of assistant files.
     * 
     * @param assistantId The ID of the assistant the file belongs to.
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
    public ListAssistantFilesResponse listAssistantFiles(String assistantId, Integer limit, ListOrder order,
        String after, String before) {
        // Generated convenience method for listAssistantFilesWithResponse
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
        return listAssistantFilesWithResponse(assistantId, requestOptions).getValue();
    }

    /**
     * Returns a list of assistant files.
     * 
     * @param assistantId The ID of the assistant the file belongs to.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(generated = true)
    public ListAssistantFilesResponse listAssistantFiles(String assistantId) {
        // Generated convenience method for listAssistantFilesWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return listAssistantFilesWithResponse(assistantId, requestOptions).getValue();
    }

    /**
     * Retrieves an assistant file.
     * 
     * @param assistantId The ID of the assistant the file belongs to.
     * @param fileId The ID of the file we're getting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of [Files](/docs/api-reference/files) attached to an `assistant`.
     */
    @Metadata(generated = true)
    public AssistantFileObject getAssistantFile(String assistantId, String fileId) {
        // Generated convenience method for getAssistantFileWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getAssistantFileWithResponse(assistantId, fileId, requestOptions).getValue();
    }

    /**
     * Delete an assistant file.
     * 
     * @param assistantId The ID of the assistant the file belongs to.
     * @param fileId The ID of the file to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deletes the association between the assistant and the file, but does not delete the
     * [File](/docs/api-reference/files) object itself.
     */
    @Metadata(generated = true)
    public DeleteAssistantFileResponse deleteAssistantFile(String assistantId, String fileId) {
        // Generated convenience method for deleteAssistantFileWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return deleteAssistantFileWithResponse(assistantId, fileId, requestOptions).getValue();
    }
}
