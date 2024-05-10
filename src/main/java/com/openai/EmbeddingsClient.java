// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai;

import com.openai.implementation.EmbeddingsImpl;
import com.openai.models.CreateEmbeddingRequest;
import com.openai.models.CreateEmbeddingResponse;
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
public final class EmbeddingsClient {
    @Metadata(generated = true)
    private final EmbeddingsImpl serviceClient;

    /**
     * Initializes an instance of EmbeddingsClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Metadata(generated = true)
    EmbeddingsClient(EmbeddingsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Creates an embedding vector representing the input text.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     input: BinaryData (Required)
     *     model: String(text-embedding-ada-002/text-embedding-3-small/text-embedding-3-large) (Required)
     *     encoding_format: String(float/base64) (Optional)
     *     dimensions: Long (Optional)
     *     user: String (Optional)
     * }
     * }</pre>
     * 
     * @param embedding The embedding parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<CreateEmbeddingResponse> createEmbeddingWithResponse(BinaryData embedding,
        RequestOptions requestOptions) {
        return this.serviceClient.createEmbeddingWithResponse(embedding, requestOptions);
    }

    /**
     * Creates an embedding vector representing the input text.
     * 
     * @param embedding The embedding parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(generated = true)
    public CreateEmbeddingResponse createEmbedding(CreateEmbeddingRequest embedding) {
        // Generated convenience method for createEmbeddingWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return createEmbeddingWithResponse(BinaryData.fromObject(embedding), requestOptions).getValue();
    }
}