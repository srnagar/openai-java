// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.implementation;

import com.openai.models.CreateCompletionResponse;
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
 * An instance of this class provides access to all the operations defined in Completions.
 */
public final class CompletionsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final CompletionsService service;

    /**
     * The service client containing this operation class.
     */
    private final OpenAIClientImpl client;

    /**
     * Initializes an instance of CompletionsImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    CompletionsImpl(OpenAIClientImpl client) {
        this.service = RestProxy.create(CompletionsService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for OpenAIClientCompletions to be used by the proxy service to perform
     * REST calls.
     */
    @ServiceInterface(name = "OpenAIClientCompleti", host = "https://api.openai.com/v1")
    public interface CompletionsService {
        @HttpRequestInformation(method = HttpMethod.POST, path = "/completions", expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<CreateCompletionResponse> createCompletionSync(@HeaderParam("accept") String accept,
            @BodyParam("application/json") BinaryData createCompletionRequest, RequestOptions requestOptions);
    }

    /**
     * Creates a completion for the provided prompt and parameters.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     model: String(gpt-3.5-turbo-instruct/davinci-002/babbage-002) (Required)
     *     prompt: BinaryData (Required)
     *     best_of: Long (Optional)
     *     echo: Boolean (Optional)
     *     frequency_penalty: Double (Optional)
     *     logit_bias (Optional): {
     *         String: long (Required)
     *     }
     *     logprobs: Long (Optional)
     *     max_tokens: Long (Optional)
     *     n: Long (Optional)
     *     presence_penalty: Double (Optional)
     *     seed: Long (Optional)
     *     stop: BinaryData (Optional)
     *     stream: Boolean (Optional)
     *     suffix: String (Optional)
     *     temperature: Double (Optional)
     *     top_p: Double (Optional)
     *     user: String (Optional)
     * }
     * }</pre>
     * 
     * @param createCompletionRequest The createCompletionRequest parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents a completion response from the API.
     */
    public Response<CreateCompletionResponse> createCompletionWithResponse(BinaryData createCompletionRequest,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.createCompletionSync(accept, createCompletionRequest, requestOptions);
    }
}
