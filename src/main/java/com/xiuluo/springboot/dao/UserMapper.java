package com.xiuluo.springboot.dao;

import com.xiuluo.springboot.domain.User;
import com.xiuluo.springboot.request.UserFindRequest;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    List<User> findAll(@Param("request") UserFindRequest request);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
