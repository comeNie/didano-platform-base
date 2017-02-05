package cn.didano.video.auth.channel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import cn.didano.base.service.ChannelService;

/**
 * 缓存容器，目前只能做到查单个，查出list没有加上，需要更多了解spring cache细节，同时，将来采用redis可能还会大变
 * @author stephen
 * Created on 2016年12月25日 上午11:46:40 
 */
@Component
public class ChannelStatusRepository implements ChannelStatusRepositoryIF {
	@Autowired
	private ChannelService channelService;
	
    @Override
    @Cacheable("cache_channel_status")
    public ChannelStatus getByChannelId(int id) {
    	ChannelStatus cs = channelService.selectStatusById(id);
        simulateSlowService();
        return cs;
    }

    /**
     * mock
     */
    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

}
