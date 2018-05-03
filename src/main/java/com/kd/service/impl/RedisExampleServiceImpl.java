package com.kd.service.impl;

import com.kd.service.IRedisExampleServce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

/**
 * @author happy
 * @version 0
 * @Package com.kd.service.impl
 * @date 2018/5/3 22:08
 * @Description:
 */

@Service
public class RedisExampleServiceImpl implements IRedisExampleServce {
    @Autowired
    private StringRedisTemplate redisTemplate;

    /**
     *
     * @param key
     * @return
     */
    @Override
    public String get(String key) {
        String str = "";
        ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();
        if (redisTemplate.hasKey("a")) {
            str = opsForValue.get("a");
        }
        return str;
    }

    /**
     *
     * @param key
     * @param val
     * @return
     */
    @Override
    public boolean set(String key, String val) {
        boolean flag = false;
        ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();
        opsForValue.set(key, val);
        flag = true;
        return flag;
    }
}
