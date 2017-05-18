package cn.didano.base.constant;

/**
 * 人类型
 * 
 * @author stephen Created on 2016年12月20日 下午1:16:00
 */
public enum OwnerType {
	STUDENT("学生", (byte)1), 
	PARENT("家长", (byte)2), 
	STAFF("教职工", (byte)3);// 学生，家长,教职工
	
	private String name;
	private byte index;

	private OwnerType(String name, byte index) {
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
