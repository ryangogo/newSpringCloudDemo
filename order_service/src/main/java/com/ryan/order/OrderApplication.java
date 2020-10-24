package com.ryan.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EntityScan("com.ryan.order.entity")
@EnableFeignClients
//激活hystrix
@EnableCircuitBreaker
public class OrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class,args);
	}

}
