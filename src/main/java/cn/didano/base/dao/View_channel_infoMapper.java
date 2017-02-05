package cn.didano.base.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.didano.base.model.View_channel_info;
import cn.didano.base.model.View_channel_infoExample;

public interface View_channel_infoMapper {
    long countByExample(View_channel_infoExample example);

    int deleteByExample(View_channel_infoExample example);

    int insert(View_channel_info record);

    int insertSelective(View_channel_info record);

    List<View_channel_info> selectByExample(View_channel_infoExample example);

    int updateByExampleSelective(@Param("record") View_channel_info record, @Param("example") View_channel_infoExample example);

    int updateByExample(@Param("record") View_channel_info record, @Param("example") View_channel_infoExample example);
}