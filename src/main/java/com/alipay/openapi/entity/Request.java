package com.alipay.openapi.entity;

public abstract class Request {
    public Request(
            String sign_type,
            String sign,
            String timestamp,
            String version,
            String app_auth_token,
            String biz_conent) {

    }
}
