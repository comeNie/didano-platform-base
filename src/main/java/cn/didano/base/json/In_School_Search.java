package cn.didano.base.json;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 新建
 * 比Vd_channel小
 * @author stephen
 * Created on 2016年12月20日 下午12:52:27 
 */
@ApiModel
public class In_School_Search {
	@ApiModelProperty(value = "学校名称",required=true)
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "In_School_Search [title=" + title + "]";
	}
}
