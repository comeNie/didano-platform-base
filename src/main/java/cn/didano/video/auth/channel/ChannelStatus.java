package cn.didano.video.auth.channel;

public class ChannelStatus {

	private int channelId;
	private int status;
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
		return "ChannelStatus [channelId=" + channelId + ", status=" + status + "]";
	}

}