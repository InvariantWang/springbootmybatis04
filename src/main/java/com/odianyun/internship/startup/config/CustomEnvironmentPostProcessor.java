package com.odianyun.internship.startup.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;

import java.io.InputStreamReader;
import java.util.Properties;

/**
 * @description:
 * @author: EDZ
 * @time: 11:44
 * @date: 2021/7/11
 */
public class CustomEnvironmentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        Properties properties = new Properties();

        try {
            properties.load(new InputStreamReader(CustomEnvironmentPostProcessor.class.getClassLoader().getResourceAsStream("custom.properties"),"UTF-8"));

            PropertiesPropertySource propertiesPropertySource = new PropertiesPropertySource("custom",properties);
            environment.getPropertySources().addLast(propertiesPropertySource);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
