// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;

/**
 * The CreateImageEditRequest model.
 */
@Metadata(conditions = { TypeConditions.FLUENT })
public final class CreateImageEditRequest {
    /*
     * The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not
     * provided, image must have transparency, which will be used as the mask.
     */
    @Metadata(generated = true)
    private final ImageFileDetails image;

    /*
     * A text description of the desired image(s). The maximum length is 1000 characters.
     */
    @Metadata(generated = true)
    private final String prompt;

    /*
     * An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where
     * `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions
     * as `image`.
     */
    @Metadata(generated = true)
    private MaskFileDetails mask;

    /*
     * The model to use for image generation. Only `dall-e-2` is supported at this time.
     */
    @Metadata(generated = true)
    private CreateImageEditRequestModel model;

    /*
     * The number of images to generate. Must be between 1 and 10.
     */
    @Metadata(generated = true)
    private Long n;

    /*
     * The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
     */
    @Metadata(generated = true)
    private CreateImageEditRequestSize size;

    /*
     * The format in which the generated images are returned. Must be one of `url` or `b64_json`.
     */
    @Metadata(generated = true)
    private CreateImageEditRequestResponseFormat responseFormat;

    /*
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect
     * abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
     */
    @Metadata(generated = true)
    private String user;

    /**
     * Creates an instance of CreateImageEditRequest class.
     * 
     * @param image the image value to set.
     * @param prompt the prompt value to set.
     */
    @Metadata(generated = true)
    public CreateImageEditRequest(ImageFileDetails image, String prompt) {
        this.image = image;
        this.prompt = prompt;
    }

    /**
     * Get the image property: The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not
     * provided, image must have transparency, which will be used as the mask.
     * 
     * @return the image value.
     */
    @Metadata(generated = true)
    public ImageFileDetails getImage() {
        return this.image;
    }

    /**
     * Get the prompt property: A text description of the desired image(s). The maximum length is 1000 characters.
     * 
     * @return the prompt value.
     */
    @Metadata(generated = true)
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * Get the mask property: An additional image whose fully transparent areas (e.g. where alpha is zero) indicate
     * where
     * `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions
     * as `image`.
     * 
     * @return the mask value.
     */
    @Metadata(generated = true)
    public MaskFileDetails getMask() {
        return this.mask;
    }

    /**
     * Set the mask property: An additional image whose fully transparent areas (e.g. where alpha is zero) indicate
     * where
     * `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions
     * as `image`.
     * 
     * @param mask the mask value to set.
     * @return the CreateImageEditRequest object itself.
     */
    @Metadata(generated = true)
    public CreateImageEditRequest setMask(MaskFileDetails mask) {
        this.mask = mask;
        return this;
    }

    /**
     * Get the model property: The model to use for image generation. Only `dall-e-2` is supported at this time.
     * 
     * @return the model value.
     */
    @Metadata(generated = true)
    public CreateImageEditRequestModel getModel() {
        return this.model;
    }

    /**
     * Set the model property: The model to use for image generation. Only `dall-e-2` is supported at this time.
     * 
     * @param model the model value to set.
     * @return the CreateImageEditRequest object itself.
     */
    @Metadata(generated = true)
    public CreateImageEditRequest setModel(CreateImageEditRequestModel model) {
        this.model = model;
        return this;
    }

    /**
     * Get the n property: The number of images to generate. Must be between 1 and 10.
     * 
     * @return the n value.
     */
    @Metadata(generated = true)
    public Long getN() {
        return this.n;
    }

    /**
     * Set the n property: The number of images to generate. Must be between 1 and 10.
     * 
     * @param n the n value to set.
     * @return the CreateImageEditRequest object itself.
     */
    @Metadata(generated = true)
    public CreateImageEditRequest setN(Long n) {
        this.n = n;
        return this;
    }

    /**
     * Get the size property: The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
     * 
     * @return the size value.
     */
    @Metadata(generated = true)
    public CreateImageEditRequestSize getSize() {
        return this.size;
    }

    /**
     * Set the size property: The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
     * 
     * @param size the size value to set.
     * @return the CreateImageEditRequest object itself.
     */
    @Metadata(generated = true)
    public CreateImageEditRequest setSize(CreateImageEditRequestSize size) {
        this.size = size;
        return this;
    }

    /**
     * Get the responseFormat property: The format in which the generated images are returned. Must be one of `url` or
     * `b64_json`.
     * 
     * @return the responseFormat value.
     */
    @Metadata(generated = true)
    public CreateImageEditRequestResponseFormat getResponseFormat() {
        return this.responseFormat;
    }

    /**
     * Set the responseFormat property: The format in which the generated images are returned. Must be one of `url` or
     * `b64_json`.
     * 
     * @param responseFormat the responseFormat value to set.
     * @return the CreateImageEditRequest object itself.
     */
    @Metadata(generated = true)
    public CreateImageEditRequest setResponseFormat(CreateImageEditRequestResponseFormat responseFormat) {
        this.responseFormat = responseFormat;
        return this;
    }

    /**
     * Get the user property: A unique identifier representing your end-user, which can help OpenAI to monitor and
     * detect
     * abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
     * 
     * @return the user value.
     */
    @Metadata(generated = true)
    public String getUser() {
        return this.user;
    }

    /**
     * Set the user property: A unique identifier representing your end-user, which can help OpenAI to monitor and
     * detect
     * abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
     * 
     * @param user the user value to set.
     * @return the CreateImageEditRequest object itself.
     */
    @Metadata(generated = true)
    public CreateImageEditRequest setUser(String user) {
        this.user = user;
        return this;
    }
}
