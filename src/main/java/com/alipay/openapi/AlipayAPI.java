package com.alipay.openapi;


import com.alipay.openapi.entity.*;

public abstract class AlipayAPI {
    public AlipayAPI(
            String app_id,
            String method,
            String format,
            String return_url,
            String charset) {

    }

    public abstract alipay_system_oauth_token_response alipay_system_oauth_token(Request request,String grant_type, String code, String refresh_token) throws AlipayError;

    public abstract alipay_open_app_qrcode_create_response alipay_open_app_qrcode_create(Request request,String url_param, String query_param, String describe) throws AlipayError;

    public abstract alipay_merchant_item_file_upload_response alipay_merchant_item_file_upload(Request request,String scene, byte[] file_content) throws AlipayError;

    public abstract alipay_open_mini_content_sync_response alipay_open_mini_content_sync(Request request,alipay_open_mini_content_sync_body body) throws AlipayError;

    public abstract ant_merchant_expand_shop_query_response ant_merchant_expand_shop_query(Request request,ant_merchant_expand_shop_query_body body) throws AlipayError;

    public abstract monitor_heartbeat_syn_response monitor_heartbeat_syn(Request request,String biz_content) throws AlipayError;
}