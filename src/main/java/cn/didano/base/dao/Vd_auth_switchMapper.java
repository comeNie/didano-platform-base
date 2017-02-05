package cn.didano.base.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.didano.base.model.Vd_auth_switch;
import cn.didano.base.model.Vd_auth_switchExample;

public interface Vd_auth_switchMapper {
    long countByExample(Vd_auth_switchExample example);

    int deleteByExample(Vd_auth_switchExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Vd_auth_switch record);

    int insertSelective(Vd_auth_switch record);

    List<Vd_auth_switch> selectByExample(Vd_auth_switchExample example);

    Vd_auth_switch selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Vd_auth_switch record, @Param("example") Vd_auth_switchExample example);

    int updateByExample(@Param("record") Vd_auth_switch record, @Param("example") Vd_auth_switchExample example);

    int updateByPrimaryKeySelective(Vd_auth_switch record);

    int updateByPrimaryKey(Vd_auth_switch record);
}