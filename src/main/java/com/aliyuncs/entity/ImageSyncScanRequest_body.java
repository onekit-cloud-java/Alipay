package com.aliyuncs.entity;

import java.util.ArrayList;
import java.util.Date;


public class ImageSyncScanRequest_body {
    public enum Scene{
        porn,
        terrorism,
        ad,
        qrcode,
        live,
        logo

    }
    private String bizType;
    private ArrayList<Scene> scenes;
    public static class Task{
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
    private ArrayList<Task> tasks;

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public ArrayList<Scene> getScenes() {
        return scenes;
    }

    public void setScenes(ArrayList<Scene> scenes) {
        this.scenes = scenes;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }
}
