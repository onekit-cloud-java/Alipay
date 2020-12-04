package com.alipay.openapi;


import com.alipay.api.AlipayApiException;
import com.alipay.api.response.AlipayOpenAppQrcodeCreateResponse;
import com.alipay.openapi.entity.alipay_open_app_qrcode_create_body;


public abstract class AlipaySellAPI extends AlipayAPI {


    public AlipaySellAPI(String host, String app_id, String method, String format, String charset, String sign_type, String sign, String timestamp, String version, String app_auth_token) {
        super(host, app_id, method, format, charset, sign_type, sign, timestamp, version, app_auth_token);
    }

    public abstract AlipayOpenAppQrcodeCreateResponse alipay_open_app_qrcode_create(alipay_open_app_qrcode_create_body body) throws AlipayApiException;

}
