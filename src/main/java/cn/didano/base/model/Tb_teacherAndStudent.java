package cn.didano.base.model;

import java.util.ArrayList;
import java.util.List;

public class Tb_teacherAndStudent {
	private List<Tb_teacher> teacher  = new ArrayList<Tb_teacher>();
	private List<Tb_newstaff> doctor =new ArrayList<Tb_newstaff>();
	private Tb_classStudent student = new Tb_classStudent();
	public List<Tb_teacher> getTeacher() {
		return teacher;
	}
	public void setTeacher(List<Tb_teacher> teacher) {
		this.teacher = teacher;
	}
	public List<Tb_newstaff> getDoctor() {
		return doctor;
	}
	public void setDoctor(List<Tb_newstaff> doctor) {
		this.doctor = doctor;
	}
	
	public Tb_classStudent getStudent() {
		return student;
	}
	public void setStudent(Tb_classStudent student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Tb_teacherAndStudent [teacher=" + teacher + ", doctor=" + doctor + ", student=" + student + "]";
	}
	
	
	
	
	
}
