package com.zavier.project.manager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

@Configuration
public class ThreadConfig {

    @Bean
    public ThreadPoolTaskExecutor coreThreadPoolTaskExecutor() {
        final ThreadPoolTaskExecutor poolTaskExecutor = new ThreadPoolTaskExecutor();
        poolTaskExecutor.setCorePoolSize(4);
        poolTaskExecutor.setMaxPoolSize(10);
        poolTaskExecutor.setQueueCapacity(50);
        poolTaskExecutor.setKeepAliveSeconds(60);
        poolTaskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
        poolTaskExecutor.setThreadNamePrefix("core-");
        poolTaskExecutor.setDaemon(true);
        return poolTaskExecutor;
    }

    @Bean
    public ThreadPoolTaskExecutor minorThreadPoolTaskExecutor() {
        final ThreadPoolTaskExecutor poolTaskExecutor = new ThreadPoolTaskExecutor();
        poolTaskExecutor.setCorePoolSize(2);
        poolTaskExecutor.setMaxPoolSize(5);
        poolTaskExecutor.setQueueCapacity(50);
        poolTaskExecutor.setKeepAliveSeconds(60);
        poolTaskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
        poolTaskExecutor.setThreadNamePrefix("minor-");
        poolTaskExecutor.setDaemon(true);
        return poolTaskExecutor;
    }
}
