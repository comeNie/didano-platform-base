package cn.didano.base.model;

/**
 * @author Administrator
 *Rewrite Date：<修改日期:2017-03-09>
 *Log ID：<1>
 *Depiction：<为借口传递数据>
 *Writer：杨朝强
 */
public class Hand_student {
	private String name;
	private String time;
	private Integer height;
	private int weight;
	private int numHeight;
	private int numWeight;
	private String percentageHeight;
	private String percentageWeight;
	private Double height1;
	private Double height2;
	private Double weight1;
	private Double weight2;
	private String compareHeight;
	private String compareWeight;
	private String string3;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getNumHeight() {
		return numHeight;
	}
	public void setNumHeight(int numHeight) {
		this.numHeight = numHeight;
	}
	public int getNumWeight() {
		return numWeight;
	}
	public void setNumWeight(int numWeight) {
		this.numWeight = numWeight;
	}
	public String getPercentageHeight() {
		return percentageHeight;
	}
	public void setPercentageHeight(String percentageHeight) {
		this.percentageHeight = percentageHeight;
	}
	public String getPercentageWeight() {
		return percentageWeight;
	}
	public void setPercentageWeight(String percentageWeight) {
		this.percentageWeight = percentageWeight;
	}
	public Double getHeight1() {
		return height1;
	}
	public void setHeight1(Double height1) {
		this.height1 = height1;
	}
	public Double getHeight2() {
		return height2;
	}
	public void setHeight2(Double height2) {
		this.height2 = height2;
	}
	public Double getWeight1() {
		return weight1;
	}
	public void setWeight1(Double weight1) {
		this.weight1 = weight1;
	}
	public Double getWeight2() {
		return weight2;
	}
	public void setWeight2(Double weight2) {
		this.weight2 = weight2;
	}
	public String getCompareHeight() {
		return compareHeight;
	}
	public void setCompareHeight(String compareHeight) {
		this.compareHeight = compareHeight;
	}
	public String getCompareWeight() {
		return compareWeight;
	}
	public void setCompareWeight(String compareWeight) {
		this.compareWeight = compareWeight;
	}
	public String getString3() {
		return string3;
	}
	public void setString3(String string3) {
		this.string3 = string3;
	}
	public Hand_student(String name, String time, Integer height, int weight, int numHeight, int numWeight,
			String percentageHeight, String percentageWeight, Double height1, Double height2, Double weight1,
			Double weight2, String compareHeight, String compareWeight, String string3) {
		super();
		this.name = name;
		this.time = time;
		this.height = height;
		this.weight = weight;
		this.numHeight = numHeight;
		this.numWeight = numWeight;
		this.percentageHeight = percentageHeight;
		this.percentageWeight = percentageWeight;
		this.height1 = height1;
		this.height2 = height2;
		this.weight1 = weight1;
		this.weight2 = weight2;
		this.compareHeight = compareHeight;
		this.compareWeight = compareWeight;
		this.string3 = string3;
	}
	public Hand_student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
