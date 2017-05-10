package cn.didano.video.constant;

/**
 * 权限类型，暂时只有一种
 * 
 * @author stephen Created on 2016年12月20日 下午1:14:35
 */
public enum SocketActionType {
	OPEN("开启socket通道", (byte)1),// 开启socket通道，
	CLOSE_NORMAL("正常关闭socket通", (byte)2),// 正常关闭socket通
	CLOSE_ERROR("异常关闭socket通道", (byte)3);// 异常关闭socket通道

	private String name;
	private byte index;

	private SocketActionType(String name, byte index) {
		this.name = name;
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getIndex() {
		return index;
	}

	public void setIndex(byte index) {
		this.index = index;
	}
}
