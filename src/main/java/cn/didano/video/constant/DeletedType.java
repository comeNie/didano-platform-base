package cn.didano.video.constant;

/**
 * 权限类型，暂时只有一种
 * 
 * @author stephen Created on 2016年12月20日 下午1:14:35
 */
public enum DeletedType {
	N0_DELETED("使用", false),
	IS_DELETED("删除", true);

	private String name;
	private boolean value;

	private DeletedType(String name, boolean value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getValue() {
		return value;
	}

	public void setValue(boolean value) {
		this.value = value;
	}
}
