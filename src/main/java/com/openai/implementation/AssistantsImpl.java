// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.implementation;

import com.openai.models.AssistantFileObject;
import com.openai.models.AssistantObject;
import com.openai.models.DeleteAssistantFileResponse;
import com.openai.models.DeleteAssistantResponse;
import com.openai.models.ListAssistantFilesResponse;
import com.openai.models.ListAssistantsResponse;
import io.clientcore.core.annotation.ServiceInterface;
import io.clientcore.core.http.RestProxy;
import io.clientcore.core.http.annotation.BodyParam;
import io.clientcore.core.http.annotation.HeaderParam;
import io.clientcore.core.http.annotation.HttpRequestInformation;
import io.clientcore.core.http.annotation.PathParam;
import io.clientcore.core.http.annotation.UnexpectedResponseExceptionDetail;
import io.clientcore.core.http.exception.HttpResponseException;
import io.clientcore.core.http.models.HttpMethod;
import io.clientcore.core.http.models.RequestOptions;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.util.binarydata.BinaryData;

/**
 * An instance of this class provides access to all the operations defined in Assistants.
 */
public final class AssistantsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final AssistantsService service;

    /**
     * The service client containing this operation class.
     */
    private final OpenAIClientImpl client;

    /**
     * Initializes an instance of AssistantsImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    AssistantsImpl(OpenAIClientImpl client) {
        this.service = RestProxy.create(AssistantsService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for OpenAIClientAssistants to be used by the proxy service to perform
     * REST calls.
     */
    @ServiceInterface(name = "OpenAIClientAssistan", host = "https://api.openai.com/v1")
    public interface AssistantsService {
        @HttpRequestInformation(method = HttpMethod.POST, path = "/assistants", expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<AssistantObject> createAssistantSync(@HeaderParam("accept") String accept,
            @BodyParam("application/json") BinaryData assistant, RequestOptions requestOptions);

        @HttpRequestInformation(method = HttpMethod.GET, path = "/assistants", expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<ListAssistantsResponse> listAssistantsSync(@HeaderParam("accept") String accept,
            RequestOptions requestOptions);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/assistants/{assistant_id}",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<AssistantObject> getAssistantSync(@PathParam("assistant_id") String assistantId,
            @HeaderParam("accept") String accept, RequestOptions requestOptions);

        @HttpRequestInformation(
            method = HttpMethod.POST,
            path = "/assistants/{assistant_id}",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<AssistantObject> modifyAssistantSync(@PathParam("assistant_id") String assistantId,
            @HeaderParam("accept") String accept, @BodyParam("application/json") BinaryData assistant,
            RequestOptions requestOptions);

        @HttpRequestInformation(
            method = HttpMethod.DELETE,
            path = "/assistants/{assistant_id}",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<DeleteAssistantResponse> deleteAssistantSync(@PathParam("assistant_id") String assistantId,
            @HeaderParam("accept") String accept, RequestOptions requestOptions);

        @HttpRequestInformation(
            method = HttpMethod.POST,
            path = "/assistants/{assistant_id}/files",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<AssistantFileObject> createAssistantFileSync(@PathParam("assistant_id") String assistantId,
            @HeaderParam("accept") String accept, @BodyParam("application/json") BinaryData file,
            RequestOptions requestOptions);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/assistants/{assistant_id}/files",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<ListAssistantFilesResponse> listAssistantFilesSync(@PathParam("assistant_id") String assistantId,
            @HeaderParam("accept") String accept, RequestOptions requestOptions);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/assistants/{assistant_id}/files/{file_id}",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<AssistantFileObject> getAssistantFileSync(@PathParam("assistant_id") String assistantId,
            @PathParam("file_id") String fileId, @HeaderParam("accept") String accept, RequestOptions requestOptions);

        @HttpRequestInformation(
            method = HttpMethod.DELETE,
            path = "/assistants/{assistant_id}/files/{file_id}",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<DeleteAssistantFileResponse> deleteAssistantFileSync(@PathParam("assistant_id") String assistantId,
            @PathParam("file_id") String fileId, @HeaderParam("accept") String accept, RequestOptions requestOptions);
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
    public Response<AssistantObject> createAssistantWithResponse(BinaryData assistant, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.createAssistantSync(accept, assistant, requestOptions);
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
    public Response<ListAssistantsResponse> listAssistantsWithResponse(RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.listAssistantsSync(accept, requestOptions);
    }

    /**
     * Retrieves an assistant.
     * 
     * @param assistantId The ID of the assistant to retrieve.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents an `assistant` that can call the model and use tools.
     */
    public Response<AssistantObject> getAssistantWithResponse(String assistantId, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.getAssistantSync(assistantId, accept, requestOptions);
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
    public Response<AssistantObject> modifyAssistantWithResponse(String assistantId, BinaryData assistant,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.modifyAssistantSync(assistantId, accept, assistant, requestOptions);
    }

    /**
     * Delete an assistant.
     * 
     * @param assistantId The ID of the assistant to delete.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    public Response<DeleteAssistantResponse> deleteAssistantWithResponse(String assistantId,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.deleteAssistantSync(assistantId, accept, requestOptions);
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
    public Response<AssistantFileObject> createAssistantFileWithResponse(String assistantId, BinaryData file,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.createAssistantFileSync(assistantId, accept, file, requestOptions);
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
    public Response<ListAssistantFilesResponse> listAssistantFilesWithResponse(String assistantId,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.listAssistantFilesSync(assistantId, accept, requestOptions);
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
    public Response<AssistantFileObject> getAssistantFileWithResponse(String assistantId, String fileId,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.getAssistantFileSync(assistantId, fileId, accept, requestOptions);
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
    public Response<DeleteAssistantFileResponse> deleteAssistantFileWithResponse(String assistantId, String fileId,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.deleteAssistantFileSync(assistantId, fileId, accept, requestOptions);
    }
}