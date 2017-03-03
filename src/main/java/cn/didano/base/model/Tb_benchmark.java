package cn.didano.base.model;

import java.util.Date;

public class Tb_benchmark {
    private Integer id;

    private Integer age;

    private Double height1;

    private Double height2;

    private Double weight1;

    private Double weight2;

    private Date createdTime;

    private Date updateTime;

    private Integer sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}