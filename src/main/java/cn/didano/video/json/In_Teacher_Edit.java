package cn.didano.video.json;



import java.util.Date;

import io.swagger.annotations.ApiModelProperty;

public class In_Teacher_Edit {
	@ApiModelProperty(value = "操作人员工id",required=true)
	private Integer staffid;
	@ApiModelProperty(value = "老师id",required=true)
	private Integer id;
	@ApiModelProperty(value = "老师名字id",required=true)
	private String name;
	@ApiModelProperty(value = "老师电话",required=true)
	private String phone ;
	@ApiModelProperty(value = "员工类型",required=true)
	private byte type;
	@ApiModelProperty(value = "所带班级",required=true)
	private Integer classId;
	
	@ApiModelProperty(value = "设置签到时间",required=true)
	private String setIntime;
	@ApiModelProperty(value = "设置签退时间",required=true)
	private String setOuttime;
	@ApiModelProperty(value = "是否有效",required=true)
	private byte status;
	
	//杨超强添加教师staff_ic_number
	@ApiModelProperty(value = "IC卡编号",required=true)
	//private String rfid;
	private String staff_ic_number;
	
	public String getStaff_ic_number() {
		return staff_ic_number;
	}
	public void setStaff_ic_number(String staff_ic_number) {
		this.staff_ic_number = staff_ic_number;
	}
	public Integer getStaffid() {
		return staffid;
	}
	public void setStaffid(Integer staffid) {
		this.staffid = staffid;
	}
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
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	
	public String getSetIntime() {
		return setIntime;
	}
	public void setSetIntime(String setIntime) {
		this.setIntime = setIntime;
	}
	public String getSetOuttime() {
		return setOuttime;
	}
	public void setSetOuttime(String setOuttime) {
		this.setOuttime = setOuttime;
	}
	public byte getStatus() {
		return status;
	}
	public void setStatus(byte status) {
		this.status = status;
	}
	
	
	
}
