package cn.didano.base.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.didano.base.model.View_staff_channel;
import cn.didano.base.model.View_staff_channelExample;

public interface View_staff_channelMapper {
    long countByExample(View_staff_channelExample example);

    int deleteByExample(View_staff_channelExample example);

    int insert(View_staff_channel record);

    int insertSelective(View_staff_channel record);

    List<View_staff_channel> selectByExample(View_staff_channelExample example);

    int updateByExampleSelective(@Param("record") View_staff_channel record, @Param("example") View_staff_channelExample example);

    int updateByExample(@Param("record") View_staff_channel record, @Param("example") View_staff_channelExample example);
}