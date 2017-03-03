package cn.didano.base.dao;

import java.util.List;

import cn.didano.base.model.Tb_student_detection;

public interface Tb_student_selectMapper {
	List<Tb_student_detection> selectByPrimaryKey_student(Integer id);
}