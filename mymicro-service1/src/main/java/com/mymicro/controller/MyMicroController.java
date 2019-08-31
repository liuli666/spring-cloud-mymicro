package com.mymicro.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mymicro.controller.url.URL;

@RestController
public class MyMicroController {
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value = "/service1/controlelr/getinfo")
	public String getMyInfo() {
		System.out.println("服务：service1,请求过来了......发起rest组件之间的调用");
		Map<String,Object> forObject = restTemplate.getForObject(URL.SERVICE2_URL+"/service2/control/1", Map.class);
		System.out.println("服务：service2,请求rest组件之间的调用返回结果:"+forObject);
		return forObject.toString();
	}
}
