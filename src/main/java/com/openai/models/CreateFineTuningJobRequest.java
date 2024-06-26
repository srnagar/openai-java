// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.json.JsonReader;
import io.clientcore.core.json.JsonSerializable;
import io.clientcore.core.json.JsonToken;
import io.clientcore.core.json.JsonWriter;
import java.io.IOException;

/**
 * The CreateFineTuningJobRequest model.
 */
@Metadata(conditions = { TypeConditions.FLUENT })
public final class CreateFineTuningJobRequest implements JsonSerializable<CreateFineTuningJobRequest> {
    /*
     * The name of the model to fine-tune. You can select one of the
     * [supported models](/docs/guides/fine-tuning/what-models-can-be-fine-tuned).
     */
    @Metadata(generated = true)
    private final CreateFineTuningJobRequestModel model;

    /*
     * The ID of an uploaded file that contains training data.
     * 
     * See [upload file](/docs/api-reference/files/upload) for how to upload a file.
     * 
     * Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with
     * the purpose `fine-tune`.
     * 
     * See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
     */
    @Metadata(generated = true)
    private final String trainingFile;

    /*
     * The hyperparameters used for the fine-tuning job.
     */
    @Metadata(generated = true)
    private CreateFineTuningJobRequestHyperparameters hyperparameters;

    /*
     * A string of up to 18 characters that will be added to your fine-tuned model name.
     * 
     * For example, a `suffix` of "custom-model-name" would produce a model name like
     * `ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel`.
     */
    @Metadata(generated = true)
    private String suffix;

    /*
     * The ID of an uploaded file that contains validation data.
     * 
     * If you provide this file, the data is used to generate validation metrics periodically during
     * fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should
     * not be present in both train and validation files.
     * 
     * Your dataset must be formatted as a JSONL file. You must upload your file with the purpose
     * `fine-tune`.
     * 
     * See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
     */
    @Metadata(generated = true)
    private String validationFile;

    /**
     * Creates an instance of CreateFineTuningJobRequest class.
     * 
     * @param model the model value to set.
     * @param trainingFile the trainingFile value to set.
     */
    @Metadata(generated = true)
    public CreateFineTuningJobRequest(CreateFineTuningJobRequestModel model, String trainingFile) {
        this.model = model;
        this.trainingFile = trainingFile;
    }

    /**
     * Get the model property: The name of the model to fine-tune. You can select one of the
     * [supported models](/docs/guides/fine-tuning/what-models-can-be-fine-tuned).
     * 
     * @return the model value.
     */
    @Metadata(generated = true)
    public CreateFineTuningJobRequestModel getModel() {
        return this.model;
    }

    /**
     * Get the trainingFile property: The ID of an uploaded file that contains training data.
     * 
     * See [upload file](/docs/api-reference/files/upload) for how to upload a file.
     * 
     * Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with
     * the purpose `fine-tune`.
     * 
     * See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
     * 
     * @return the trainingFile value.
     */
    @Metadata(generated = true)
    public String getTrainingFile() {
        return this.trainingFile;
    }

    /**
     * Get the hyperparameters property: The hyperparameters used for the fine-tuning job.
     * 
     * @return the hyperparameters value.
     */
    @Metadata(generated = true)
    public CreateFineTuningJobRequestHyperparameters getHyperparameters() {
        return this.hyperparameters;
    }

    /**
     * Set the hyperparameters property: The hyperparameters used for the fine-tuning job.
     * 
     * @param hyperparameters the hyperparameters value to set.
     * @return the CreateFineTuningJobRequest object itself.
     */
    @Metadata(generated = true)
    public CreateFineTuningJobRequest setHyperparameters(CreateFineTuningJobRequestHyperparameters hyperparameters) {
        this.hyperparameters = hyperparameters;
        return this;
    }

    /**
     * Get the suffix property: A string of up to 18 characters that will be added to your fine-tuned model name.
     * 
     * For example, a `suffix` of "custom-model-name" would produce a model name like
     * `ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel`.
     * 
     * @return the suffix value.
     */
    @Metadata(generated = true)
    public String getSuffix() {
        return this.suffix;
    }

    /**
     * Set the suffix property: A string of up to 18 characters that will be added to your fine-tuned model name.
     * 
     * For example, a `suffix` of "custom-model-name" would produce a model name like
     * `ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel`.
     * 
     * @param suffix the suffix value to set.
     * @return the CreateFineTuningJobRequest object itself.
     */
    @Metadata(generated = true)
    public CreateFineTuningJobRequest setSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

    /**
     * Get the validationFile property: The ID of an uploaded file that contains validation data.
     * 
     * If you provide this file, the data is used to generate validation metrics periodically during
     * fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should
     * not be present in both train and validation files.
     * 
     * Your dataset must be formatted as a JSONL file. You must upload your file with the purpose
     * `fine-tune`.
     * 
     * See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
     * 
     * @return the validationFile value.
     */
    @Metadata(generated = true)
    public String getValidationFile() {
        return this.validationFile;
    }

    /**
     * Set the validationFile property: The ID of an uploaded file that contains validation data.
     * 
     * If you provide this file, the data is used to generate validation metrics periodically during
     * fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should
     * not be present in both train and validation files.
     * 
     * Your dataset must be formatted as a JSONL file. You must upload your file with the purpose
     * `fine-tune`.
     * 
     * See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
     * 
     * @param validationFile the validationFile value to set.
     * @return the CreateFineTuningJobRequest object itself.
     */
    @Metadata(generated = true)
    public CreateFineTuningJobRequest setValidationFile(String validationFile) {
        this.validationFile = validationFile;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("model", this.model == null ? null : this.model.toString());
        jsonWriter.writeStringField("training_file", this.trainingFile);
        jsonWriter.writeJsonField("hyperparameters", this.hyperparameters);
        jsonWriter.writeStringField("suffix", this.suffix);
        jsonWriter.writeStringField("validation_file", this.validationFile);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CreateFineTuningJobRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateFineTuningJobRequest if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CreateFineTuningJobRequest.
     */
    @Metadata(generated = true)
    public static CreateFineTuningJobRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CreateFineTuningJobRequestModel model = null;
            String trainingFile = null;
            CreateFineTuningJobRequestHyperparameters hyperparameters = null;
            String suffix = null;
            String validationFile = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("model".equals(fieldName)) {
                    model = CreateFineTuningJobRequestModel.fromString(reader.getString());
                } else if ("training_file".equals(fieldName)) {
                    trainingFile = reader.getString();
                } else if ("hyperparameters".equals(fieldName)) {
                    hyperparameters = CreateFineTuningJobRequestHyperparameters.fromJson(reader);
                } else if ("suffix".equals(fieldName)) {
                    suffix = reader.getString();
                } else if ("validation_file".equals(fieldName)) {
                    validationFile = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            CreateFineTuningJobRequest deserializedCreateFineTuningJobRequest
                = new CreateFineTuningJobRequest(model, trainingFile);
            deserializedCreateFineTuningJobRequest.hyperparameters = hyperparameters;
            deserializedCreateFineTuningJobRequest.suffix = suffix;
            deserializedCreateFineTuningJobRequest.validationFile = validationFile;

            return deserializedCreateFineTuningJobRequest;
        });
    }
}
