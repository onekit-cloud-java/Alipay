package com.alipay.openapi;

import com.alipay.openapi.entity.tool.alipay_user_info_auth_response;

public abstract class AlipayToolAPI extends AlipayAPI {
    public AlipayToolAPI(String app_id, String method, String format, String return_url, String charset) {
        super(app_id, method, format, return_url, charset);
    }

    public abstract alipay_user_info_auth_response alipay_user_info_auth();

}
