package com.ryan.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * describe：
 * Created with IDEA
 *
 * @author ryan
 * Date:2020/10/20
 * Time:下午5:13
 */
@EnableEurekaServer
@SpringBootApplication
public class RegisterServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterServerApplication.class,args);

    }


}
