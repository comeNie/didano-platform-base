package cn.didano.video.constant;

/**
 * 权限类型，暂时只有一种
 * 
 * @author stephen Created on 2016年12月20日 下午1:14:35
 */
public enum AuthType {
	VIDEO("视频", (byte)1);// 视频，

	private String name;
	private byte index;

	private AuthType(String name, byte index) {
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
