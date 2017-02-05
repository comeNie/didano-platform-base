package cn.didano.video.auth.ws;

import java.util.concurrent.ConcurrentHashMap;

import cn.didano.video.auth.AuthVideoInfo;

/**
 * 按channel的websocket集合
 * @author stephen
 * Created on 2016年12月23日 下午6:56:37 
 */
public class WebsocketChannel {
	private int channelId;
	private ConcurrentHashMap<String, AuthVideoInfo> wayMap = new ConcurrentHashMap<String, AuthVideoInfo>();

	public int getChannelId() {
		return channelId;
	}

	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}

	public ConcurrentHashMap<String, AuthVideoInfo> getWayMap() {
		return wayMap;
	}

	public WebsocketChannel(int channelId) {
		super();
		this.channelId = channelId;
	}
	
}
