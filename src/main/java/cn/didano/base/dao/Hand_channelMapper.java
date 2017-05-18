package cn.didano.base.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.didano.base.model.ChannelStatus;

public interface Hand_channelMapper {
	ChannelStatus selectStatusById(int id);

	List<ChannelStatus> selectALL();

	int updateByChannelStatus(@Param("record") ChannelStatus channelStatus);
}