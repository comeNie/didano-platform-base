package cn.didano.video.json;

import java.util.Date;
import java.util.List;

import cn.didano.base.model.Tb_parentadd;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class In_Student_Add {

	@ApiModelProperty(value = "姓名",required=true)
	private String name;
	@ApiModelProperty(value = "班级",required=true)
	private Integer classId;
	@ApiModelProperty(value = "学校",required=true)
	 private Integer schoolId;
	@ApiModelProperty(value = "性别",required=true)
	private Byte gender;
	@ApiModelProperty(value = "生日",required=true)
	private Date birthday;
	@ApiModelProperty(value = "家长名字",required=true)
    private List<Tb_parentadd> parent;
	
	
	public List<Tb_parentadd> getParent() {
		return parent;
	}
	public void setParent(List<Tb_parentadd> parent) {
		this.parent = parent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public Integer getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
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
	@Override
	public String toString() {
		return "In_Student_Add [name=" + name + ", classId=" + classId + ", schoolId=" + schoolId + ", gender=" + gender
				+ ", birthday=" + birthday + ", parent=" + parent + "]";
	}
	
	
	
}
