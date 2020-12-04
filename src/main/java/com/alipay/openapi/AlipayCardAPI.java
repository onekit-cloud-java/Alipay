package com.alipay.openapi;



public abstract class AlipayCardAPI extends AlipayAPI {


    public AlipayCardAPI(String host, String app_id, String method, String format, String charset, String sign_type, String sign, String timestamp, String version, String app_auth_token) {
        super(host, app_id, method, format, charset, sign_type, sign, timestamp, version, app_auth_token);
    }
}
