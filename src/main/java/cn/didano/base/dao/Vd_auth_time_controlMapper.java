package cn.didano.base.dao;

import cn.didano.base.model.Vd_auth_time_control;
import cn.didano.base.model.Vd_auth_time_controlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Vd_auth_time_controlMapper {
    long countByExample(Vd_auth_time_controlExample example);

    int deleteByExample(Vd_auth_time_controlExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Vd_auth_time_control record);

    int insertSelective(Vd_auth_time_control record);

    List<Vd_auth_time_control> selectByExample(Vd_auth_time_controlExample example);

    Vd_auth_time_control selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Vd_auth_time_control record, @Param("example") Vd_auth_time_controlExample example);

    int updateByExample(@Param("record") Vd_auth_time_control record, @Param("example") Vd_auth_time_controlExample example);

    int updateByPrimaryKeySelective(Vd_auth_time_control record);

    int updateByPrimaryKey(Vd_auth_time_control record);
}