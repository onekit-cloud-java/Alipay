package com.alipay.openapi;


import com.alipay.api.AlipayApiException;
import com.alipay.api.response.AlipayOpenAppMessageTopicSubscribeResponse;
import com.alipay.api.response.AlipaySystemOauthTokenResponse;
import com.alipay.api.response.MonitorHeartbeatSynResponse;
import com.alipay.openapi.entity.alipay_open_app_message_topic_subscribe_body;


public abstract class AlipayToolAPI extends AlipayAPI {


    public AlipayToolAPI(String host, String app_id, String method, String format, String charset, String sign_type, String sign, String timestamp, String version, String app_auth_token) {
        super(host, app_id, method, format, charset, sign_type, sign, timestamp, version, app_auth_token);
    }

    public abstract AlipaySystemOauthTokenResponse alipay_system_oauth_token(String grant_type, String code, String refresh_token) throws AlipayApiException;

    public abstract MonitorHeartbeatSynResponse monitor_heartbeat_syn(String biz_content) throws AlipayApiException;

    public abstract AlipayOpenAppMessageTopicSubscribeResponse alipay_open_app_message_topic_subscribe(alipay_open_app_message_topic_subscribe_body body) throws AlipayApiException;

}
