package com.percolate.sdk.rxjava.request.schema;

import com.percolate.sdk.api.PercolateApi;
import com.percolate.sdk.api.request.schema.SchemasGetParams;
import com.percolate.sdk.api.request.schema.SchemasListParams;
import com.percolate.sdk.api.utils.RetrofitApiFactory;
import com.percolate.sdk.dto.Schemas;
import com.percolate.sdk.dto.SingleSchema;

import org.jetbrains.annotations.NotNull;

import io.reactivex.Observable;

/**
 * Schemas request proxy.
 */
@SuppressWarnings("unused")
public class SchemasRequestRx {

    private SchemasServiceRx service;

    public SchemasRequestRx(@NotNull PercolateApi context) {
        this.service = new RetrofitApiFactory(context).getService(SchemasServiceRx.class);
    }

    /**
     * Query schemas endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<Schemas> list(@NotNull final SchemasListParams params) {
        return service.list(params.getParams());
    }

    /**
     * Query schemas endpoint.
     *
     * @param params API params.
     * @return {@link Observable} object.
     */
    public Observable<SingleSchema> get(@NotNull final SchemasGetParams params) {
        return service.get(params.getSchemaId(), params.getParams());
    }
}
