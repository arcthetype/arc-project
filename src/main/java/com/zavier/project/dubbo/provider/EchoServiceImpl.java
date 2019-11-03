package com.zavier.project.dubbo.provider;

import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String msg) {
        String now = new SimpleDateFormat("HH:mm:ss").format(new Date());
        System.out.println("[" + now + "] Hello " + msg + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return msg;
    }
}
