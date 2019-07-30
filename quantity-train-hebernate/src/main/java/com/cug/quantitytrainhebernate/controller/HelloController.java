package com.cug.quantitytrainhebernate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaoheng
 * @date 2019/7/30 0030
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello world!";
    }

    @GetMapping("hello/{id}")
    public String getHello(@PathVariable("id") String id) {
        return id;
    }

    @PostMapping("hello/{id}")
    public Object postHello(@PathVariable("id") String id, @RequestParam("name") String name) {
        Map<String, Object> map = new HashMap<>();
        map.put("ID", id);
        if(name == null || name.equals("")) {
            map.put("Name", "张三");
        }
        map.put("Name", name);
        return map;
    }

}
