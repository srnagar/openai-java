// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.implementation;

import com.openai.models.CreateChatCompletionResponse;
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
 * An instance of this class provides access to all the operations defined in Chats.
 */
public final class ChatsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ChatsService service;

    /**
     * The service client containing this operation class.
     */
    private final OpenAIClientImpl client;

    /**
     * Initializes an instance of ChatsImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ChatsImpl(OpenAIClientImpl client) {
        this.service = RestProxy.create(ChatsService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for OpenAIClientChats to be used by the proxy service to perform REST
     * calls.
     */
    @ServiceInterface(name = "OpenAIClientChats", host = "https://api.openai.com/v1")
    public interface ChatsService {
        @HttpRequestInformation(method = HttpMethod.POST, path = "/chat/completions", expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<CreateChatCompletionResponse> createChatCompletionSync(@HeaderParam("accept") String accept,
            @BodyParam("application/json") BinaryData createChatCompletionRequest, RequestOptions requestOptions);
    }

    /**
     * Creates a model response for the given chat conversation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     messages (Required): [
     *         BinaryData (Required)
     *     ]
     *     model: String(gpt-4-0125-preview/gpt-4-turbo-preview/gpt-4-1106-preview/gpt-4-vision-preview/gpt-4/gpt-4-0314/gpt-4-0613/gpt-4-32k/gpt-4-32k-0314/gpt-4-32k-0613/gpt-3.5-turbo/gpt-3.5-turbo-16k/gpt-3.5-turbo-0301/gpt-3.5-turbo-0613/gpt-3.5-turbo-1106/gpt-3.5-turbo-0125/gpt-3.5-turbo-16k-0613) (Required)
     *     frequency_penalty: Double (Optional)
     *     logit_bias (Optional): {
     *         String: long (Required)
     *     }
     *     logprobs: Boolean (Optional)
     *     top_logprobs: Long (Optional)
     *     max_tokens: Long (Optional)
     *     n: Long (Optional)
     *     presence_penalty: Double (Optional)
     *     response_format (Optional): {
     *         type: String(text/json_object) (Optional)
     *     }
     *     seed: Long (Optional)
     *     stop: BinaryData (Optional)
     *     stream: Boolean (Optional)
     *     temperature: Double (Optional)
     *     top_p: Double (Optional)
     *     tools (Optional): [
     *          (Optional){
     *             type: String (Required)
     *             function (Required): {
     *                 description: String (Optional)
     *                 name: String (Required)
     *                 parameters (Optional): {
     *                     String: Object (Required)
     *                 }
     *             }
     *         }
     *     ]
     *     tool_choice: BinaryData (Optional)
     *     user: String (Optional)
     *     function_call: BinaryData (Optional)
     *     functions (Optional): [
     *          (Optional){
     *             description: String (Optional)
     *             name: String (Required)
     *             parameters (Optional): {
     *                 String: Object (Required)
     *             }
     *         }
     *     ]
     * }
     * }</pre>
     * 
     * @param createChatCompletionRequest The createChatCompletionRequest parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents a chat completion response returned by model, based on the provided input.
     */
    public Response<CreateChatCompletionResponse>
        createChatCompletionWithResponse(BinaryData createChatCompletionRequest, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.createChatCompletionSync(accept, createChatCompletionRequest, requestOptions);
    }
}
