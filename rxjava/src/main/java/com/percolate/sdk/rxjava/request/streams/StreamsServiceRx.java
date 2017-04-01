package com.percolate.sdk.rxjava.request.streams;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Streams;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Percolate v5/stream API definition.
 */
interface StreamsServiceRx {

    @GET(Endpoints.API_V5_PATH + "/stream/")
    Observable<Streams> get(@QueryMap Map<String, Object> params);
}
