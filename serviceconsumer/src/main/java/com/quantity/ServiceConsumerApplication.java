package com.quantity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhaoheng
 * @DATE 2019/7/26
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceConsumerApplication {

    /**
     * 在Configuration类中添加@Bean注解，相当于注入了一个全局的Bean，可以在其他任何类中引用
     * @return
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceConsumerApplication.class);
    }
}
