package cn.didano.base.model;

import java.sql.Date;

public class Tb_class {
    private Integer id;

    private Integer SchoolId;
    private Integer class_id;
    private String title;
    private String name;
    private Date birthday;
	private Byte gender;
    private Byte status;
	private byte relation_id;
	private Integer parent_id;
	private String parent_name;
	private String parent_phone;
    private Boolean deleted;
    private String rfid;
    private String student_rfid;
    


    
    public String getStudent_rfid() {
		return student_rfid;
	}

	public void setStudent_rfid(String student_rfid) {
		this.student_rfid = student_rfid;
	}

	public Integer getParent_id() {
		return parent_id;
	}

	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}
	public String getRfid() {
		return rfid;
	}

	public void setRfid(String rfid) {
		this.rfid = rfid;

	}

	public byte getRelation_id() {
		return relation_id;
	}

	public void setRelation_id(byte relation_id) {
		this.relation_id = relation_id;
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

	public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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
}