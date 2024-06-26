// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.implementation;

import com.openai.models.ListRunsResponse;
import com.openai.models.ListRunStepsResponse;
import com.openai.models.RunObject;
import com.openai.models.RunStepObject;
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
 * An instance of this class provides access to all the operations defined in Runs.
 */
public final class RunsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final RunsService service;

    /**
     * The service client containing this operation class.
     */
    private final OpenAIClientImpl client;

    /**
     * Initializes an instance of RunsImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    RunsImpl(OpenAIClientImpl client) {
        this.service = RestProxy.create(RunsService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for OpenAIClientRuns to be used by the proxy service to perform REST
     * calls.
     */
    @ServiceInterface(name = "OpenAIClientRuns", host = "https://api.openai.com/v1")
    public interface RunsService {
        @HttpRequestInformation(method = HttpMethod.POST, path = "/threads/runs", expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<RunObject> createThreadAndRunSync(@HeaderParam("accept") String accept,
            @BodyParam("application/json") BinaryData threadAndRun, RequestOptions requestOptions);

        @HttpRequestInformation(
            method = HttpMethod.POST,
            path = "/threads/{thread_id}/runs",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<RunObject> createRunSync(@PathParam("thread_id") String threadId, @HeaderParam("accept") String accept,
            @BodyParam("application/json") BinaryData run, RequestOptions requestOptions);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/threads/{thread_id}/runs",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<ListRunsResponse> listRunsSync(@PathParam("thread_id") String threadId,
            @HeaderParam("accept") String accept, RequestOptions requestOptions);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/threads/{thread_id}/runs/{run_id}",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<RunObject> getRunSync(@PathParam("thread_id") String threadId, @PathParam("run_id") String runId,
            @HeaderParam("accept") String accept, RequestOptions requestOptions);

        @HttpRequestInformation(
            method = HttpMethod.POST,
            path = "/threads/{thread_id}/runs/{run_id}",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<RunObject> modifyRunSync(@PathParam("thread_id") String threadId, @PathParam("run_id") String runId,
            @HeaderParam("accept") String accept, @BodyParam("application/json") BinaryData run,
            RequestOptions requestOptions);

        @HttpRequestInformation(
            method = HttpMethod.POST,
            path = "/threads/{thread_id}/runs/{run_id}/cancel",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<RunObject> cancelRunSync(@PathParam("thread_id") String threadId, @PathParam("run_id") String runId,
            @HeaderParam("accept") String accept, RequestOptions requestOptions);

        @HttpRequestInformation(
            method = HttpMethod.POST,
            path = "/threads/{thread_id}/runs/{run_id}/submit_tool_outputs",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<RunObject> submitToolOuputsToRunSync(@PathParam("thread_id") String threadId,
            @PathParam("run_id") String runId, @HeaderParam("accept") String accept,
            @BodyParam("application/json") BinaryData submitToolOutputsRun, RequestOptions requestOptions);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/threads/{thread_id}/runs/{run_id}/steps",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<ListRunStepsResponse> listRunStepsSync(@PathParam("thread_id") String threadId,
            @PathParam("run_id") String runId, @HeaderParam("accept") String accept, RequestOptions requestOptions);

        @HttpRequestInformation(
            method = HttpMethod.GET,
            path = "/threads/{thread_id}/runs/{run_id}/steps/{step_id}",
            expectedStatusCodes = { 200 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "CLIENT_AUTHENTICATION", statusCode = { 401 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_NOT_FOUND", statusCode = { 404 })
        @UnexpectedResponseExceptionDetail(exceptionTypeName = "RESOURCE_MODIFIED", statusCode = { 409 })
        @UnexpectedResponseExceptionDetail
        Response<RunStepObject> getRunStepSync(@PathParam("thread_id") String threadId,
            @PathParam("run_id") String runId, @PathParam("step_id") String stepId,
            @HeaderParam("accept") String accept, RequestOptions requestOptions);
    }

    /**
     * Create a thread and run it in one request.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     assistant_id: String (Required)
     *     thread (Optional): {
     *         messages (Optional): [
     *              (Optional){
     *                 role: String (Required)
     *                 content: String (Required)
     *                 file_ids (Optional): [
     *                     String (Optional)
     *                 ]
     *                 metadata (Optional): {
     *                     String: String (Required)
     *                 }
     *             }
     *         ]
     *         metadata (Optional): {
     *             String: String (Required)
     *         }
     *     }
     *     model: String (Optional)
     *     instructions: String (Optional)
     *     tools (Optional): [
     *         BinaryData (Optional)
     *     ]
     *     metadata (Optional): {
     *         String: String (Required)
     *     }
     * }
     * }</pre>
     * 
     * @param threadAndRun The threadAndRun parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents an execution run on a [thread](/docs/api-reference/threads).
     */
    public Response<RunObject> createThreadAndRunWithResponse(BinaryData threadAndRun, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.createThreadAndRunSync(accept, threadAndRun, requestOptions);
    }

    /**
     * Create a run.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     assistant_id: String (Required)
     *     model: String (Optional)
     *     instructions: String (Optional)
     *     additional_instructions: String (Optional)
     *     tools (Optional): [
     *         BinaryData (Optional)
     *     ]
     *     metadata (Optional): {
     *         String: String (Required)
     *     }
     * }
     * }</pre>
     * 
     * @param threadId The ID of the thread to run.
     * @param run The run parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents an execution run on a [thread](/docs/api-reference/threads).
     */
    public Response<RunObject> createRunWithResponse(String threadId, BinaryData run, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.createRunSync(threadId, accept, run, requestOptions);
    }

    /**
     * Returns a list of runs belonging to a thread.
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
     * @param threadId The ID of the thread the run belongs to.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    public Response<ListRunsResponse> listRunsWithResponse(String threadId, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.listRunsSync(threadId, accept, requestOptions);
    }

    /**
     * Retrieves a run.
     * 
     * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run.
     * @param runId The ID of the run to retrieve.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents an execution run on a [thread](/docs/api-reference/threads).
     */
    public Response<RunObject> getRunWithResponse(String threadId, String runId, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.getRunSync(threadId, runId, accept, requestOptions);
    }

    /**
     * Modifies a run.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     metadata (Optional): {
     *         String: String (Required)
     *     }
     * }
     * }</pre>
     * 
     * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run.
     * @param runId The ID of the run to modify.
     * @param run The run parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents an execution run on a [thread](/docs/api-reference/threads).
     */
    public Response<RunObject> modifyRunWithResponse(String threadId, String runId, BinaryData run,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.modifyRunSync(threadId, runId, accept, run, requestOptions);
    }

    /**
     * Cancels a run that is `in_progress`.
     * 
     * @param threadId The ID of the thread to which this run belongs.
     * @param runId The ID of the run to cancel.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents an execution run on a [thread](/docs/api-reference/threads).
     */
    public Response<RunObject> cancelRunWithResponse(String threadId, String runId, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.cancelRunSync(threadId, runId, accept, requestOptions);
    }

    /**
     * When a run has the `status: "requires_action"` and `required_action.type` is
     * `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once
     * they're all completed. All outputs must be submitted in a single request.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     tool_outputs (Required): [
     *          (Required){
     *             tool_call_id: String (Optional)
     *             output: String (Optional)
     *         }
     *     ]
     * }
     * }</pre>
     * 
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
     * @param runId The ID of the run that requires the tool output submission.
     * @param submitToolOutputsRun The submitToolOutputsRun parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents an execution run on a [thread](/docs/api-reference/threads).
     */
    public Response<RunObject> submitToolOuputsToRunWithResponse(String threadId, String runId,
        BinaryData submitToolOutputsRun, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.submitToolOuputsToRunSync(threadId, runId, accept, submitToolOutputsRun, requestOptions);
    }

    /**
     * Returns a list of run steps belonging to a run.
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
     * @param threadId The ID of the thread the run and run steps belong to.
     * @param runId The ID of the run the run steps belong to.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    public Response<ListRunStepsResponse> listRunStepsWithResponse(String threadId, String runId,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.listRunStepsSync(threadId, runId, accept, requestOptions);
    }

    /**
     * Retrieves a run step.
     * 
     * @param threadId The ID of the thread to which the run and run step belongs.
     * @param runId The ID of the run to which the run step belongs.
     * @param stepId The ID of the run step to retrieve.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return represents a step in execution of a run.
     */
    public Response<RunStepObject> getRunStepWithResponse(String threadId, String runId, String stepId,
        RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.getRunStepSync(threadId, runId, stepId, accept, requestOptions);
    }
}
