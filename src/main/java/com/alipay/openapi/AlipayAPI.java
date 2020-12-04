package com.alipay.openapi;


public abstract class AlipayAPI {
    protected final String host;
    protected final String app_id;
    protected final String method;
    protected final String format;
    protected final String charset;
    protected final String sign_type;
    protected final String sign;
    protected final String timestamp;
    protected final String version;
    protected final String app_auth_token;


    public AlipayAPI(
            String host,
            String app_id,
            String method,
            String format,
            String charset,
            String sign_type,
            String sign,
            String timestamp,
            String version,
            String app_auth_token) {
        this.host=host;
        this.app_id=app_id;
        this.method=method;
        this.format=format;
        this.charset=charset;
        this.sign_type=sign_type;
        this.sign=sign;
        this.timestamp=timestamp;
        this.version=version;
        this.app_auth_token=app_auth_token;


    }

}