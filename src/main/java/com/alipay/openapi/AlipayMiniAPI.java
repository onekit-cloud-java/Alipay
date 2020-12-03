package com.alipay.openapi;

import com.alipay.api.response.AlipayMerchantItemFileUploadResponse;
import com.alipay.api.response.AlipayOpenAppMiniTemplatemessageSendResponse;
import com.alipay.openapi.entity.alipay_open_mini_content_sync_body;

public abstract class AlipayMiniAPI extends AlipayAPI {
    public AlipayMiniAPI(String app_id, String method, String format, String charset, String sign_type, String sign, String timestamp, String version, String app_auth_token) {
        super(app_id, method, format, charset, sign_type, sign, timestamp, version, app_auth_token);
    }
    public abstract AlipayMerchantItemFileUploadResponse alipay_merchant_item_file_upload(String scene, byte[] file_content);

    public abstract AlipayOpenAppMiniTemplatemessageSendResponse alipay_open_mini_content_sync(alipay_open_mini_content_sync_body body);
}
