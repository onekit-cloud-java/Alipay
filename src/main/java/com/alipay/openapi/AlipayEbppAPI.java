package com.alipay.openapi;



public abstract class AlipayEbppAPI extends AlipayAPI {


    public AlipayEbppAPI(String app_id, String method, String format, String charset, String sign_type, String sign, String timestamp, String version, String app_auth_token) {
        super(app_id, method, format, charset, sign_type, sign, timestamp, version, app_auth_token);
    }


}
