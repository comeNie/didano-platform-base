package cn.didano.base.model;

import java.util.List;

public class Tb_studentByschool {

	private Integer classId;
	private List<Tb_mailList_list> list;
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public List<Tb_mailList_list> getList() {
		return list;
	}
	public void setList(List<Tb_mailList_list> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Tb_studentByschool [classId=" + classId + ", list=" + list + "]";
	}
	
}
