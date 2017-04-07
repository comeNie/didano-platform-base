package cn.didano.base.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 学生家长信息，json对象
 * 		{
            "id": 3593,
            "class_id": 18,
            "name": "廖君雅",
            "class_name": "贝恩班",
            "birthday": "2013-12-19",
            "gender": 2,
            "student_ic_number": "02944",
            "icCardId": 7,
            "parent": [
              {
                "id": 5730,
                "relation_id": 1,
                "parent_name": "爸爸",
                "parent_phone": "13883766355",
                "parent_ic_number": "8888",
                "icCardId": 10
              },
              {..}
            ]
          }
 * @author stephen.wang  2017年4月5日 
 */
public class Hand_WholeStudentParents4PhoneBook {
	private Integer id;
	private Integer classId;
	private String name;
	private String class_name;
	private Date birthday;
	private byte gender;
	private String student_ic_number; 
	private Integer icCardId;
	
	private List<Hand_parent4mailList> parent = new ArrayList<Hand_parent4mailList>();
	
	
	public Integer getIcCardId() {
		return icCardId;
	}
	public void setIcCardId(Integer icCardId) {
		this.icCardId = icCardId;
	}
	public String getStudent_ic_number() {
		return student_ic_number;
	}
	public void setStudent_ic_number(String student_ic_number) {
		this.student_ic_number = student_ic_number;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@JsonFormat(pattern="yyyy-MM-dd")
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public byte getGender() {
		return gender;
	}
	public void setGender(byte gender) {
		this.gender = gender;
	}
	public List<Hand_parent4mailList> getParent() {
		return parent;
	}
	public void setParent(List<Hand_parent4mailList> parent) {
		this.parent = parent;
	}
}
