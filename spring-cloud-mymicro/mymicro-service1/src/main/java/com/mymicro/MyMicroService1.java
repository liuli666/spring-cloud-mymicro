package com.mymicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;


@SpringBootApplication
@EnableEurekaClient
public class MyMicroService1 {
	public static void main(String[] args) {
		SpringApplication.run(MyMicroService1.class, args);
		
	}
	/**
	 * RestTemplate 复制rest接口的调用
	 * 是一种简单便捷的访问restfulll服务的模板类，是spring提供的用于访问rest服务的客户端模板工具集
	 * @return
	 */
	@Bean
	@LoadBalanced //Ribbon 负载均衡(客户端负载均衡)
	RestTemplate getRestTemplate() { 
		return new RestTemplate();
	}
	/**
	 * 重写定义Ribbon的负载均衡算法，默认为轮询算法
	 * @return
	 */
	@Bean
	public IRule myRule() {
		 return new RandomRule(); //随机算法
	}
}