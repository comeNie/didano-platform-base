package cn.didano.base.dao;

import cn.didano.base.model.Tb_interactive_model;
import cn.didano.base.model.Tb_interactive_modelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tb_interactive_modelMapper {
    long countByExample(Tb_interactive_modelExample example);

    int deleteByExample(Tb_interactive_modelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tb_interactive_model record);

    int insertSelective(Tb_interactive_model record);

    List<Tb_interactive_model> selectByExample(Tb_interactive_modelExample example);

    Tb_interactive_model selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tb_interactive_model record, @Param("example") Tb_interactive_modelExample example);

    int updateByExample(@Param("record") Tb_interactive_model record, @Param("example") Tb_interactive_modelExample example);

    int updateByPrimaryKeySelective(Tb_interactive_model record);

    int updateByPrimaryKey(Tb_interactive_model record);
}