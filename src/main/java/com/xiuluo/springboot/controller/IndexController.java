package com.xiuluo.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者:修罗大人
 * 时间:2019/1/5 下午3:37
 * 描述:IndexController
 */

@Controller
@RequestMapping("/index")
public class IndexController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    public String index(){
        System.out.println("indexindexindexindexindex");
        logger.warn("indexindexindexindexindexindexindexindexindexindexindexindexindexindexindexindexindexindexindexindex");
        return "xiuluo";
    }

}
