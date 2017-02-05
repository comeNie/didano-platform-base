package cn.didano.video.json;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author stephen
 * Created on 2016年12月20日 下午12:52:27 
 */
@ApiModel
public class In_Switch_Search {
	@ApiModelProperty(value = "付费授权查询条件，学生名称")
	private String owner_name;

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	@Override
	public String toString() {
		return "In_Switch_Search [owner_name=" + owner_name + "]";
	}
}
