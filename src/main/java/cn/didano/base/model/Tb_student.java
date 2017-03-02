package cn.didano.base.model;

import java.util.Date;

public class Tb_student {
    private Integer id;

    private Integer studentId;

    private Double height;

    private Integer weight;

    private Float temperature;

    private String orgImgUrl;

    private Date created;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

   

    public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public String getOrgImgUrl() {
        return orgImgUrl;
    }

    public void setOrgImgUrl(String orgImgUrl) {
        this.orgImgUrl = orgImgUrl == null ? null : orgImgUrl.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}