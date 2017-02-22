package cn.didano.base.dao;

import cn.didano.base.model.Tb_newstudent;
import cn.didano.base.model.Tb_newstudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tb_newstudentMapper {
    long countByExample(Tb_newstudentExample example);

    int deleteByExample(Tb_newstudentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tb_newstudent record);

    int insertSelective(Tb_newstudent record);

    List<Tb_newstudent> selectByExample(Tb_newstudentExample example);

    Tb_newstudent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tb_newstudent record, @Param("example") Tb_newstudentExample example);

    int updateByExample(@Param("record") Tb_newstudent record, @Param("example") Tb_newstudentExample example);

    int updateByPrimaryKeySelective(Tb_newstudent record);

    int updateByPrimaryKey(Tb_newstudent record);
}