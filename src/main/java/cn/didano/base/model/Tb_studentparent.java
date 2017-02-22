package cn.didano.base.model;

import java.util.Date;

public class Tb_studentparent {
    private Integer id;

    private Integer schoolId;

    private Integer classId;

    private Integer studentId;

    private Integer parentId;

    private String rfid;

    private Byte relationId;

    private String relationTitle;

    private String qrcodeUrl;

    private String qrcodeSchoolKey;

    private Date created;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid == null ? null : rfid.trim();
    }

    public Byte getRelationId() {
        return relationId;
    }

    public void setRelationId(Byte relationId) {
        this.relationId = relationId;
    }

    public String getRelationTitle() {
        return relationTitle;
    }

    public void setRelationTitle(String relationTitle) {
        this.relationTitle = relationTitle == null ? null : relationTitle.trim();
    }

    public String getQrcodeUrl() {
        return qrcodeUrl;
    }

    public void setQrcodeUrl(String qrcodeUrl) {
        this.qrcodeUrl = qrcodeUrl == null ? null : qrcodeUrl.trim();
    }

    public String getQrcodeSchoolKey() {
        return qrcodeSchoolKey;
    }

    public void setQrcodeSchoolKey(String qrcodeSchoolKey) {
        this.qrcodeSchoolKey = qrcodeSchoolKey == null ? null : qrcodeSchoolKey.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}