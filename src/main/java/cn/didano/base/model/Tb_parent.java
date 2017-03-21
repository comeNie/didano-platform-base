package cn.didano.base.model;

public class Tb_parent {

	
    private Integer id;
	private byte relation_id;
	private String parent_name;
	private String parent_phone;
	private String rfid;
	
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;

	public String getRfid() {
		return rfid;
	}
	public void setRfid(String rfid) {
		this.rfid = rfid;

	}
	public String getParent_name() {
		return parent_name;
	}
	public void setParent_name(String parent_name) {
		this.parent_name = parent_name;
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
