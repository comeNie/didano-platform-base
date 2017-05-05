package cn.didano.base.model;

import java.util.Date;

public class Vd_channel {
    private Integer id;

    private String name;

    private String enName;

    private String des;

    private Byte type;

    private Integer schoolId;

    private Integer classId;

    private String ossPushUrl;

    private String ossPlayUrl;

    private Byte status;

    private Date created;

    private Date updated;

    private Boolean deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getOssPushUrl() {
        return ossPushUrl;
    }

    public void setOssPushUrl(String ossPushUrl) {
        this.ossPushUrl = ossPushUrl == null ? null : ossPushUrl.trim();
    }

    public String getOssPlayUrl() {
        return ossPlayUrl;
    }

    public void setOssPlayUrl(String ossPlayUrl) {
        this.ossPlayUrl = ossPlayUrl == null ? null : ossPlayUrl.trim();
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

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
    
}