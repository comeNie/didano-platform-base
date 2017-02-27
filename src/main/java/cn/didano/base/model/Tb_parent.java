package cn.didano.base.model;

public class Tb_parent {

	private Integer childid;

	private byte relation_id;
	private String parent_name;
	private String parent_phone;
	
	
	public String getParent_name() {
		return parent_name;
	}
	public void setParent_name(String parent_name) {
		this.parent_name = parent_name;
	}
	public Integer getChildid() {
		return childid;
	}
	public void setChildid(Integer childid) {
		this.childid = childid;
	}
	public byte getRelation_id() {
		return relation_id;
	}
	public void setRelation_id(byte relation_id) {
		this.relation_id = relation_id;
	}
	public String getParent_phone() {
		return parent_phone;
	}
	public void setParent_phone(String parent_phone) {
		this.parent_phone = parent_phone;
	}
	
	
}
