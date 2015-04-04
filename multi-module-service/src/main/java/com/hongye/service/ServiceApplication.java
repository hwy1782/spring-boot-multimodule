package com.hongye.service;

import com.hongye.base.BaseAppliaction;
import com.hongye.domain.DalApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration
@ComponentScan(basePackages = "com.hongye")
@Configuration
@Import(value = {DalApplication.class, BaseAppliaction.class})
public class ServiceApplication {


}
