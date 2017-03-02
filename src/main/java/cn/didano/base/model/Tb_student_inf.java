package cn.didano.base.model;


public class Tb_student_inf {

	private Double height;
    private Integer weight;
    private String orgImgUrl;
    private String created;
    
	public Tb_student_inf() {
	
	}

	public Tb_student_inf(Double height, Integer weight, String orgImgUrl, String created) {
		super();
		this.height = height;
		this.weight = weight;
		this.orgImgUrl = orgImgUrl;
		this.created = created;
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
	public String getOrgImgUrl() {
		return orgImgUrl;
	}
	public void setOrgImgUrl(String orgImgUrl) {
		this.orgImgUrl = orgImgUrl;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	@Override
	public String toString() {
		return "Tb_student_inf [height=" + height + ", weight=" + weight + ", orgImgUrl=" + orgImgUrl + ", created="
				+ created + "]";
	}
    

}
