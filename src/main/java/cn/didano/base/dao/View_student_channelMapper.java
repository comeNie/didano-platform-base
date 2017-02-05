package cn.didano.base.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.didano.base.model.View_student_channel;
import cn.didano.base.model.View_student_channelExample;

public interface View_student_channelMapper {
    long countByExample(View_student_channelExample example);

    int deleteByExample(View_student_channelExample example);

    int insert(View_student_channel record);

    int insertSelective(View_student_channel record);

    List<View_student_channel> selectByExample(View_student_channelExample example);

    int updateByExampleSelective(@Param("record") View_student_channel record, @Param("example") View_student_channelExample example);

    int updateByExample(@Param("record") View_student_channel record, @Param("example") View_student_channelExample example);
}