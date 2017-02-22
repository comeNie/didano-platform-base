package cn.didano.video.json;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class In_Student_Serach {
	@ApiModelProperty(value = "id",required=false)
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
		
	}

	@Override
	public String toString() {
		return "In_Student_Serach [id=" + id + "]";
	}
    
}
