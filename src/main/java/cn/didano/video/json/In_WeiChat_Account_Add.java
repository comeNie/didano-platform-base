package cn.didano.video.json;

import io.swagger.annotations.ApiModelProperty;

public class In_WeiChat_Account_Add {

	@ApiModelProperty(value = "id",required=true)
	private int id;
	@ApiModelProperty(value = "公众号绑定方式",required=true)
	private byte accountType;
	@ApiModelProperty(value = "公众号名称",required=true)
	private String nickname;
	@ApiModelProperty(value = "appid",required=true)
	private String appid;
	@ApiModelProperty(value = "appSecret",required=true)
	private String appsecret;
	@ApiModelProperty(value = "机构id",required=true)
	private int orgId;
	
	
	public int getOrgId() {
		return orgId;
	}
	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public byte getAccountType() {
		return accountType;
	}
	public void setAccountType(byte accountType) {
		this.accountType = accountType;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getAppsecret() {
		return appsecret;
	}
	public void setAppsecret(String appsecret) {
		this.appsecret = appsecret;
	}
	
	
	
}
