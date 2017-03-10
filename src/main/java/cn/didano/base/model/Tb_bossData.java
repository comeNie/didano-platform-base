package cn.didano.base.model;

import java.util.ArrayList;
import java.util.List;

public class Tb_bossData {

	
	private List<Tb_staff> staff =new ArrayList<Tb_staff>();
	private List<Tb_classStudent> studentall = new ArrayList<Tb_classStudent>();
	
	
	public List<Tb_staff> getStaff() {
		return staff;
	}
	public void setStaff(List<Tb_staff> staff) {
		this.staff = staff;
	}
	
	public List<Tb_classStudent> getStudentall() {
		return studentall;
	}
	public void setStudentall(List<Tb_classStudent> studentall) {
		this.studentall = studentall;
	}
	@Override
	public String toString() {
		return "Tb_bossData [ staff=" + staff + ", studentall=" + studentall + "]";
	}
	
}
