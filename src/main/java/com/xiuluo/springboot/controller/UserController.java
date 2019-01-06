package com.xiuluo.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.xiuluo.springboot.domain.User;
import com.xiuluo.springboot.request.UserFindRequest;
import com.xiuluo.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * 作者:修罗大人
 * 时间:2019/1/5 下午10:41
 * 描述:UserController
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/addUser")
    @ResponseBody
    public void addUser()
    {
        User user = new User();
        user.setId(123);
        user.setUserName("xiuluo");
        user.setPassword("123456");
        user.setAge(25);

        boolean b = userService.addUser(user);

        System.out.println(b);

    }

    @RequestMapping("/findAll")
    @ResponseBody
    public List<User> findAll(@RequestBody UserFindRequest request){

        List<User> all = userService.findAll(request);

        return all;

    }

}
