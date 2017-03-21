package cn.didano.video.json;

import java.util.Date;
import java.util.List;

import cn.didano.base.model.Tb_parent;
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
	@ApiModelProperty(value = "家长信息",required=true)
	private List<Tb_parent> parent;
	@ApiModelProperty(value = "删除了的家长id",required=true)
	private String deleteParents;
	
	private String rfid;
	
	private String student_rfid;
	
	public String getRfid() {
		return rfid;
	}
	public void setRfid(String rfid) {
		this.rfid = rfid;
	}
	public String getStudent_rfid() {
		return student_rfid;
	}
	public void setStudent_rfid(String student_rfid) {
		this.student_rfid = student_rfid;
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
	public List<Tb_parent> getParent() {
		return parent;
	}
	public void setParent(List<Tb_parent> parent) {
		this.parent = parent;
	}
	

	
}
