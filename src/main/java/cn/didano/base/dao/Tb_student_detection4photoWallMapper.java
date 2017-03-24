package cn.didano.base.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.didano.base.model.Tb_student_detection4photoWall;
import cn.didano.base.model.Tb_student_detection4photoWallExample;

public interface Tb_student_detection4photoWallMapper {
    long countByExample(Tb_student_detection4photoWallExample example);

    int deleteByExample(Tb_student_detection4photoWallExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tb_student_detection4photoWall record);

    int insertSelective(Tb_student_detection4photoWall record);

    List<Tb_student_detection4photoWall> selectByExample(Tb_student_detection4photoWallExample example);

    Tb_student_detection4photoWall selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tb_student_detection4photoWall record, @Param("example") Tb_student_detection4photoWallExample example);

    int updateByExample(@Param("record") Tb_student_detection4photoWall record, @Param("example") Tb_student_detection4photoWallExample example);

    int updateByPrimaryKeySelective(Tb_student_detection4photoWall record);

    int updateByPrimaryKey(Tb_student_detection4photoWall record);
}