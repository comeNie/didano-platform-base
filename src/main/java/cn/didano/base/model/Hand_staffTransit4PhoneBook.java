package cn.didano.base.model;

import java.util.Date;

/**
 * 
 * @author stephen.wang  2017年4月6日 
 */
public class Hand_staffTransit4PhoneBook extends Tb_staff{
    private Integer classId;
    private String title;
    private String staff_ic_number;
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStaff_ic_number() {
		return staff_ic_number;
	}
	public void setStaff_ic_number(String staff_ic_number) {
		this.staff_ic_number = staff_ic_number;
	}
    
}