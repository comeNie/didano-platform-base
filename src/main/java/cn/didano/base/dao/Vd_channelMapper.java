package cn.didano.base.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.didano.base.model.Vd_channel;
import cn.didano.base.model.Vd_channelExample;

public interface Vd_channelMapper {
    long countByExample(Vd_channelExample example);

    int deleteByExample(Vd_channelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Vd_channel record);

    int insertSelective(Vd_channel record);

    List<Vd_channel> selectByExample(Vd_channelExample example);

    Vd_channel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Vd_channel record, @Param("example") Vd_channelExample example);

    int updateByExample(@Param("record") Vd_channel record, @Param("example") Vd_channelExample example);

    int updateByPrimaryKeySelective(Vd_channel record);

    int updateByPrimaryKey(Vd_channel record);
}