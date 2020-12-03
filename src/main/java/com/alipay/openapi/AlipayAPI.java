package com.alipay.openapi;


import com.alipay.api.response.*;
import com.alipay.openapi.entity.*;

public abstract class AlipayAPI {
    public AlipayAPI(
            String app_id,
            String method,
            String format,
            String charset,
            String sign_type,
            String sign,
            String timestamp,
            String version,
            String app_auth_token) {

    }
    public abstract AlipaySystemOauthTokenResponse alipay_system_oauth_token(String grant_type, String code, String refresh_token) throws AlipayError;

    public abstract AlipayOpenAppQrcodeCreateResponse alipay_open_app_qrcode_create(String url_param, String query_param, String describe) throws AlipayError;

    public abstract AlipayMerchantItemFileUploadResponse alipay_merchant_item_file_upload(String scene, byte[] file_content) throws AlipayError;

    public abstract AlipayOpenAppMiniTemplatemessageSendResponse alipay_open_mini_content_sync(alipay_open_mini_content_sync_body body) throws AlipayError;

    public abstract AntMerchantExpandShopQueryResponse ant_merchant_expand_shop_query(ant_merchant_expand_shop_query_body body) throws AlipayError;

    public abstract MonitorHeartbeatSynResponse monitor_heartbeat_syn(String biz_content) throws AlipayError;
}