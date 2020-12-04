package com.alipay.openapi.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class ImageSyncScanRequest_body {
    public enum scene{
        porn,
        terrorism,
        ad,
        qrcode,
        live,
        logo

    }
    private String bizType;
    private ArrayList<scene> scenes;
    public class tasks{
        private String dataId;
        private String url;
        private Date time;
        private int interval;
        private int maxFrames;

        public String getDataId() {
            return dataId;
        }

        public void setDataId(String dataId) {
            this.dataId = dataId;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Date getTime() {
            return time;
        }

        public void setTime(Date time) {
            this.time = time;
        }

        public int getInterval() {
            return interval;
        }

        public void setInterval(int interval) {
            this.interval = interval;
        }

        public int getMaxFrames() {
            return maxFrames;
        }

        public void setMaxFrames(int maxFrames) {
            this.maxFrames = maxFrames;
        }
    }
    private HashMap<String,tasks> tasks;

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public ArrayList<scene> getScenes() {
        return scenes;
    }

    public void setScenes(ArrayList<scene> scenes) {
        this.scenes = scenes;
    }

    public HashMap<String, ImageSyncScanRequest_body.tasks> getTasks() {
        return tasks;
    }

    public void setTasks(HashMap<String, ImageSyncScanRequest_body.tasks> tasks) {
        this.tasks = tasks;
    }
}
