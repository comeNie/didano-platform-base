package cn.didano.base.model;

import java.util.ArrayList;
import java.util.List;

public class Tb_bossData {

	private List<Tb_teacher> teacher  = new ArrayList<Tb_teacher>();
	private List<Tb_newstaff> staff =new ArrayList<Tb_newstaff>();
	private List<Tb_classStudent> student = new ArrayList<Tb_classStudent>();
	
	public List<Tb_teacher> getTeacher() {
		return teacher;
	}
	public void setTeacher(List<Tb_teacher> teacher) {
		this.teacher = teacher;
	}
	public List<Tb_newstaff> getStaff() {
		return staff;
	}
	public void setStaff(List<Tb_newstaff> staff) {
		this.staff = staff;
	}
	public List<Tb_classStudent> getStudent() {
		return student;
	}
	public void setStudent(List<Tb_classStudent> student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Tb_bossData [teacher=" + teacher + ", staff=" + staff + ", student=" + student + "]";
	}
	
}
