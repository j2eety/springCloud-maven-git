package com.atguigu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class ConfigBean {//boot优化了spring   用@Configuration配置替代了application.xml
	@Bean
	@LoadBalanced //开启负载均衡   没有指明算法取  轮询算法
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	@Bean
	public IRule myrule() {
		return new RandomRule();//随机算法   负载均衡
		//return new RoundRobinRule();//轮询算法   负载均衡
		//return new RetryRule();//重试算法   负载均衡
	}
}
//<bean id="" class="">