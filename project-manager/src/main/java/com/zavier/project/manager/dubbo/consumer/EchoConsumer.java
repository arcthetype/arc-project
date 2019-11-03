package com.zavier.project.manager.dubbo.consumer;

import com.zavier.project.api.TimeServer;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component
public class EchoConsumer {

    @Reference
    private TimeServer timeServer;

    public String getTime(String format) {
        return timeServer.getTime(format);
    }
}
