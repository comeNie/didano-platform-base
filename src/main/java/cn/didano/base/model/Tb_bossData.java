package cn.didano.base.model;

import java.util.ArrayList;
import java.util.List;

public class Tb_bossData {

	
	private List<Tb_newstaff> staff =new ArrayList<Tb_newstaff>();
	private List<Tb_classStudent> studentall = new ArrayList<Tb_classStudent>();
	
	
	public List<Tb_newstaff> getStaff() {
		return staff;
	}
	public void setStaff(List<Tb_newstaff> staff) {
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
