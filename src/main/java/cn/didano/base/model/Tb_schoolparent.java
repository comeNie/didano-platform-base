package cn.didano.base.model;

import java.util.Date;

public class Tb_schoolparent {
    private Integer id;

    private Integer schoolId;

    private String name;

    private String phone;

    private Integer type;

    private Byte status;
    private Date created;
    
  //private String rfid;
    
    // private String student_rfid;
     private String parent_id_number;
     private String student_id_number;
 	public String getParent_id_number() {
 		return parent_id_number;
 	}

 	public void setParent_id_number(String parent_id_number) {
 		this.parent_id_number = parent_id_number;
 	}

 	public String getStudent_id_number() {
 		return student_id_number;
 	}

 	public void setStudent_id_number(String student_id_number) {
 		this.student_id_number = student_id_number;
 	}
    
   
	@Override
	public String toString() {
		return "Tb_schoolparent [id=" + id + ", schoolId=" + schoolId + ", name=" + name + ", phone=" + phone
				+ ", type=" + type + ", status=" + status + ", created=" + created + "]";
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}