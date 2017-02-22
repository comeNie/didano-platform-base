package cn.didano.base.model;

import java.util.Date;

public class Tb_staff_signdate {
    private Long id;

    private Integer staffId;

    private Long signTimestamp;

    private Date signDate;

    private Byte signStatus;

    private Date setIntime;

    private Date setOuttime;

    private Date inTime;

    private Date outTime;

    private String inImg;

    private String outImg;

    private Date created;

    private Date updated;

    private Boolean deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Long getSignTimestamp() {
        return signTimestamp;
    }

    public void setSignTimestamp(Long signTimestamp) {
        this.signTimestamp = signTimestamp;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public Byte getSignStatus() {
        return signStatus;
    }

    public void setSignStatus(Byte signStatus) {
        this.signStatus = signStatus;
    }

    public Date getSetIntime() {
        return setIntime;
    }

    public void setSetIntime(Date setIntime) {
        this.setIntime = setIntime;
    }

    public Date getSetOuttime() {
        return setOuttime;
    }

    public void setSetOuttime(Date setOuttime) {
        this.setOuttime = setOuttime;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public String getInImg() {
        return inImg;
    }

    public void setInImg(String inImg) {
        this.inImg = inImg == null ? null : inImg.trim();
    }

    public String getOutImg() {
        return outImg;
    }

    public void setOutImg(String outImg) {
        this.outImg = outImg == null ? null : outImg.trim();
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

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}