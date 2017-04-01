package cn.didano.base.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 通讯录对象，校长用
 * @author stephen.wang  2017年3月31日 
 */
public class Hand_student4MailListHasParent extends Hand_student4MailList {

	private List<Hand_parent4mailList> parent = new ArrayList<Hand_parent4mailList>();

	public List<Hand_parent4mailList> getParent() {
		return parent;
	}

	public void setParent(List<Hand_parent4mailList> parent) {
		this.parent = parent;
	}

}
