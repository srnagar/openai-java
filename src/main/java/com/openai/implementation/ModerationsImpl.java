// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.implementation;

import com.openai.models.CreateModerationResponse;
import io.clientcore.core.annotation.ServiceInterface;
import io.clientcore.core.http.RestProxy;
import io.clientcore.core.http.annotation.BodyParam;
import io.clientcore.core.http.annotation.HeaderParam;
import io.clientcore.core.http.annotation.HttpRequestInformation;
import io.clientcore.core.http.annotation.UnexpectedResponseExceptionDetail;
import io.clientcore.core.http.exception.HttpResponseException;
import io.clientcore.core.http.models.HttpMethod;
import io.clientcore.core.http.models.RequestOptions;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.util.binarydata.BinaryData;

/**
 * An instance of this class provides access to all the operations defined in Moderations.
 */
public final class ModerationsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ModerationsService service;

    /**
     * The service client containing this operation class.
     */
    private final OpenAIClientImpl client;

    /**
     * Initializes an instance of ModerationsImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ModerationsImpl(OpenAIClientImpl client) {
        this.service = RestProxy.create(ModerationsService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for OpenAIClientModerations to be used by the proxy service to perform
     * REST calls.
     */
    @ServiceInterface(name = "OpenAIClientModerati", host = "https://api.openai.com/v1")
    public interface ModerationsService {
        @HttpRequestInformation(method = HttpMethod.POST, path = "/moderations", expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<CreateModerationResponse> createModerationSync(@HeaderParam("accept") String accept,
            @BodyParam("application/json") BinaryData content, RequestOptions requestOptions);
    }

    /**
     * Classifies if text is potentially harmful.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     input: BinaryData (Required)
     *     model: String(text-moderation-latest/text-moderation-stable) (Optional)
     * }
     * }</pre>
     * 
     * @param content The content parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents if a given text input is potentially harmful.
     */
    public Response<CreateModerationResponse> createModerationWithResponse(BinaryData content,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.createModerationSync(accept, content, requestOptions);
    }
}
