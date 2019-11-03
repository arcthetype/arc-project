package com.zavier.project.dubbo.consumer;

import com.zavier.project.dubbo.provider.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component
public class EchoConsumer {

    @Reference
    private EchoService echoService;

    public String echo(String name) {
        return echoService.echo(name);
    }
}
