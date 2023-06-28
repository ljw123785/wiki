package com.jiawa.wiki.controller;

import com.jiawa.wiki.domain.Test;
import com.jiawa.wiki.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController  //一般返回字符串  @ResponseBody 用来返回字符串或JSON对象
//@Controller // 返回页面
public class TestController {
    /*
    GET POST PUT DELETE

     */
//    @GetMapping()
//    @PostMapping()
//    @PutMapping()
//    @DeleteMapping()
//    @RequestMapping(value="",method = RequestMethod) 定义方法类型

    @Resource
    private TestService testService;
    @GetMapping("/hello") //变成一个接口
    public String hello(){
        return "Hello World";
    }
    @PostMapping("/hello/post") //变成一个接口
    public String helloPost(String name){
        return "Hello Word! post," + name;
    }

    @GetMapping("/test/list") //变成一个接口
    public List<Test> list(){
        return testService.list();
    }
}
