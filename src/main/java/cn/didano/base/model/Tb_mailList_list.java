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
	private String student_rfid; 
	
	private List<Tb_parent> parent = new ArrayList<Tb_parent>();
	
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
	public List<Tb_parent> getParent() {
		return parent;
	}
	public void setParent(List<Tb_parent> parent) {
		this.parent = parent;
	}
	
	public String getStudent_rfid() {
		return student_rfid;
	}
	public void setStudent_rfid(String student_rfid) {
		this.student_rfid = student_rfid;
	}
	@Override
	public String toString() {
		return "{\"id\":\"" + id + "\",\"class_id\":\"" + class_id + "\",\"name\":\"" + name + "\",\"class_name\":\""
				+ class_name + "\",\"birthday\":\"" + birthday + "\",\"gender\":\"" + gender + "\",\"student_rfid\":\""
				+ student_rfid + "\",\"parent\":\"" + parent + "\"}  ";
	}	
}
