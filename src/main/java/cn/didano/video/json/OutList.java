package cn.didano.video.json;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 返回json信息
 * 
 * @author stephen Created on 2016年12月26日 上午10:57:00
 */
@ApiModel
public class OutList<T> {
	@ApiModelProperty(value = "集合数量")
	private int num;
	@ApiModelProperty(value = "集合")
	private List<T> list;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public OutList(int num, List<T> list) {
		super();
		this.num = num;
		this.list = list;
	}

	@Override
	public String toString() {
		return "OutList [num=" + num + ", list=" + list + "]";
	}
}
