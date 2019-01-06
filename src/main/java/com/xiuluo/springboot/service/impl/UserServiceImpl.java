package com.xiuluo.springboot.service.impl;

import com.xiuluo.springboot.dao.UserMapper;
import com.xiuluo.springboot.domain.User;
import com.xiuluo.springboot.request.UserFindRequest;
import com.xiuluo.springboot.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 作者:修罗大人
 * 时间:2019/1/5 下午10:23
 * 描述:UserServiceImpl
 */

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public boolean addUser(User record){
        boolean result = false;
        try {
            userMapper.insert(record);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public List<User> findAll(UserFindRequest request)
    {
        List<User> all = null;

        all = userMapper.findAll(request);
        return all;
    }

}
