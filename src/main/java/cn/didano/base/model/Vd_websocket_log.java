package cn.didano.base.model;

import java.util.Date;

public class Vd_websocket_log {
    private Integer id;

    private Integer vdChannelId;

    private String httpsessionId;

    private Integer studentId;

    private String openId;

    private Byte type;

    private Date created;

    private Date updated;

    private Boolean deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVdChannelId() {
        return vdChannelId;
    }

    public void setVdChannelId(Integer vdChannelId) {
        this.vdChannelId = vdChannelId;
    }

    public String getHttpsessionId() {
        return httpsessionId;
    }

    public void setHttpsessionId(String httpsessionId) {
        this.httpsessionId = httpsessionId == null ? null : httpsessionId.trim();
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
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