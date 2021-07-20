package com.odianyun.internship.startup.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: EDZ
 * @time: 16:31
 * @date: 2021/7/13
 */
@Component
@PropertySource("classpath:redis.properties")
@ConfigurationProperties("redis")
public class RedisConfig {
    private String port;

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
