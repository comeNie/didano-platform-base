package cn.didano.base.model;

import java.util.Date;

public class Tb_teacher {

	private Integer id;
	private String name;
	private byte type;
	private String phone;
	private Integer class_id;
	private long sign_timestamp;
	private Date in_time;
	private Date out_time;
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
	public long getSign_timestamp() {
		return sign_timestamp;
	}
	public void setSign_timestamp(long sign_timestamp) {
		this.sign_timestamp = sign_timestamp;
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
	@Override
	public String toString() {
		return "Tb_teacher [id=" + id + ", name=" + name + ", type=" + type + ", phone=" + phone + ", class_id="
				+ class_id + ", sign_timestamp=" + sign_timestamp + ", in_time=" + in_time + ", out_time=" + out_time
				+ ", deleted=" + deleted + "]";
	}
	
}
