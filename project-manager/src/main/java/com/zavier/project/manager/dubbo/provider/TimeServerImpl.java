package com.zavier.project.manager.dubbo.provider;

import com.zavier.project.api.TimeServer;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@Service
public class TimeServerImpl implements TimeServer {
    @Override
    public String getTime(String format) {
        log.info("called getTime, param:{}", format);
        return new SimpleDateFormat(format).format(new Date());
    }
}
