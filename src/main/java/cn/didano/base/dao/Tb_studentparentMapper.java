package cn.didano.base.dao;

import cn.didano.base.model.Tb_studentparent;
import cn.didano.base.model.Tb_studentparentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tb_studentparentMapper {
    long countByExample(Tb_studentparentExample example);

    int deleteByExample(Tb_studentparentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tb_studentparent record);

    int insertSelective(Tb_studentparent record);

    List<Tb_studentparent> selectByExample(Tb_studentparentExample example);

    Tb_studentparent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tb_studentparent record, @Param("example") Tb_studentparentExample example);

    int updateByExample(@Param("record") Tb_studentparent record, @Param("example") Tb_studentparentExample example);

    int updateByPrimaryKeySelective(Tb_studentparent record);

    int updateByPrimaryKey(Tb_studentparent record);
}