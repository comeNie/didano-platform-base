package cn.didano.base.model;

import java.util.ArrayList;
import java.util.List;

public class Tb_classStudent {

	private String className;
	private List<Tb_address_list> student = new ArrayList<Tb_address_list>();
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public List<Tb_address_list> getStudent() {
		return student;
	}
	public void setStudent(List<Tb_address_list> student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Tb_classStudent [className=" + className + ", student=" + student + "]";
	}
	
}
