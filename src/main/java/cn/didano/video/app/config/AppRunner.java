package cn.didano.video.app.config;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import cn.didano.base.service.ChannelService;
import cn.didano.video.auth.channel.ChannelStatusRepositoryIF;

@Component
public class AppRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);

    private final ChannelStatusRepositoryIF ChannelStatusRepository;

    public AppRunner(ChannelStatusRepositoryIF ChannelStatusRepository) {
        this.ChannelStatusRepository = ChannelStatusRepository;
    }

    @Override
    public void run(String...args) throws Exception {
    }

}