package cn.didano.video.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 控制台信息
 * 
 * @author stephen Created on 2016年12月28日 下午1:19:45
 */
public class WholeChannelInfo {
	private int monitor_num;
	private int live_num;

	/**
	 * key = 学校id value =监控频道数量信息
	 */
	private List<ChannelInfo> monitors = new ArrayList<ChannelInfo>();
	/**
	 * key = 学校id value =直播频道数量信息
	 */
	private List<ChannelInfo> lives = new ArrayList<ChannelInfo>();

	public int getMonitor_num() {
		return monitor_num;
	}

	public void setMonitor_num(int monitor_num) {
		this.monitor_num = monitor_num;
	}

	public int getLive_num() {
		return live_num;
	}

	public void setLive_num(int live_num) {
		this.live_num = live_num;
	}

	public List<ChannelInfo> getMonitors() {
		return monitors;
	}

	public void setMonitors(List<ChannelInfo> monitors) {
		this.monitors = monitors;
	}

	public List<ChannelInfo> getLives() {
		return lives;
	}

	public void setLives(List<ChannelInfo> lives) {
		this.lives = lives;
	}

	
}
