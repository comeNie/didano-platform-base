package cn.didano.base.model;

public class Tb_parent {

	private Integer id;
	private String parent_name;
	private String parent_phone;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getParent_name() {
		return parent_name;
	}
	public void setParent_name(String parent_name) {
		this.parent_name = parent_name;
	}
	public String getParent_phone() {
		return parent_phone;
	}
	public void setParent_phone(String parent_phone) {
		this.parent_phone = parent_phone;
	}
	@Override
	public String toString() {
		return "Tb_parent [parent_name=" + parent_name + ", parent_phone=" + parent_phone + "]";
	}
	
	
}
