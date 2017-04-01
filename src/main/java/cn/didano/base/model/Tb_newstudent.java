package cn.didano.base.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tb_newstudent {
    private Integer id;

    private Integer schoolId;

    private Integer class_id;

    private String name;

    private String nickname;

    private String hobby;

    private Integer dreamId;

    private String comment;

    private Byte gender;

    private Date birthday;

    private Byte deviceRegistered;

    private Byte status;

    private Date created;

    private Date updated;

    private Boolean deleted;
    
    private String student_ic_number;
    
    private int icCardId;

	private List<Hand_parent4mailList> parent = new ArrayList<Hand_parent4mailList>();
   
	public int getIcCardId() {
		return icCardId;
	}

	public void setIcCardId(int icCardId) {
		this.icCardId = icCardId;
	}

	public List<Hand_parent4mailList> getParent() {
		return parent;
	}

	public void setParent(List<Hand_parent4mailList> parent) {
		this.parent = parent;
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
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
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
        this.name = name == null ? null : name.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    public Integer getDreamId() {
        return dreamId;
    }

    public void setDreamId(Integer dreamId) {
        this.dreamId = dreamId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Byte getDeviceRegistered() {
        return deviceRegistered;
    }

    public void setDeviceRegistered(Byte deviceRegistered) {
        this.deviceRegistered = deviceRegistered;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}