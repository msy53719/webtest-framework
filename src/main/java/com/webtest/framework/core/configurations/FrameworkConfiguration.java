package com.webtest.framework.core.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource(value = { "classpath:com/webtest/framework/default.config.properties",
		"classpath:config/${t}.config.properties" }, ignoreResourceNotFound = true)
@ComponentScan(basePackages = { "${scan.packages}" })
public class FrameworkConfiguration {
	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
