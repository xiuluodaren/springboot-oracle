package com.xiuluo.springboot.service;

import com.xiuluo.springboot.domain.User;
import com.xiuluo.springboot.request.UserFindRequest;

import java.util.List;

/**
 * 作者:修罗大人
 * 时间:2019/1/5 下午10:23
 * 描述:UserService
 */

public interface UserService {

    boolean addUser(User record);

    List<User> findAll(UserFindRequest request);
}
