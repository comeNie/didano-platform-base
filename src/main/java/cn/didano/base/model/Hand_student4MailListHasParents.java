package cn.didano.base.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hand_student4MailListHasParents extends Tb_student {

	private String student_ic_number;

	private List<Hand_parent4mailList> parent = new ArrayList<Hand_parent4mailList>();

	public String getStudent_ic_number() {
		return student_ic_number;
	}

	public void setStudent_ic_number(String student_ic_number) {
		this.student_ic_number = student_ic_number;
	}

	public List<Hand_parent4mailList> getParent() {
		return parent;
	}

	public void setParent(List<Hand_parent4mailList> parent) {
		this.parent = parent;
	}

}