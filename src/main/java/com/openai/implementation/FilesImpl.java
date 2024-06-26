// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.implementation;

import com.openai.models.DeleteFileResponse;
import com.openai.models.ListFilesResponse;
import com.openai.models.OpenAIFile;
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
 * An instance of this class provides access to all the operations defined in Files.
 */
public final class FilesImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final FilesService service;

    /**
     * The service client containing this operation class.
     */
    private final OpenAIClientImpl client;

    /**
     * Initializes an instance of FilesImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    FilesImpl(OpenAIClientImpl client) {
        this.service = RestProxy.create(FilesService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for OpenAIClientFiles to be used by the proxy service to perform REST
     * calls.
     */
    @ServiceInterface(name = "OpenAIClientFiles", host = "https://api.openai.com/v1")
    public interface FilesService {
        // @Multipart not supported by RestProxy
        @HttpRequestInformation(method = HttpMethod.POST, path = "/files", expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<OpenAIFile> createFileSync(@HeaderParam("content-type") String contentType,
            @HeaderParam("accept") String accept, @BodyParam("multipart/form-data") BinaryData file,
            RequestOptions requestOptions);

        @HttpRequestInformation(method = HttpMethod.GET, path = "/files", expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<ListFilesResponse> listFilesSync(@HeaderParam("accept") String accept, RequestOptions requestOptions);

        @HttpRequestInformation(method = HttpMethod.GET, path = "/files/{file_id}", expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<OpenAIFile> retrieveFileSync(@PathParam("file_id") String fileId, @HeaderParam("accept") String accept,
            RequestOptions requestOptions);

        @HttpRequestInformation(method = HttpMethod.DELETE, path = "/files/{file_id}", expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<DeleteFileResponse> deleteFileSync(@PathParam("file_id") String fileId,
            @HeaderParam("accept") String accept, RequestOptions requestOptions);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/files/{file_id}/content",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<String> downloadFileSync(@PathParam("file_id") String fileId, @HeaderParam("accept") String accept,
            RequestOptions requestOptions);
    }

    /**
     * Upload a file that can be used across various endpoints. The size of all the files uploaded by
     * one organization can be up to 100 GB.
     * 
     * The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See
     * the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files
     * supported. The Fine-tuning API only supports `.jsonl` files.
     * 
     * Please [contact us](https://help.openai.com/) if you need to increase these storage limits.
     * 
     * @param file The file parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the `File` object represents a document that has been uploaded to OpenAI.
     */
    public Response<OpenAIFile> createFileWithResponse(BinaryData file, RequestOptions requestOptions) {
        final String contentType = "multipart/form-data";
        final String accept = "application/json";
        return service.createFileSync(contentType, accept, file, requestOptions);
    }

    /**
     * Returns a list of files that belong to the user's organization.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>purpose</td><td>String</td><td>No</td><td>Only return files with the given purpose.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    public Response<ListFilesResponse> listFilesWithResponse(RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.listFilesSync(accept, requestOptions);
    }

    /**
     * Returns information about a specific file.
     * 
     * @param fileId The ID of the file to use for this request.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the `File` object represents a document that has been uploaded to OpenAI.
     */
    public Response<OpenAIFile> retrieveFileWithResponse(String fileId, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.retrieveFileSync(fileId, accept, requestOptions);
    }

    /**
     * Delete a file.
     * 
     * @param fileId The ID of the file to use for this request.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    public Response<DeleteFileResponse> deleteFileWithResponse(String fileId, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.deleteFileSync(fileId, accept, requestOptions);
    }

    /**
     * Returns the contents of the specified file.
     * 
     * @param fileId The ID of the file to use for this request.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return a sequence of textual characters.
     */
    public Response<String> downloadFileWithResponse(String fileId, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.downloadFileSync(fileId, accept, requestOptions);
    }
}
