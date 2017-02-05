package cn.didano.base.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.didano.base.model.Vd_live;
import cn.didano.base.model.Vd_liveExample;

public interface Vd_liveMapper {
    long countByExample(Vd_liveExample example);

    int deleteByExample(Vd_liveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Vd_live record);

    int insertSelective(Vd_live record);

    List<Vd_live> selectByExample(Vd_liveExample example);

    Vd_live selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Vd_live record, @Param("example") Vd_liveExample example);

    int updateByExample(@Param("record") Vd_live record, @Param("example") Vd_liveExample example);

    int updateByPrimaryKeySelective(Vd_live record);

    int updateByPrimaryKey(Vd_live record);
}