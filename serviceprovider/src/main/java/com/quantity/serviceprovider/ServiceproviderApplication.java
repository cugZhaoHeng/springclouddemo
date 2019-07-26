package com.quantity.serviceprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.quantity.serviceprovider.mapper") //Mapper接口的包扫描
@EnableDiscoveryClient
public class ServiceproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceproviderApplication.class, args);
    }

}
