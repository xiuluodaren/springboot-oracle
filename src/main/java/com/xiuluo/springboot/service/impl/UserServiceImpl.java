package com.xiuluo.springboot.service.impl;

import com.xiuluo.springboot.dao.UserDao;
import com.xiuluo.springboot.domain.User;
import com.xiuluo.springboot.request.UserFindRequest;
import com.xiuluo.springboot.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 作者:修罗大人
 * 时间:2019/1/5 下午10:23
 * 描述:UserServiceImpl
 */

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public boolean addUser(User record){
        boolean result = false;
        try {
            userDao.save(record);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public Page<User> findAll(UserFindRequest request)
    {
        Page<User> all = null;

        if (request.getSize() <= 0)
        {
            request.setSize(Integer.MAX_VALUE);
            request.setPage(0);
        }

        Pageable pageable = PageRequest.of(request.getPage(),request.getSize());
        all = userDao.findAll(pageable);
        return all;
    }

}
