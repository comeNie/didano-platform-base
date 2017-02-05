package cn.didano.video.json;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class In_Channel_Status {
	@ApiModelProperty(value = "频道ID",required=true)
	private int channelId;
	@ApiModelProperty(value = "状态 0/1  未启用/启用",required=true)
	private int status;
	@ApiModelProperty(value = "教职工ID",required=true)
	private int staffId;//记录谁操作的
	
	public In_Channel_Status(){
		
	}

	public int getChannelId() {
		return channelId;
	}

	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	
	public In_Channel_Status(int channelId, int status) {
		super();
		this.channelId = channelId;
		this.status = status;
	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	@Override
	public String toString() {
		return "ChannelStatus4Client [channelId=" + channelId + ", status=" + status + ", staffId=" + staffId + "]";
	}
}