package cn.didano.video.json;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 返回json信息
 * 
 * @author stephen Created on 2016年12月26日 上午10:57:00
 */
@ApiModel
public class Out_Switch_Class<Vd_auth_switch> {
	@ApiModelProperty(value = "班级ID")
	private Integer id;
	@ApiModelProperty(value = "班级名称")
	private String title;
	@ApiModelProperty(value = "班级学生授权数目")
	private int num;
	@ApiModelProperty(value = "班级学生授权集合")
	private List<Vd_auth_switch> list = new ArrayList<Vd_auth_switch>();

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

	public List<Vd_auth_switch> getList() {
		return list;
	}

	public void setList(List<Vd_auth_switch> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Out_Switch_Class [id=" + id + ", title=" + title + ", num=" + num + ", list=" + list + "]";
	}
	
}
