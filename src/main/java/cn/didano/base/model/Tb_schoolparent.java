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
    
    private String rfid;
    
    
    public String getRfid() {
		return rfid;
	}

	public void setRfid(String rfid) {
		this.rfid = rfid;
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