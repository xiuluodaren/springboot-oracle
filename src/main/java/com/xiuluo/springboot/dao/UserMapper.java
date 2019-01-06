package com.xiuluo.springboot.dao;

import com.xiuluo.springboot.domain.User;

/**
 * 作者:修罗大人
 * 时间:2019/1/5 下午11:29
 * 描述:UserMapper
 */

public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
