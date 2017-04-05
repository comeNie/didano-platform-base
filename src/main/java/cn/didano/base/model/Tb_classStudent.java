package cn.didano.base.model;

import java.util.ArrayList;
import java.util.List;

public class Tb_classStudent {

	private String className;
	private Integer classId;
	private List<Hand_WholeStudentParents4PhoneBook> student = new ArrayList<Hand_WholeStudentParents4PhoneBook>();
	
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public List<Hand_WholeStudentParents4PhoneBook> getStudent() {
		return student;
	}
	public void setStudent(List<Hand_WholeStudentParents4PhoneBook> student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Tb_classStudent [className=" + className + ", student=" + student + "]";
	}
	
}
