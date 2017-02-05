package cn.didano.video.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 控制台信息
 * 
 * @author stephen Created on 2016年12月28日 下午1:19:45
 */
public class InfoChannel_C {
	private int on_monitor_num;
	private int on_live_num;
	private int on_video_num;
	private int all_monitor_num;
	private int all_live_num;
	private int all_video_num;
	private List<InfoChannel> schools;
	private int school_num;
	
	public int getOn_monitor_num() {
		return on_monitor_num;
	}
	public void setOn_monitor_num(int on_monitor_num) {
		this.on_monitor_num = on_monitor_num;
	}
	public int getOn_live_num() {
		return on_live_num;
	}
	public void setOn_live_num(int on_live_num) {
		this.on_live_num = on_live_num;
	}
	public int getOn_video_num() {
		return on_video_num;
	}
	public void setOn_video_num(int on_video_num) {
		this.on_video_num = on_video_num;
	}
	public int getAll_monitor_num() {
		return all_monitor_num;
	}
	public void setAll_monitor_num(int all_monitor_num) {
		this.all_monitor_num = all_monitor_num;
	}
	public int getAll_live_num() {
		return all_live_num;
	}
	public void setAll_live_num(int all_live_num) {
		this.all_live_num = all_live_num;
	}
	public int getAll_video_num() {
		return all_video_num;
	}
	public void setAll_video_num(int all_video_num) {
		this.all_video_num = all_video_num;
	}
	public List<InfoChannel> getSchools() {
		return schools;
	}
	public void setSchools(List<InfoChannel> schools) {
		this.schools = schools;
	}
	public int getSchool_num() {
		return school_num;
	}
	public void setSchool_num(int school_num) {
		this.school_num = school_num;
	}
}
