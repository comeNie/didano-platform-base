package cn.didano.base.json;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class In_Switch_Edit4Video {

	@ApiModelProperty(value = "授权付费ID,对应于列表里面的ID",required=true)
	private Integer id;
	@ApiModelProperty(value = "是否有效，0/1 禁用/有效",required=true)
	private Boolean isUse;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getIsUse() {
		return isUse;
	}

	public void setIsUse(Boolean isUse) {
		this.isUse = isUse;
	}

	@Override
	public String toString() {
		return "In_Switch_Edit4Video [id=" + id + ", isUse=" + isUse + "]";
	}

}
