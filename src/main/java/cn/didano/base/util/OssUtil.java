package cn.didano.base.util;

import cn.didano.video.entity.OssInfo;

/**
 * Oss工具类
 * 
 * @author stephen Created on 2016年12月26日 下午12:30:05
 */
public class OssUtil {

	public static String getChannelName(int channelId, String enname, int schoolId, int classId) {
		String channelName = "school[" + schoolId + "]class[" + classId + "]channel[" + channelId + "]name[" + enname
				+ "]";//
		return channelName;
	}
}
