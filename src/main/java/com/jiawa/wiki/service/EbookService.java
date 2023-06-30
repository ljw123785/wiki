package com.jiawa.wiki.service;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.jiawa.wiki.domain.Ebook;
import com.jiawa.wiki.domain.EbookExample;
import com.jiawa.wiki.mapper.EbookMapper;
import com.jiawa.wiki.req.EbookReq;
import com.jiawa.wiki.resp.EbookResp;
import com.jiawa.wiki.util.CopyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {
//    将mapper注入
    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req){

        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();//相当于where条件
        criteria.andNameLike("%"+ req.getName() +"%");   //模糊查询，左右匹配
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

        List<EbookResp> respList = new ArrayList<>();

//        for (Ebook ebook : ebookList) {
////            EbookResp ebookResp = new EbookResp();
////            BeanUtils.copyProperties(ebook,ebookResp); //将ebooKlist中的数据拷贝到ebookResp
//
//              对象更新
//            EbookResp ebookResp = CopyUtil.copy(ebook, EbookResp.class);
//
//            respList.add(ebookResp);
//        }
//
        List<EbookResp> list = CopyUtil.copyList(ebookList,EbookResp.class);



        return respList;
    }
}
