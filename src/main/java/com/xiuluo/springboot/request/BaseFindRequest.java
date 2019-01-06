package com.xiuluo.springboot.request;

import lombok.Data;

/**
 * 作者:修罗大人
 * 时间:2019/1/6 下午4:12
 * 描述:BaseRequest
 */

@Data
public class BaseFindRequest {

    private int page;

    private int size;

}
