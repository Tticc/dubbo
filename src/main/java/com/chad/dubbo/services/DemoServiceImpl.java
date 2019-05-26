package com.chad.dubbo.services;

import org.springframework.stereotype.Component;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component("demoService")
public class DemoServiceImpl implements DemoService{

	@Override
	public String greet(String name) {
		return "hello" + name;
	}

}
