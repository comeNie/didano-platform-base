package cn.didano.base.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.didano.base.model.View_switch_s_c;
import cn.didano.base.model.View_switch_s_cExample;

public interface View_switch_s_cMapper {
    long countByExample(View_switch_s_cExample example);

    int deleteByExample(View_switch_s_cExample example);

    int insert(View_switch_s_c record);

    int insertSelective(View_switch_s_c record);

    List<View_switch_s_c> selectByExample(View_switch_s_cExample example);

    int updateByExampleSelective(@Param("record") View_switch_s_c record, @Param("example") View_switch_s_cExample example);

    int updateByExample(@Param("record") View_switch_s_c record, @Param("example") View_switch_s_cExample example);
}