package cn.didano.base.model;

import java.util.Date;

public class Wx_template {
    private Integer id;

    private Integer officialAccountId;

    private String tmplateWxId;

    private Byte type;

    private String title;

    private Date created;

    private Date updated;

    private Boolean deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOfficialAccountId() {
        return officialAccountId;
    }

    public void setOfficialAccountId(Integer officialAccountId) {
        this.officialAccountId = officialAccountId;
    }

    public String getTmplateWxId() {
        return tmplateWxId;
    }

    public void setTmplateWxId(String tmplateWxId) {
        this.tmplateWxId = tmplateWxId == null ? null : tmplateWxId.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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