package com.jiawa.wiki.service;

import com.jiawa.wiki.domain.Demo;
import com.jiawa.wiki.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoService {
//    将mapper注入
    @Resource
    private DemoMapper demoMapper;

    public List<Demo> list(){
        return demoMapper.selectByExample(null);

    }
}
