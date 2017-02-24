package cn.didano.base.dao;

import cn.didano.base.model.Tb_newstaff;
import cn.didano.base.model.Tb_newstaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tb_newstaffMapper {
    long countByExample(Tb_newstaffExample example);

    int deleteByExample(Tb_newstaffExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tb_newstaff record);

    int insertSelective(Tb_newstaff record);

    List<Tb_newstaff> selectByExample(Tb_newstaffExample example);

    Tb_newstaff selectByPrimaryKey(Integer id);
   

    int updateByExampleSelective(@Param("record") Tb_newstaff record, @Param("example") Tb_newstaffExample example);

    int updateByExample(@Param("record") Tb_newstaff record, @Param("example") Tb_newstaffExample example);

    int updateByPrimaryKeySelective(Tb_newstaff record);

    int updateByPrimaryKey(Tb_newstaff record);
}