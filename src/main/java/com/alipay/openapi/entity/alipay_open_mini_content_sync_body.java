package com.alipay.openapi.entity;

public class alipay_open_mini_content_sync_body {
    private String content_type;
    private String operation;
    private String content_data;
    private String extend_info;

    public String getContent_type() {
        return content_type;
    }

    public void setContent_type(String content_type) {
        this.content_type = content_type;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getContent_data() {
        return content_data;
    }

    public void setContent_data(String content_data) {
        this.content_data = content_data;
    }

    public String getExtend_info() {
        return extend_info;
    }

    public void setExtend_info(String extend_info) {
        this.extend_info = extend_info;
    }
}
