package cn.didano.video.entity;

/**
 * 频道数量信息
 * @author stephen
 * Created on 2016年12月29日 下午12:36:13 
 */
public class InfoChannel {
	private int school_id;
	private String school_name;
	private int on_monitor_num;
	private int on_live_num;
	private int on_video_num;
	private int all_monitor_num;
	private int all_live_num;
	private int all_video_num;
	
	public InfoChannel(){}
	
	public int getSchool_id() {
		return school_id;
	}
	public void setSchool_id(int school_id) {
		this.school_id = school_id;
	}
	public String getSchool_name() {
		return school_name;
	}
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
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
}
