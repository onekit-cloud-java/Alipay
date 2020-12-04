package com.alipay.openapi;


import com.alipay.openapi.entity.ImageSyncScanRequest_body;
import com.aliyuncs.http.HttpResponse;

public abstract class AliyunAPI {
    public abstract HttpResponse ImageSyncScanRequest(ImageSyncScanRequest_body body);
}
