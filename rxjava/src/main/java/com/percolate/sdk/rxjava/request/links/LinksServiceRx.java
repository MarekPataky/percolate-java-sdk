package com.percolate.sdk.rxjava.request.links;

import com.percolate.sdk.api.config.Endpoints;
import com.percolate.sdk.dto.Link;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Percolate v3/links API definition.
 */
interface LinksServiceRx {

    @GET(Endpoints.API_V3_PATH + "/links/{id}")
    Observable<Link> get(@Path("id") String id);

    @POST(Endpoints.API_V3_PATH + "/links")
    Observable<Link> create(@Body Map body);
}
