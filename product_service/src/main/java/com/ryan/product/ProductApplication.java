package com.ryan.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

/**
 * @author jincong
 */
@SpringBootApplication
@EntityScan("com.ryan.product.entity")
//激活hystritx
@EnableCircuitBreaker
public class ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class,args);
	}

}
