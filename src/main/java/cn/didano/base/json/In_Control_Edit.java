package cn.didano.base.json;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 编辑时间控制
 * @author stephen
 * Created on 2016年12月20日 下午12:52:27 
 */
@ApiModel
public class In_Control_Edit {
	@ApiModelProperty(value = "控制ID",required=true)
    private Integer Id;
	@ApiModelProperty(value = "频道ID",required=true)
    private Integer channelId;
	@ApiModelProperty(value = "开始时间",required=true)
    private String start;
	@ApiModelProperty(value = "结束时间",required=true)
    private String end;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Integer getChannelId() {
		return channelId;
	}
	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	@Override
	public String toString() {
		return "In_Control_Edit [Id=" + Id + ", channelId=" + channelId + ", start=" + start + ", end=" + end + "]";
	}
	
	
}
