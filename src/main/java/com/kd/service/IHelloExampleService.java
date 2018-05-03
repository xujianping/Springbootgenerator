package com.kd.service;

import com.kd.entity.HelloExampleEntity;

/**
 * @author happy
 * @version 0
 * @Package com.kd.service
 * @date 2018/5/3 22:04
 * @Description:数据查询业务示例代码
 */
public interface IHelloExampleService {
    public HelloExampleEntity getHelloExampleUUID(String uuid);
}
