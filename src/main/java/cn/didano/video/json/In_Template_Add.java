package cn.didano.video.json;

import io.swagger.annotations.ApiModelProperty;

public class In_Template_Add {

	@ApiModelProperty(value = "id",required=true)
	private int id;
	@ApiModelProperty(value = "微信公众号基本信息表id",required=true)
	private int official_account_id;
	@ApiModelProperty(value = "微信44位模板id",required=true)
	private String tmplate_wx_id;
	@ApiModelProperty(value = "种类",required=true)
	private int type;
	@ApiModelProperty(value = "名称",required=true)
	private String title;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOfficial_account_id() {
		return official_account_id;
	}
	public void setOfficial_account_id(int official_account_id) {
		this.official_account_id = official_account_id;
	}
	public String getTmplate_wx_id() {
		return tmplate_wx_id;
	}
	public void setTmplate_wx_id(String tmplate_wx_id) {
		this.tmplate_wx_id = tmplate_wx_id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	
	
	
	
}
