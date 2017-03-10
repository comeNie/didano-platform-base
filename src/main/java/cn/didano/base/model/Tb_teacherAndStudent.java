package cn.didano.base.model;

import java.util.ArrayList;
import java.util.List;

public class Tb_teacherAndStudent {
	
	private List<Tb_staff> doctor =new ArrayList<Tb_staff>();
	private Tb_classStudent studentall = new Tb_classStudent();
	
	public List<Tb_staff> getDoctor() {
		return doctor;
	}
	public void setDoctor(List<Tb_staff> doctor) {
		this.doctor = doctor;
	}
	public Tb_classStudent getStudentall() {
		return studentall;
	}
	public void setStudentall(Tb_classStudent studentall) {
		this.studentall = studentall;
	}
	@Override
	public String toString() {
		return "Tb_teacherAndStudent [  doctor=" + doctor + ", studentall=" + studentall + "]";
	}

	
	
	
	
	
	
	
	
}
