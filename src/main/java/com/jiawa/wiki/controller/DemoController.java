package com.jiawa.wiki.controller;

import com.jiawa.wiki.domain.Demo;
import com.jiawa.wiki.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController  //一般返回字符串  @ResponseBody 用来返回字符串或JSON对象
@RequestMapping("/demo")
public class DemoController {
    
    @Resource
    private DemoService demoService;


    @GetMapping("/list") //变成一个接口
    public List<Demo> list(){
        return demoService.list();
    }
}
