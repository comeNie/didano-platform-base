package cn.didano.base.model;

public class View_student_channel {
    private Integer studentId;

    private String studentName;

    private String name;

    private String ossPlayUrl;

    private Integer channelId;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
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