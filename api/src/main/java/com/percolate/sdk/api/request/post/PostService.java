package com.percolate.sdk.api.request.post;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.dto.PostV5;
import com.percolate.sdk.dto.PostV5Data;
import com.percolate.sdk.dto.PostsV5;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 * Percolate v5/post API definition.
 */
interface PostService {

    @GET(PercolateApi.API_V5_PATH + "/post/{post_id}")
    Call<PostV5> get(@Path("post_id") String postId, @QueryMap Map<String, Object> params);

    @GET(PercolateApi.API_V5_PATH + "/post/")
    Call<PostsV5> list(@QueryMap Map<String, Object> params);

    @POST(PercolateApi.API_V5_PATH + "/post/")
    Call<PostV5> create(@Body PostV5Data postV5Data);

    @PUT(PercolateApi.API_V5_PATH + "/post/{post_id}")
    Call<PostV5> update(@Path("post_id") String postId, @Body PostV5Data postV5Data);

    @DELETE(PercolateApi.API_V4_PATH + "/post/{post_id}")
    Call<ResponseBody> deleteV4(@Path("post_id") String postId, @QueryMap Map<String, Object> params);

    @DELETE(PercolateApi.API_V5_PATH + "/post/{post_id}")
    Call<ResponseBody> deleteV5(@Path("post_id") String postId, @QueryMap Map<String, Object> params);
}
