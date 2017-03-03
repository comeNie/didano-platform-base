package cn.didano.base.model;

import java.util.Date;

public class Tb_student_detection {
    private Integer id;

    private Integer studentId;

    private Integer height;

    private Integer weight;

    private Integer stateType;

    private Integer recognitionType;

    private Float envTemperature;

    private Float rawTemperature;

    private Float temperatureThreshold;

    private Byte first;

    private Byte lastest;

    private String terminalImgId;

    private Integer fileImgId;

    private String orgImgUrl;

    private Integer weichatNum;

    private Byte status;

    private Date created;

    private Date updated;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getStateType() {
        return stateType;
    }

    public void setStateType(Integer stateType) {
        this.stateType = stateType;
    }

    public Integer getRecognitionType() {
        return recognitionType;
    }

    public void setRecognitionType(Integer recognitionType) {
        this.recognitionType = recognitionType;
    }

    public Float getEnvTemperature() {
        return envTemperature;
    }

    public void setEnvTemperature(Float envTemperature) {
        this.envTemperature = envTemperature;
    }

    public Float getRawTemperature() {
        return rawTemperature;
    }

    public void setRawTemperature(Float rawTemperature) {
        this.rawTemperature = rawTemperature;
    }

    public Float getTemperatureThreshold() {
        return temperatureThreshold;
    }

    public void setTemperatureThreshold(Float temperatureThreshold) {
        this.temperatureThreshold = temperatureThreshold;
    }

    public Byte getFirst() {
        return first;
    }

    public void setFirst(Byte first) {
        this.first = first;
    }

    public Byte getLastest() {
        return lastest;
    }

    public void setLastest(Byte lastest) {
        this.lastest = lastest;
    }

    public String getTerminalImgId() {
        return terminalImgId;
    }

    public void setTerminalImgId(String terminalImgId) {
        this.terminalImgId = terminalImgId == null ? null : terminalImgId.trim();
    }

    public Integer getFileImgId() {
        return fileImgId;
    }

    public void setFileImgId(Integer fileImgId) {
        this.fileImgId = fileImgId;
    }

    public String getOrgImgUrl() {
        return orgImgUrl;
    }

    public void setOrgImgUrl(String orgImgUrl) {
        this.orgImgUrl = orgImgUrl == null ? null : orgImgUrl.trim();
    }

    public Integer getWeichatNum() {
        return weichatNum;
    }

    public void setWeichatNum(Integer weichatNum) {
        this.weichatNum = weichatNum;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}