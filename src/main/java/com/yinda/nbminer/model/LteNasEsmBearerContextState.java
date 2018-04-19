package com.yinda.nbminer.model;

public class LteNasEsmBearerContextState {
    private Integer id;

    private String time;

    private String bearerId;

    private String bearerState;

    private Integer connectionId;

    private String type;

    private String fileId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getBearerId() {
        return bearerId;
    }

    public void setBearerId(String bearerId) {
        this.bearerId = bearerId == null ? null : bearerId.trim();
    }

    public String getBearerState() {
        return bearerState;
    }

    public void setBearerState(String bearerState) {
        this.bearerState = bearerState == null ? null : bearerState.trim();
    }

    public Integer getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(Integer connectionId) {
        this.connectionId = connectionId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }
}