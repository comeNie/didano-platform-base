package cn.didano.video.json;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class In_Channel_Status_All {
	@ApiModelProperty(value = "状态 0/1  未启用/启用",required=true)
	private byte status;
	@ApiModelProperty(value = "教职工ID",required=true)
	private int staffId;//记录谁操作的
	
	public In_Channel_Status_All(){
		
	}

	public byte getStatus() {
		return status;
	}

	public void setStatus(byte status) {
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
		return "ChannelStatus4Client [status=" + status + ", staffId=" + staffId + "]";
	}
}