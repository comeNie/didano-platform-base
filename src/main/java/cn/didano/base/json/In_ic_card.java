package cn.didano.base.json;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;

public class In_ic_card {
	
	@ApiModelProperty(value = "ic卡的ic",required=false)
    private Integer id;
	@ApiModelProperty(value = "卡的类型1是家长和老师卡，2是宝宝卡",required=true)
    private Integer icType;
	@ApiModelProperty(value = "卡的编号",required=true)
    private String icNumber;
	@ApiModelProperty(value = "卡的ID编号",required=true)
    private String rfid;
	@ApiModelProperty(value = "卡对应的学校",required=false)
    private Integer schoolId;
	@ApiModelProperty(value = "卡的状态，1未交付、2以交付、3一绑定",required=true)
    private Integer status;
	@ApiModelProperty(value = "创建时间",required=false)
    private Date created;
	@ApiModelProperty(value = "修改时间",required=false)
    private Date updated;
	@ApiModelProperty(value = "卡是否被删除",required=false)
    private Boolean deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIcType() {
        return icType;
    }

    public void setIcType(Integer icType) {
        this.icType = icType;
    }

    public String getIcNumber() {
        return icNumber;
    }

    public void setIcNumber(String icNumber) {
        this.icNumber = icNumber == null ? null : icNumber.trim();
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid == null ? null : rfid.trim();
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
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