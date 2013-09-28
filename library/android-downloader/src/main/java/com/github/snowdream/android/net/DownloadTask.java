/*******************************************************************************
 * Copyright (C) 2013 Snowdream Mobile
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package com.github.snowdream.android.net;

/**
 * The download task
 * 
 * @author snowdream <yanghui1986527@gmail.com>
 * @date Sep 29, 2013
 * @version v1.0
 */
public class DownloadTask {
    /**
     * id
     */
    private int id = 0;

    /**
     * url
     */
    private String url = "";

    /**
     * name
     */
    private String name = "";

    /**
     * total size
     */
    private long size = 0;

    /**
     * download status
     */
    private int status = DownloadStatus.STATUS_PENDING;

    /**
     * the time of start downloading
     */
    private long startTime = 0;

    /**
     * the time of finish downloading
     */
    private long finishTime = 0;

    /**
     * type
     */
    private int type = DownloadType.TYPE_UNKNOWN;

    /**
     * mimetype
     */
    private String mimeType = "";

    /**
     * the save path on the sdcard
     */
    private String path = "";

    private AsycDownloadTask task = null;

    public DownloadTask() {
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(long finishTime) {
        this.finishTime = finishTime;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void start(DownloadListener listener) {
        if(task == null){
            task = new AsycDownloadTask(listener);
        }
        task.execute(this);
    };
}
