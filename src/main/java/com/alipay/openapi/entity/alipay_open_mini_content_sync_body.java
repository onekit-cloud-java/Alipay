package com.alipay.openapi.entity;


import java.util.Map;

public class alipay_open_mini_content_sync_body {
    private String content_type;
    private String operation;
    private Map<String,String[]> content_data;
    private Map<String,String> extend_info;

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

    public Map<String, String[]> getContent_data() {
        return content_data;
    }

    public void setContent_data(Map<String, String[]> content_data) {
        this.content_data = content_data;
    }

    public Map<String, String> getExtend_info() {
        return extend_info;
    }

    public void setExtend_info(Map<String, String> extend_info) {
        this.extend_info = extend_info;
    }
}
