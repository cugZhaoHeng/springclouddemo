package com.quantity.controller;

import com.quantity.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author zhaoheng
 * @DATE 2019/7/26
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping("{id}")
    @ResponseBody
    public User queryUserById(@PathVariable("id") Long id) {
        List<ServiceInstance> instances = discoveryClient.getInstances("service-provider");
        ServiceInstance serviceInstance = instances.get(0);

        return restTemplate.getForObject("http://" + serviceInstance.getHost()+ ":" + serviceInstance.getPort()+"/user/" + id, User.class);
    }
}
