package cn.didano.base.dao;

import cn.didano.base.model.Tb_interactive_catalog;
import cn.didano.base.model.Tb_interactive_catalogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tb_interactive_catalogMapper {
    long countByExample(Tb_interactive_catalogExample example);

    int deleteByExample(Tb_interactive_catalogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tb_interactive_catalog record);

    int insertSelective(Tb_interactive_catalog record);

    List<Tb_interactive_catalog> selectByExample(Tb_interactive_catalogExample example);

    Tb_interactive_catalog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tb_interactive_catalog record, @Param("example") Tb_interactive_catalogExample example);

    int updateByExample(@Param("record") Tb_interactive_catalog record, @Param("example") Tb_interactive_catalogExample example);

    int updateByPrimaryKeySelective(Tb_interactive_catalog record);

    int updateByPrimaryKey(Tb_interactive_catalog record);
}