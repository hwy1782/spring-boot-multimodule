package com.hongye.base;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: hongweiye
 * Date: 2015/4/4 14:43
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.hongye.base")
@Configuration
public class BaseAppliaction {
}
