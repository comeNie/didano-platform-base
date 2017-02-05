package cn.didano.base.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.didano.base.dao.Vd_channelMapper;
import cn.didano.base.model.Vd_channel;
import cn.didano.base.model.Vd_channelExample;
import cn.didano.video.constant.ChannelType;
import cn.didano.video.constant.DeletedType;
import cn.didano.video.constant.StatusType;
import cn.didano.video.entity.InfoChannel_C;
import cn.didano.video.entity.WholeChannelInfo;

/**
 * 控制台一些服务放在这里 当前有多少监控频道 当前有多少直播频道
 * 
 * @author stephen Created on 2016年12月28日 下午1:16:00
 */
@Service
public class ManagerService {
	@Autowired
	private Vd_channelMapper channelMapper;

	/**
	 * 控制台数据
	 * 
	 * @return
	 */
	public WholeChannelInfo getWholeChannelInfo() {
		Vd_channelExample example = new Vd_channelExample();
		Vd_channelExample.Criteria cri = example.createCriteria();
		// 没有删除的
		cri.andDeletedEqualTo(DeletedType.N0_DELETED.getValue());
		// 是监控的
		cri.andTypeEqualTo(ChannelType.MONITOR.getIndex());
		// 状态是启用的
		cri.andStatusEqualTo(StatusType.IS_USE.getIndex());
		long monitor_num = channelMapper.countByExample(example);
		// ---------上面是监控数量--------------------------下面是直播数量----------------------------//
		Vd_channelExample example2 = new Vd_channelExample();
		Vd_channelExample.Criteria cri2 = example2.createCriteria();
		// 没有删除的
		cri2.andDeletedEqualTo(DeletedType.N0_DELETED.getValue());
		// 是监控的
		cri2.andTypeEqualTo(ChannelType.LIVE.getIndex());
		// 状态是启用的
		cri2.andStatusEqualTo(StatusType.IS_USE.getIndex());
		long live_num = channelMapper.countByExample(example2);
		WholeChannelInfo managerInfo = new WholeChannelInfo();
		managerInfo.setMonitor_num((int) monitor_num);
		managerInfo.setLive_num((int) live_num);
		return managerInfo;
	}

	/**
	 * 控制台数据
	 * 计算所有的数据
	 * on_monitor_num = 0;
	 * on_live_num = 0;
	 * on_video_num = 0;
	 * all_monitor_num = 0;
	 * all_live_num = 0;
	 * all_video_num = 0;
	 * @return
	 */
	public InfoChannel_C getInfoChannel_C() {
		Vd_channelExample example = new Vd_channelExample();
		Vd_channelExample.Criteria cri = example.createCriteria();
		// 没有删除的
		cri.andDeletedEqualTo(DeletedType.N0_DELETED.getValue());
		List<Vd_channel> list = channelMapper.selectByExample(example);
		int on_monitor_num = 0;
		int on_live_num = 0;
		int on_video_num = 0;
		int all_monitor_num = 0;
		int all_live_num = 0;
		int all_video_num = 0;
		for (Iterator<Vd_channel> itr = list.iterator(); itr.hasNext();) {  
			Vd_channel str = itr.next();  
			all_video_num++;
			if(str.getStatus()==StatusType.IS_USE.getIndex()){
				on_video_num++;
				if(str.getType()==ChannelType.MONITOR.getIndex()){
					all_monitor_num ++;
					on_monitor_num ++;
				}else{
					all_live_num ++;
					on_live_num ++;
				}
			}else{
				if(str.getType()==ChannelType.MONITOR.getIndex()){
					all_monitor_num ++;
				}else{
					all_live_num ++;
				}
			}
		}  
		InfoChannel_C c = new InfoChannel_C();
		c.setAll_live_num(all_live_num);
		c.setAll_monitor_num(all_monitor_num);
		c.setAll_video_num(all_video_num);
		c.setOn_live_num(on_live_num);
		c.setOn_monitor_num(on_monitor_num);
		c.setOn_video_num(on_video_num);
		return c;
	}
}
