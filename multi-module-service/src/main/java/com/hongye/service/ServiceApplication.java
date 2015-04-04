package com.hongye.service;

import com.hongye.base.BaseAppliaction;
import com.hongye.domain.DalApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(value = {DalApplication.class, BaseAppliaction.class})
public class ServiceApplication {


}
