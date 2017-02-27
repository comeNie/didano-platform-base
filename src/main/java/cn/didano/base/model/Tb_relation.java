package cn.didano.base.model;

public class Tb_relation {

	private Integer id;
	private String title;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Tb_relation [id=" + id + ", title=" + title + "]";
	}
	
}
