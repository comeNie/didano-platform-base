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
	    private String parent_ic;
	    private String student_rfid;
	    
		public String getStudent_rfid() {
			return student_rfid;
		}
		public void setStudent_rfid(String student_rfid) {
			this.student_rfid = student_rfid;
		}
		public String getParent_ic() {
			return parent_ic;
		}
		public void setParent_ic(String parent_ic) {
			this.parent_ic = parent_ic;
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
