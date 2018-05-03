package com.kd.service.impl;

import com.kd.dao.HelloExampleDao;
import com.kd.entity.HelloExampleEntity;
import com.kd.service.IHbaseExampleService;
import com.kd.service.IHelloExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author happy
 * @version 0
 * @Package com.kd.service.impl
 * @date 2018/5/3 22:05
 * @Description:业务操作dao层的代码示例
 */
@Service
public class HelloExampleServiceImpl implements IHelloExampleService {
    @Autowired
    private HelloExampleDao helloExampleDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public HelloExampleEntity getHelloExampleUUID(String uuid) {
        HelloExampleEntity enInfo = helloExampleDao.getHelloExampleUUID(uuid);
        return enInfo;
    }
}
