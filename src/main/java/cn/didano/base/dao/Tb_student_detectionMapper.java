package cn.didano.base.dao;

import cn.didano.base.model.Tb_student_detection;
import cn.didano.base.model.Tb_student_detectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tb_student_detectionMapper {
    long countByExample(Tb_student_detectionExample example);

    int deleteByExample(Tb_student_detectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tb_student_detection record);

    int insertSelective(Tb_student_detection record);

    List<Tb_student_detection> selectByExample(Tb_student_detectionExample example);

    Tb_student_detection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tb_student_detection record, @Param("example") Tb_student_detectionExample example);

    int updateByExample(@Param("record") Tb_student_detection record, @Param("example") Tb_student_detectionExample example);

    int updateByPrimaryKeySelective(Tb_student_detection record);

    int updateByPrimaryKey(Tb_student_detection record);
}