package cn.didano.base.model;

public class View_staff_channel {
    private Integer staffId;

    private String studentName;

    private String name;

    private Byte status;

    private String ossPlayUrl;

    private Integer channelId;

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getOssPlayUrl() {
        return ossPlayUrl;
    }

    public void setOssPlayUrl(String ossPlayUrl) {
        this.ossPlayUrl = ossPlayUrl == null ? null : ossPlayUrl.trim();
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }
}