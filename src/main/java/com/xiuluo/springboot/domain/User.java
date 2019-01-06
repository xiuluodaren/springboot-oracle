package com.xiuluo.springboot.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * 作者:修罗大人
 * 时间:2019/1/5 下午10:21
 * 描述:User
 */

@Data
@Entity
@Table(name = "user_t")
public class User {

    @Id
    @SequenceGenerator(name="USER_T_GEN", sequenceName="USER_T_SEQ",initialValue=1,allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="USER_T_GEN")
    private Integer id;

    private String userName;

    private String password;

    private Integer age;

}
