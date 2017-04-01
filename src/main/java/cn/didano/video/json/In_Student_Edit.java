package cn.didano.video.json;

import java.util.Date;
import java.util.List;

import cn.didano.base.model.Hand_parent4mailList;
import io.swagger.annotations.ApiModelProperty;

public class In_Student_Edit {

	@ApiModelProperty(value = "id",required=true)
	private Integer id ;
	@ApiModelProperty(value = "姓名",required=true)
	private String name;
	@ApiModelProperty(value = "班级",required=true)
	private Integer class_id;

	@ApiModelProperty(value = "性别",required=true)
	private Byte gender;
	@ApiModelProperty(value = "生日",required=true)
	private Date birthday;
	@ApiModelProperty(value = "删除了的家长id",required=true)
	private String deleteParents;
	@ApiModelProperty(value = "学生的ic卡编号",required=true)
	private String student_ic_number;
	@ApiModelProperty(value = "学生的ic卡id",required=true)
	private Integer icCardId;
	@ApiModelProperty(value = "家长信息",required=true)
	private List<Hand_parent4mailList> parent;
	
	public Integer getIcCardId() {
		return icCardId;
	}
	public void setIcCardId(Integer icCardId) {
		this.icCardId = icCardId;
	}
	public String getStudent_ic_number() {
		return student_ic_number;
	}
	public void setStudent_ic_number(String student_ic_number) {
		this.student_ic_number = student_ic_number;
	}
	
	public String getDeleteParents() {
		return deleteParents;
	}
	public void setDeleteParents(String deleteParents) {
		this.deleteParents = deleteParents;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getClass_id() {
		return class_id;
	}
	public void setClass_id(Integer class_id) {
		this.class_id = class_id;
	}
	public Byte getGender() {
		return gender;
	}
	public void setGender(Byte gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public List<Hand_parent4mailList> getParent() {
		return parent;
	}
	public void setParent(List<Hand_parent4mailList> parent) {
		this.parent = parent;
	}
	

	
}
