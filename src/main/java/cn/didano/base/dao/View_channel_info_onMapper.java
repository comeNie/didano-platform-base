package cn.didano.base.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.didano.base.model.View_channel_info_on;
import cn.didano.base.model.View_channel_info_onExample;

public interface View_channel_info_onMapper {
    long countByExample(View_channel_info_onExample example);

    int deleteByExample(View_channel_info_onExample example);

    int insert(View_channel_info_on record);

    int insertSelective(View_channel_info_on record);

    List<View_channel_info_on> selectByExample(View_channel_info_onExample example);

    int updateByExampleSelective(@Param("record") View_channel_info_on record, @Param("example") View_channel_info_onExample example);

    int updateByExample(@Param("record") View_channel_info_on record, @Param("example") View_channel_info_onExample example);
}