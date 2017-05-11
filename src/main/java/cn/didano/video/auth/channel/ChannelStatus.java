package cn.didano.video.auth.channel;

public class ChannelStatus {
	//频道ID
	private int channelId;
	//频道开关状态
	private int status;
	//是否处于播放状态,注意，该值通过fasterxml转化为json,是open，而不是isOpen
	private boolean isOpen; 
	
	public ChannelStatus(){
		
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public void setStatus(int status) {
		this.status = status;
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

	
	public ChannelStatus(int channelId, int status) {
		super();
		this.channelId = channelId;
		this.status = status;
	}

	@Override
	public String toString() {
		return "{\"channelId\":\"" + channelId + "\",\"status\":\"" + status + "\",\"isOpen\":\"" + isOpen + "\"}  ";
	}
	

}