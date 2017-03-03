package cn.didano.base.model;

public class Hand_student_detection {
    private Integer height;

    private Integer weight;

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Hand_student_detection(Integer height, Integer weight) {
		super();
		this.height = height;
		this.weight = weight;
	}

	public Hand_student_detection() {
		super();
		// TODO Auto-generated constructor stub
	}

}