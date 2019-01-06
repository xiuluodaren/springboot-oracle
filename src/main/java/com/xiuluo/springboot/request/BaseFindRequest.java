package com.xiuluo.springboot.request;

import lombok.Data;

/**
 * 作者:修罗大人
 * 时间:2019/1/6 下午4:12
 * 描述:BaseRequest
 */

@Data
public class BaseFindRequest {

    private int pageNumber;

    private int pageSize;

    public int getBeginItemIndex() {
        return (this.pageNumber - 1) * this.pageSize + 1;
    }

    public int getEndItemIndex() {
        return this.pageNumber * this.pageSize + 1;
    }

}
