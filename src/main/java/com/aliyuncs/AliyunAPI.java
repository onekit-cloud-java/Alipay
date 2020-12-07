package com.aliyuncs;


import com.aliyuncs.entity.ImageSyncScanRequest_body;
import com.aliyuncs.http.HttpResponse;

public abstract class AliyunAPI {
    public abstract HttpResponse ImageSyncScanRequest(ImageSyncScanRequest_body body);
}
