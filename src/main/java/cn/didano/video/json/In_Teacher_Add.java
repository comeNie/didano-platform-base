package cn.didano.video.json;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;

public class In_Teacher_Add {

	@ApiModelProperty(value = "老师名字id",required=true)
	private String name;
	@ApiModelProperty(value = "老师电话",required=true)
	private String phone ;
	@ApiModelProperty(value = "学校id",required=true)
	private Integer schoolId;
	@ApiModelProperty(value = "员工类型",required=true)
	private byte type;
	@ApiModelProperty(value = "所带班级",required=true)
	private Integer classId;
	@ApiModelProperty(value = "是否需要签到",required=true)
	private Integer signTypeId;
	@ApiModelProperty(value = "设置签到时间",required=true)
	private Date setIntime;
	@ApiModelProperty(value = "设置签退时间",required=true)
	private Date setOuttime;
	@ApiModelProperty(value = "是否有效",required=true)
	private byte status;
	
	public Integer getSignTypeId() {
		return signTypeId;
	}
	public void setSignTypeId(Integer signTypeId) {
		this.signTypeId = signTypeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public byte getType() {
		return type;
	}
	public void setType(byte type) {
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
	public byte getStatus() {
		return status;
	}
	public void setStatus(byte status) {
		this.status = status;
	}

	
	
}
