package com.percolate.sdk.api.request.vendor.instagram;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.vendor.instagram.params.InstagramMediaVendorParams;
import com.percolate.sdk.api.request.vendor.instagram.params.InstagramUserVendorParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.InstagramMedia;
import com.percolate.sdk.dto.InstagramMediaComments;
import com.percolate.sdk.dto.InstagramRecentMedia;
import com.percolate.sdk.dto.InstagramUser;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

/**
 * Instagram vendor request proxy.
 */
@SuppressWarnings("unused")
public class InstagramVendorRequest {

    private InstagramVendorService service;

    public InstagramVendorRequest(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(InstagramVendorService.class);
    }

    /**
     * Query Instagram media endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<InstagramMedia> media(@NotNull final InstagramMediaVendorParams params) {
        return service.media(params.getMediaId(), params.getParams());
    }

    /**
     * Query Instagram comments endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<InstagramMediaComments> comments(@NotNull final InstagramMediaVendorParams params) {
        return service.comments(params.getMediaId(), params.getParams());
    }

    /**
     * Query Instagram recent media endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<InstagramRecentMedia> recent(@NotNull final InstagramUserVendorParams params) {
        return service.recent(params.getInstagramUserId(), params.getParams());
    }

    /**
     * Query Instagram user endpoint.
     *
     * @param params API params.
     * @return {@link Call} object.
     */
    public Call<InstagramUser> user(@NotNull final InstagramUserVendorParams params) {
        return service.user(params.getInstagramUserId(), params.getParams());
    }
}
