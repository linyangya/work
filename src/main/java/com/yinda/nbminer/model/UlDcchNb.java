package com.yinda.nbminer.model;

public class UlDcchNb {
    private Integer id;

    private String time;

    private String pktVersion;

    private String rrcReleaseNumberMajorMinor;

    private String radioBearerId;

    private String physicalCellId;

    private String freq;

    private String sysframenum;

    private String subframenum;

    private String pduNumber;

    private String msgLength;

    private String sibMaskInSi;

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

    public String getPktVersion() {
        return pktVersion;
    }

    public void setPktVersion(String pktVersion) {
        this.pktVersion = pktVersion == null ? null : pktVersion.trim();
    }

    public String getRrcReleaseNumberMajorMinor() {
        return rrcReleaseNumberMajorMinor;
    }

    public void setRrcReleaseNumberMajorMinor(String rrcReleaseNumberMajorMinor) {
        this.rrcReleaseNumberMajorMinor = rrcReleaseNumberMajorMinor == null ? null : rrcReleaseNumberMajorMinor.trim();
    }

    public String getRadioBearerId() {
        return radioBearerId;
    }

    public void setRadioBearerId(String radioBearerId) {
        this.radioBearerId = radioBearerId == null ? null : radioBearerId.trim();
    }

    public String getPhysicalCellId() {
        return physicalCellId;
    }

    public void setPhysicalCellId(String physicalCellId) {
        this.physicalCellId = physicalCellId == null ? null : physicalCellId.trim();
    }

    public String getFreq() {
        return freq;
    }

    public void setFreq(String freq) {
        this.freq = freq == null ? null : freq.trim();
    }

    public String getSysframenum() {
        return sysframenum;
    }

    public void setSysframenum(String sysframenum) {
        this.sysframenum = sysframenum == null ? null : sysframenum.trim();
    }

    public String getSubframenum() {
        return subframenum;
    }

    public void setSubframenum(String subframenum) {
        this.subframenum = subframenum == null ? null : subframenum.trim();
    }

    public String getPduNumber() {
        return pduNumber;
    }

    public void setPduNumber(String pduNumber) {
        this.pduNumber = pduNumber == null ? null : pduNumber.trim();
    }

    public String getMsgLength() {
        return msgLength;
    }

    public void setMsgLength(String msgLength) {
        this.msgLength = msgLength == null ? null : msgLength.trim();
    }

    public String getSibMaskInSi() {
        return sibMaskInSi;
    }

    public void setSibMaskInSi(String sibMaskInSi) {
        this.sibMaskInSi = sibMaskInSi == null ? null : sibMaskInSi.trim();
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