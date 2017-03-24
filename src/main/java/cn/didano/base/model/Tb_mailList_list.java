package cn.didano.base.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Tb_mailList_list {
 
	private Integer id;
	private Integer class_id;
	private String name;
	private String class_name;
	private Date birthday;
	private byte gender;
	private String rfid; 
	private List<Tb_parent4mailList> parent = new ArrayList<Tb_parent4mailList>();
	
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getClass_id() {
		return class_id;
	}
	public void setClass_id(Integer class_id) {
		this.class_id = class_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public byte getGender() {
		return gender;
	}
	public void setGender(byte gender) {
		this.gender = gender;
	}
	public List<Tb_parent4mailList> getParent() {
		return parent;
	}
	public void setParent(List<Tb_parent4mailList> parent) {
		this.parent = parent;
	}
	public String getRfid() {
		return rfid;
	}
	public void setRfid(String rfid) {
		this.rfid = rfid;
	}
	
	
}
