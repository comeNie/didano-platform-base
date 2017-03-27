package cn.didano.base.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Tb_classStudentParent {
	 private Integer id;

	    private Integer SchoolId;
	    private Integer class_id;
	    private String title;
	    private String name;
	    private Date birthday;
		private Byte gender;
	    private Byte status;
		private List<Tb_parent4mailList> parent = new ArrayList<Tb_parent4mailList>();
	    private Boolean deleted;
	    //家长ic卡号
	    private String parent_ic_number;
	    private String student_ic_number;
	    
		public String getParent_ic_number() {
			return parent_ic_number;
		}
		public void setParent_ic_number(String parent_ic_number) {
			this.parent_ic_number = parent_ic_number;
		}
		public String getStudent_ic_number() {
			return student_ic_number;
		}
		public void setStudent_ic_number(String student_ic_number) {
			this.student_ic_number = student_ic_number;
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
		public Integer getClass_id() {
			return class_id;
		}
		public void setClass_id(Integer class_id) {
			this.class_id = class_id;
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
		public List<Tb_parent4mailList> getParent() {
			return parent;
		}
		public void setParent(List<Tb_parent4mailList> parent) {
			this.parent = parent;
		}
		public Boolean getDeleted() {
			return deleted;
		}
		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}
	    
}
