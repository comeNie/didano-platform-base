package cn.didano.video.json;



import java.util.Date;

import io.swagger.annotations.ApiModelProperty;

public class In_Teacher_Edit {

	@ApiModelProperty(value = "老师id",required=true)
	private Integer id;
	@ApiModelProperty(value = "老师名字id",required=true)
	private String name;
	@ApiModelProperty(value = "老师电话",required=true)
	private String phone ;
	@ApiModelProperty(value = "员工类型",required=true)
	private byte type;
	@ApiModelProperty(value = "所带班级",required=true)
	private Integer class_id;
	
	@ApiModelProperty(value = "签到时间",required=true)
	private Date in_time;
	@ApiModelProperty(value = "签退",required=true)
	private Date out_time;
	@ApiModelProperty(value = "是否有效",required=true)
	private byte deleted;
	
	public byte getDeleted() {
		return deleted;
	}
	public void setDeleted(byte deleted) {
		this.deleted = deleted;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
	public byte getType() {
		return type;
	}
	public void setType(byte type) {
		this.type = type;
	}
	public Integer getClass_id() {
		return class_id;
	}
	public void setClass_id(Integer class_id) {
		this.class_id = class_id;
	}
	
	public Date getIn_time() {
		return in_time;
	}
	public void setIn_time(Date in_time) {
		this.in_time = in_time;
	}
	public Date getOut_time() {
		return out_time;
	}
	public void setOut_time(Date out_time) {
		this.out_time = out_time;
	}
	
}
