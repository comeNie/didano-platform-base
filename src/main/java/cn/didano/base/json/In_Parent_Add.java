package cn.didano.base.json;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class In_Parent_Add {
	@ApiModelProperty(value = "小朋友id",required=true)
	private Integer childId;
 
	@ApiModelProperty(value="班级id",required=true)
	private Integer classId;
	@ApiModelProperty(value="学校id",required=true)
	private Integer schoolId;
	@ApiModelProperty(value = "姓名",required=true)
    private String name;

	@ApiModelProperty(value = "电话",required=true)
    private String phone;
	@ApiModelProperty(value = "类型",required=true)
	private Integer type;
	public Integer getChildId() {
		return childId;
	}
	public void setChildId(Integer childId) {
		this.childId = childId;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	

	
}
