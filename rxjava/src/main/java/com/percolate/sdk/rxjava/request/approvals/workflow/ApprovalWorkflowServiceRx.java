package com.percolate.sdk.rxjava.request.approvals.workflow;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Workflow;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Percolate v5/approval/workflow API definition.
 */
interface ApprovalWorkflowServiceRx {

    @GET(Endpoints.API_V3_PATH + "/approval/workflow/")
    Observable<Workflow> get(@QueryMap Map<String, Object> params);

}
