package cn.didano.base.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Tb_address_list {
 
	private Integer id;
	private Integer class_id;
	private String name;
	private Date birthday;
	private Byte gender;
	private List<Tb_parent> parent = new ArrayList<Tb_parent>();
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

	public Byte getGender() {
		return gender;
	}
	public void setGender(Byte gender) {
		this.gender = gender;
	}
	public List<Tb_parent> getParent() {
		return parent;
	}
	public void setParent(List<Tb_parent> parent) {
		this.parent = parent;
	}
	@Override
	public String toString() {
		return "Tb_address_list [id=" + id + ", class_id=" + class_id + ", name=" + name + ", birthday=" + birthday
				+ ", gender=" + gender + ", parent=" + parent + "]";
	}
	
	
	
	
	
	
	
	
}
