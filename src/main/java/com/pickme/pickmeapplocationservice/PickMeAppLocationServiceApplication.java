package com.pickme.pickmeapplocationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PickMeAppLocationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PickMeAppLocationServiceApplication.class, args);
    }

}
