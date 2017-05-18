package cn.didano.base.json;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class In_Switch_Add4Video {
	@ApiModelProperty(value = "是否有效，0/1 禁用/有效",required=true)
	private Boolean isUse;
	@ApiModelProperty(value = "付费授权用户ID，包括学生、教职工",required=true)
	private Integer ownerId;
	@ApiModelProperty(value = "付费授权用户类型，1/2 学生(家长从属于学生，按学生收费)/教职工",required=true)
	private Byte ownerType;

	public Boolean getIsUse() {
		return isUse;
	}

	public void setIsUse(Boolean isUse) {
		this.isUse = isUse;
	}

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}

	public Byte getOwnerType() {
		return ownerType;
	}

	public void setOwnerType(Byte ownerType) {
		this.ownerType = ownerType;
	}

	@Override
	public String toString() {
		return "In_Switch_Add4Video [isUse=" + isUse + ", ownerId=" + ownerId + ", ownerType=" + ownerType + "]";
	}

}
