package com.percolate.sdk.api.config;

import okhttp3.Interceptor;

/**
 * Percolate server endpoint configuration data.
 */
public class PercolateServer {

    /**
     * Transport layer.  {@code "http"} or {@code "https"}.
     */
    private final String transport;

    /**
     * Domain name.  Eg: "percolate.com".
     */
    private final String domain;

    /**
     * Will proxy all network requests through {@code 127.0.0.1:8888}.
     */
    private boolean enableLocalProxy = false;

    /**
     * Allow clients to inject a custom interceptor if required.
     */
    private Interceptor customInterceptor;

    public PercolateServer(String transport, String domain) {
        this.transport = transport;
        this.domain = domain;
    }

    public String getTransport() {
        return transport;
    }

    public String getDomain() {
        return domain;
    }

    public boolean getEnableLocalProxy() {
        return enableLocalProxy;
    }

    public void setEnableLocalProxy(boolean enableLocalProxy) {
        this.enableLocalProxy = enableLocalProxy;
    }

    public Interceptor getCustomInterceptor() {
        return customInterceptor;
    }

    public void setCustomInterceptor(Interceptor customInterceptor) {
        this.customInterceptor = customInterceptor;
    }
}
