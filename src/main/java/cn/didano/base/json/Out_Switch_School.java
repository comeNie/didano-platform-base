package cn.didano.base.json;

import java.util.ArrayList;
import java.util.List;

import cn.didano.base.model.Vd_auth_switch;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 返回json信息
 * 
 * @author stephen Created on 2016年12月26日 上午10:57:00
 */
@ApiModel
public class Out_Switch_School {
	@ApiModelProperty(value = "学校ID")
	private Integer id;
	@ApiModelProperty(value = "学校名称")
	private String title;
	@ApiModelProperty(value = "学校班级数目")
	private int num;
	@ApiModelProperty(value = "学校班级集合")
	private List<Out_Switch_Class<Vd_auth_switch>> list = new ArrayList<Out_Switch_Class<Vd_auth_switch>>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public List<Out_Switch_Class<Vd_auth_switch>> getList() {
		return list;
	}

	public void setList(List<Out_Switch_Class<Vd_auth_switch>> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Out_Switch_School [id=" + id + ", title=" + title + ", num=" + num + ", list=" + list + "]";
	}
}
