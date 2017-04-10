package cn.didano.base.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 输出组装数据 教职工对象 扩展签到时间和签退时间翻译
 * 
 * @author guitar
 *
 */
public class Hand_staff4PhoneBook extends Tb_staff {
	private Date in_time;
	private Date out_time;
	private Integer classId;
	private String title;
	private String staff_ic_number;

	public Integer getClassId() {
		return classId;
	}

	@JsonFormat(pattern = "HH:mm")
	public Date getIn_time() {
		return in_time;
	}

	public void setIn_time(Date in_time) {
		this.in_time = in_time;
	}

	@JsonFormat(pattern = "HH:mm")
	public Date getOut_time() {
		return out_time;
	}

	public void setOut_time(Date out_time) {
		this.out_time = out_time;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStaff_ic_number() {
		return staff_ic_number;
	}

	public void setStaff_ic_number(String staff_ic_number) {
		this.staff_ic_number = staff_ic_number;
	}

}