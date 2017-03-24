package cn.didano.base.model;

import java.util.Date;

public class Tb_studentparent {
    private Integer id;

    private Integer schoolId;

    private Integer classId;

    private Integer studentId;

    private Integer parentId;

    private String parent_ic_number;

    private Byte relationId;

    private String relationTitle;

    private String qrcodeUrl;

    private String qrcodeSchoolKey;

    private Date created;
    
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

	public Byte getRelationId() {
		return relationId;
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

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public void setRelationId(Byte relationId) {
        this.relationId = relationId;
    }

    public String getRelationTitle() {
        return relationTitle;
    }

    public void setRelationTitle(String relationTitle) {
        this.relationTitle = relationTitle == null ? null : relationTitle.trim();
    }

    public String getQrcodeUrl() {
        return qrcodeUrl;
    }

    public void setQrcodeUrl(String qrcodeUrl) {
        this.qrcodeUrl = qrcodeUrl == null ? null : qrcodeUrl.trim();
    }

    public String getQrcodeSchoolKey() {
        return qrcodeSchoolKey;
    }

    public void setQrcodeSchoolKey(String qrcodeSchoolKey) {
        this.qrcodeSchoolKey = qrcodeSchoolKey == null ? null : qrcodeSchoolKey.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}