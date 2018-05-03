package com.kd.service;

/**
 * @author happy
 * @version 0
 * @Package com.kd.service
 * @date 2018/5/3 22:07
 * @Description:Redis操作示例
 */
public interface IRedisExampleServce {
    public String get(String key);

    public boolean set(String key, String val);
}
