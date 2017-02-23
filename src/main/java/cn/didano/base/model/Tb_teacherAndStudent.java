package cn.didano.base.model;

import java.util.ArrayList;
import java.util.List;

public class Tb_teacherAndStudent {
	private List<Tb_teacher> teacher  = new ArrayList<Tb_teacher>();
	private List<Tb_newstaff> doctor =new ArrayList<Tb_newstaff>();
	private Tb_classStudent studentall = new Tb_classStudent();
	@Override
	public String toString() {
		return "Tb_teacherAndStudent [teacher=" + teacher + ", doctor=" + doctor + ", studentall=" + studentall + "]";
	}
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
	public Tb_classStudent getStudentall() {
		return studentall;
	}
	public void setStudentall(Tb_classStudent studentall) {
		this.studentall = studentall;
	}
	
	
	
	
	
	
	
}
