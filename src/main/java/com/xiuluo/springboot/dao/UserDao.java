package com.xiuluo.springboot.dao;

import com.xiuluo.springboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 作者:修罗大人
 * 时间:2019/1/6 下午12:36
 * 描述:UserDao
 */

public interface UserDao extends PagingAndSortingRepository<User,Integer> {

}
