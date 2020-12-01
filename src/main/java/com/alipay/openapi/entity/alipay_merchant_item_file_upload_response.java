package com.alipay.openapi.entity;

public class alipay_merchant_item_file_upload_response extends Response{

    private String material_id;
    private String material_key;


    public String getMaterial_id() {
        return material_id;
    }

    public void setMaterial_id(String material_id) {
        this.material_id = material_id;
    }

    public String getMaterial_key() {
        return material_key;
    }

    public void setMaterial_key(String material_key) {
        this.material_key = material_key;
    }
}
