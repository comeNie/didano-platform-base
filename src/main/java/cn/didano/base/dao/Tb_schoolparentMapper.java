package cn.didano.base.dao;

import cn.didano.base.model.Tb_schoolparent;
import cn.didano.base.model.Tb_schoolparentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tb_schoolparentMapper {
    long countByExample(Tb_schoolparentExample example);

    int deleteByExample(Tb_schoolparentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tb_schoolparent record);

    int insertSelective(Tb_schoolparent record);

    List<Tb_schoolparent> selectByExample(Tb_schoolparentExample example);

    Tb_schoolparent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tb_schoolparent record, @Param("example") Tb_schoolparentExample example);

    int updateByExample(@Param("record") Tb_schoolparent record, @Param("example") Tb_schoolparentExample example);

    int updateByPrimaryKeySelective(Tb_schoolparent record);

    int updateByPrimaryKey(Tb_schoolparent record);
}