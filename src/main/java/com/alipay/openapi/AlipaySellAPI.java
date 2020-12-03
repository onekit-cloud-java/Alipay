package com.alipay.openapi;


import com.alipay.api.response.AntMerchantExpandShopQueryResponse;
import com.alipay.openapi.entity.ant_merchant_expand_shop_query_body;

public abstract class AlipaySellAPI extends AlipayAPI {


    public AlipaySellAPI(String app_id, String method, String format, String charset, String sign_type, String sign, String timestamp, String version, String app_auth_token) {
        super(app_id, method, format, charset, sign_type, sign, timestamp, version, app_auth_token);
    }
    public abstract AntMerchantExpandShopQueryResponse ant_merchant_expand_shop_query(ant_merchant_expand_shop_query_body body);

}
