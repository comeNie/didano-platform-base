package cn.didano.base.constant;

/**
 * IC卡类型 1/2 (家长或教职工)/宝宝卡 成人卡/宝宝卡
 * 
 * @author stephen.wang 2017年3月22日
 */
public enum IcCardType {
	// IC卡类型 1/2 (家长或教职工)/宝宝卡 成人卡/宝宝卡
	ADULT("成人卡", (byte) 1), BABY("宝宝卡", (byte) 2);

	private String name;
	private byte index;

	private IcCardType(String name, byte index) {
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
