package cn.didano.base.model;

import java.util.Date;

public class Wx_official_account_info {
    private Long id;

    private Long officialaccountid;

    private Byte accounttype;

    private Byte servicetypeinfo;

    private Byte verifytypeinfo;

    private String nickname;

    private String username;

    private String appsecret;

    private String token;

    private String encodingaeskey;

    private String messageurl;

    private Date created;

    private Date updated;

    private Boolean deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOfficialaccountid() {
        return officialaccountid;
    }

    public void setOfficialaccountid(Long officialaccountid) {
        this.officialaccountid = officialaccountid;
    }

    public Byte getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(Byte accounttype) {
        this.accounttype = accounttype;
    }

    public Byte getServicetypeinfo() {
        return servicetypeinfo;
    }

    public void setServicetypeinfo(Byte servicetypeinfo) {
        this.servicetypeinfo = servicetypeinfo;
    }

    public Byte getVerifytypeinfo() {
        return verifytypeinfo;
    }

    public void setVerifytypeinfo(Byte verifytypeinfo) {
        this.verifytypeinfo = verifytypeinfo;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getAppsecret() {
        return appsecret;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret == null ? null : appsecret.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getEncodingaeskey() {
        return encodingaeskey;
    }

    public void setEncodingaeskey(String encodingaeskey) {
        this.encodingaeskey = encodingaeskey == null ? null : encodingaeskey.trim();
    }

    public String getMessageurl() {
        return messageurl;
    }

    public void setMessageurl(String messageurl) {
        this.messageurl = messageurl == null ? null : messageurl.trim();
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