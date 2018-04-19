package com.yinda.nbminer.model;

public class LteMacRachTrigger {
    private Integer id;

    private String time;

    private String numberOfSubpackets;

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

    public String getNumberOfSubpackets() {
        return numberOfSubpackets;
    }

    public void setNumberOfSubpackets(String numberOfSubpackets) {
        this.numberOfSubpackets = numberOfSubpackets == null ? null : numberOfSubpackets.trim();
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