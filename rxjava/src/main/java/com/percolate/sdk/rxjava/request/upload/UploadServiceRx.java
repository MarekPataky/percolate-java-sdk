package com.percolate.sdk.rxjava.request.upload;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.UploadPolicyResponse;
import com.percolate.sdk.dto.UploadRequestData;
import com.percolate.sdk.dto.UploadResponse;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Observable;

import java.util.Map;

/**
 * Percolate v5/upload and v5/upload_policy API definitions.
 */
interface UploadServiceRx {

    @GET(Endpoints.API_V5_PATH + "/upload/{upload_id}")
    Observable<UploadResponse> status(@Path("upload_id") String uploadId);

    @POST(Endpoints.API_V5_PATH + "/upload/")
    Observable<UploadResponse> upload(@Body UploadRequestData uploadRequestData);

    @POST(Endpoints.API_V5_PATH + "/upload_policy/")
    Observable<UploadPolicyResponse> uploadPolicy(@Body Map body);
}
