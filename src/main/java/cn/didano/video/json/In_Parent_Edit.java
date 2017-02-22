package cn.didano.video.json;

import io.swagger.annotations.ApiModelProperty;

public class In_Parent_Edit {

	@ApiModelProperty(value = "小朋友id",required=true)
	private Integer id;
	@ApiModelProperty(value = "父母名字",required=true)
	private String parent_name;
	@ApiModelProperty(value = "电话",required=true)
	private String parent_phone;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getParent_name() {
		return parent_name;
	}
	public void setParent_name(String parent_name) {
		this.parent_name = parent_name;
	}
	public String getParent_phone() {
		return parent_phone;
	}
	public void setParent_phone(String parent_phone) {
		this.parent_phone = parent_phone;
	}
	
	
}
