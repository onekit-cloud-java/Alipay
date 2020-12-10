package com.alipay.openapi;



@SuppressWarnings("unused")
public abstract class AlipayPayAPI extends AlipayAPI {


    public AlipayPayAPI(String host, String app_id, String method, String format, String charset, String sign_type, String sign, String timestamp, String version, String app_auth_token) {
        super(host, app_id, method, format, charset, sign_type, sign, timestamp, version, app_auth_token);
    }

    //public abstract AntMerchantExpandShopQueryResponse ant_merchant_expand_shop_query(ant_merchant_expand_shop_query_body body) throws AlipayApiException;

}
