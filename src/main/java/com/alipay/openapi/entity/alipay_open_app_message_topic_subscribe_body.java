package com.alipay.openapi.entity;

@SuppressWarnings("unused")
public class alipay_open_app_message_topic_subscribe_body {
    private String auth_token;
    private String auth_type;
    private String topic;
    private String comm_type;
    private String tag;

    public String getAuth_token() {
        return auth_token;
    }

    public void setAuth_token(String auth_token) {
        this.auth_token = auth_token;
    }

    public String getAuth_type() {
        return auth_type;
    }

    public void setAuth_type(String auth_type) {
        this.auth_type = auth_type;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getComm_type() {
        return comm_type;
    }

    public void setComm_type(String comm_type) {
        this.comm_type = comm_type;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
