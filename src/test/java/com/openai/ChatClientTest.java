package com.openai;

import com.openai.models.CreateChatCompletionRequest;
import com.openai.models.CreateChatCompletionRequestModel;
import com.openai.models.CreateChatCompletionResponse;
import com.openai.models.CreateCompletionRequest;
import com.openai.models.CreateCompletionRequestModel;
import com.openai.models.CreateCompletionResponse;
import com.openai.models.CreateCompletionResponseListener;
import io.clientcore.core.credential.KeyCredential;
import io.clientcore.core.http.models.HttpLogOptions;
import io.clientcore.core.json.JsonSerializable;
import io.clientcore.core.json.JsonWriter;
import io.clientcore.core.util.binarydata.BinaryData;
import io.clientcore.core.util.configuration.Configuration;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.function.Consumer;

import static com.openai.models.CreateCompletionRequestModel.GPT_3_5_TURBO_INSTRUCT;

public class ChatClientTest {
    @Test
    public void testChatCompletions() {
        ChatClient chatClient = new OpenAIClientBuilder()
                .credential(new KeyCredential(Configuration.getGlobalConfiguration().get("OPENAI_API_KEY")))
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogOptions.HttpLogDetailLevel.BODY_AND_HEADERS))
                .buildChatClient();
        CreateChatCompletionRequest createChatCompletionRequest = new CreateChatCompletionRequest(Arrays.asList(BinaryData.fromObject(new ChatMessage("user", "What is the recipe for baking a cake?"))), CreateChatCompletionRequestModel.GPT_3_5_TURBO);
        CreateChatCompletionResponse chatCompletion = chatClient.createChatCompletion(createChatCompletionRequest);
        System.out.println(chatCompletion.getChoices().get(0).getMessage().getContent());
    }

    @Test
    public void testCompletions() {
        CompletionsClient completionsClient = new OpenAIClientBuilder()
                .credential(new KeyCredential(Configuration.getGlobalConfiguration().get("OPENAI_API_KEY")))
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogOptions.HttpLogDetailLevel.BODY_AND_HEADERS))
                .buildCompletionsClient();
        CreateCompletionRequest request = new CreateCompletionRequest(GPT_3_5_TURBO_INSTRUCT, "What is the recipe for baking a cake?");

        CreateCompletionResponse completion = completionsClient.createCompletion(request);
    }

    @Test
    public void testCompletionsStream() {

        // Create the client
        CompletionsClient completionsClient = new OpenAIClientBuilder()
                .credential(new KeyCredential(Configuration.getGlobalConfiguration().get("OPENAI_API_KEY")))
                .buildCompletionsClient();

        // Create the request
        CreateCompletionRequest request = new CreateCompletionRequest(GPT_3_5_TURBO_INSTRUCT, "Who invented the telephone?")
                .setStream(true)
                .setMaxTokens(3000L);
        // Create the consumer to handle response events
        Consumer<CreateCompletionResponse> consumer = event ->
                System.out.println("Event received: eventId" + event.getId() + "; content: " + event.getChoices().get(0).getText());

        // Call the service
        completionsClient.createCompletionStream(request, consumer);
    }


    @Test
    public void testCompletionsStreamWithListener() {
        // Create the client
        CompletionsClient completionsClient = new OpenAIClientBuilder()
                .credential(new KeyCredential(Configuration.getGlobalConfiguration().get("OPENAI_API_KEY")))
                .buildCompletionsClient();

        // Create the request
        CreateCompletionRequest request = new CreateCompletionRequest(GPT_3_5_TURBO_INSTRUCT, "Who invented the telephone?")
                .setStream(true)
                .setMaxTokens(3000L);
        // Create the listener to handle response events
        CreateCompletionResponseListener responseListener = new CreateCompletionResponseListener() {

            @Override
            public void onEvent(CreateCompletionResponse responseEvent) {
                System.out.println("Event received: eventId"
                        + responseEvent.getId() + "; content: " + responseEvent.getChoices().get(0).getText());
            }

            @Override
            public void onClose() {
                System.out.println("Close event");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("Error event " + throwable.getMessage());
            }
        };

        // Call the service
        completionsClient.createCompletionStream(request, responseListener);
    }

    private static class ChatMessage implements JsonSerializable {

        private String role;
        private String content;

        public ChatMessage(String role, String content) {
            this.content = content;
            this.role = role;
        }

        @Override
        public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
            jsonWriter.writeStartObject();
            jsonWriter.writeStringField("role", this.role);
            jsonWriter.writeStringField("content", this.content);
            jsonWriter.writeEndObject();
            return jsonWriter;
        }
    }
}
