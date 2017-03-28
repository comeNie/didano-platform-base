package cn.didano.base.model;

/**
 * @author Administrator
 *Rewrite Date：<修改日期:2017-03-09>
 *Log ID：<1>
 *Depiction：<为借口传递数据>
 *Writer：杨朝强
 */
public class Hand_ic_card {
	public Hand_ic_card() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String ic_numberOne;
	
	public String ic_numberTow;
	
	public int school_id;
	
	public int getSchool_id() {
		return school_id;
	}

	public void setSchool_id(int school_id) {
		this.school_id = school_id;
	}

	public String getIc_numberOne() {
		return ic_numberOne;
	}

	public void setIc_numberOne(String ic_numberOne) {
		this.ic_numberOne = ic_numberOne;
	}

	public String getIc_numberTow() {
		return ic_numberTow;
	}

	public void setIc_numberTow(String ic_numberTow) {
		this.ic_numberTow = ic_numberTow;
	}

	public Hand_ic_card(String ic_numberOne, String ic_numberTow) {
		super();
		this.ic_numberOne = ic_numberOne;
		this.ic_numberTow = ic_numberTow;
	}
	
}
