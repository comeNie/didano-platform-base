package cn.didano.video.entity;

/**
 * 频道数量信息
 * @author stephen
 * Created on 2016年12月29日 下午12:36:13 
 */
public class ChannelInfo {

	private int schoolId;
	private int num;

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public ChannelInfo(int schoolId, int num) {
		this.schoolId = schoolId;
		this.num = num;
	}

}
