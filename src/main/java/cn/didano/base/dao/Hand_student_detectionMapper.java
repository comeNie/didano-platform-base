package cn.didano.base.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.didano.base.model.Tb_student_detection;

public interface Hand_student_detectionMapper {
	List<Tb_student_detection> select_student_detection(@Param("birthday") Date birthday,  @Param("birthday1")Date birthday1);
}