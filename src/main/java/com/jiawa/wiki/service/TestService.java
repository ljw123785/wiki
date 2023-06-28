package com.jiawa.wiki.service;

import com.jiawa.wiki.domain.Test;
import com.jiawa.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {
//    将mapper注入
    @Resource
    private TestMapper testMapper;

    public List<Test> list(){
        return testMapper.list();

    }
}
