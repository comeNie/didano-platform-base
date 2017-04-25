package cn.didano.base.model;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 过度组装需要 单个学生信息，不包含家长信息
 * 
 * @author stephen.wang 2017年3月31日
 */
public class Hand_wholeStudent4PhoneBook {
	private Integer id;
	private Integer SchoolId;
	private Integer classId;
	private String title;
	private String name;
	private Date birthday;
	private Byte gender;
	private Byte status;
	private Boolean deleted;
	private String student_ic_number;
	private Integer StudentIcCardId;
	private Integer is_use;
	private List<Hand_parent4mailList> parent = new ArrayList<Hand_parent4mailList>();

	public Integer getIs_use() {
		return is_use;
	}

	public void setIs_use(Integer is_use) {
		this.is_use = is_use;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSchoolId() {
		return SchoolId;
	}

	public void setSchoolId(Integer schoolId) {
		SchoolId = schoolId;
	}

	public Integer getClassId() {
		return classId;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Byte getGender() {
		return gender;
	}

	public void setGender(Byte gender) {
		this.gender = gender;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public String getStudent_ic_number() {
		return student_ic_number;
	}

	public void setStudent_ic_number(String student_ic_number) {
		this.student_ic_number = student_ic_number;
	}

	public Integer getStudentIcCardId() {
		return StudentIcCardId;
	}

	public void setStudentIcCardId(Integer studentIcCardId) {
		StudentIcCardId = studentIcCardId;
	}

	public List<Hand_parent4mailList> getParent() {
		return parent;
	}

	public void setParent(List<Hand_parent4mailList> parent) {
		this.parent = parent;
	}

}
