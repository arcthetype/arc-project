package com.zavier.project.config;

import org.apache.dubbo.config.*;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDubbo(scanBasePackages = "com.zavier.project.dubbo")
public class DubboConfig {

    @Bean
    public ApplicationConfig applicationConfig() {
        final ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("echo-annotation");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        final RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("127.0.0.1:2181");
        return registryConfig;
    }

    @Bean
    public ProviderConfig providerConfig() {
        return new ProviderConfig();
    }

    @Bean
    public ProtocolConfig protocolConfig() {
        final ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20880);
        protocolConfig.setAccesslog("true");
        return protocolConfig;
    }

    @Bean
    public ConsumerConfig consumerConfig() {
        return new ConsumerConfig();
    }
}
