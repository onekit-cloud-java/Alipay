package com.alipay.openapi;

import com.alipay.api.AlipayApiException;
import com.alipay.api.response.AlipayMerchantItemFileUploadResponse;
import com.alipay.api.response.AlipayOpenAppMiniTemplatemessageSendResponse;
import com.alipay.api.response.AlipayOpenMiniContentSyncResponse;
import com.alipay.api.response.AlipaySecurityRiskContentDetectResponse;
import com.alipay.openapi.entity.alipay_open_mini_content_sync_body;
import com.alipay.openapi.entity.alipay_security_risk_content_detect_body;

public abstract class AlipayMiniAPI extends AlipayAPI {

    public AlipayMiniAPI(String host, String app_id, String method, String format, String charset, String sign_type, String sign, String timestamp, String version, String app_auth_token) {
        super(host, app_id, method, format, charset, sign_type, sign, timestamp, version, app_auth_token);
    }

    public abstract AlipayMerchantItemFileUploadResponse alipay_merchant_item_file_upload(String scene, String file_content) throws AlipayApiException;

    public abstract AlipayOpenMiniContentSyncResponse alipay_open_mini_content_sync(alipay_open_mini_content_sync_body body) throws AlipayApiException;

    public abstract AlipaySecurityRiskContentDetectResponse alipay_security_risk_content_detect(alipay_security_risk_content_detect_body body) throws AlipayApiException;
}
