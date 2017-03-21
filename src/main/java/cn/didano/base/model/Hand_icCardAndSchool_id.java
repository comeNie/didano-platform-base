package cn.didano.base.model;

/**
 * @author Administrator
 *Rewrite Date：<修改日期:2017-03-09>
 *Log ID：<1>
 *Depiction：<为借口传递数据>
 *Writer：杨朝强
 */
public class Hand_icCardAndSchool_id {
	private String icNumberNoe;
	private String icNumberTow;
	private int school_id;
	public String getIcNumberNoe() {
		return icNumberNoe;
	}
	public void setIcNumberNoe(String icNumberNoe) {
		this.icNumberNoe = icNumberNoe;
	}
	public String getIcNumberTow() {
		return icNumberTow;
	}
	public void setIcNumberTow(String icNumberTow) {
		this.icNumberTow = icNumberTow;
	}
	public int getSchool_id() {
		return school_id;
	}
	public void setSchool_id(int school_id) {
		this.school_id = school_id;
	}
	public Hand_icCardAndSchool_id(String icNumberNoe, String icNumberTow, int school_id) {
		super();
		this.icNumberNoe = icNumberNoe;
		this.icNumberTow = icNumberTow;
		this.school_id = school_id;
	}
	public Hand_icCardAndSchool_id() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
