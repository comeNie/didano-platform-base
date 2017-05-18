package cn.didano.base.constant;

/**
 * 教职工类型
 * 职工类型：31-园长、32-老师、33-保健医生、34-后勤人员
 * @author stephen Created on 2016年12月20日 下午1:16:00
 */
public enum StaffType {
	SCHOOLMASTER("园长", (byte)31), 
	TEACHEER("老师", (byte)32), 
	DOCTOR("保健医生", (byte)33),
	SUPPORT("后勤人员", (byte)34);
	
	
	private String name;
	private byte index;

	private StaffType(String name, byte index) {
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
