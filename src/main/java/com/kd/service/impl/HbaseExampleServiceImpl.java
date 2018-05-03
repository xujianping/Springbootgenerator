package com.kd.service.impl;

import com.kd.entity.HbaseExampleEntity;
import com.kd.hbase.HBaseDaoUtil;
import com.kd.service.IHbaseExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author happy
 * @version 0
 * @Package com.kd.service.impl
 * @date 2018/5/3 22:01
 * @Description:业务操作Hbase的示例
 */

@Service
public class HbaseExampleServiceImpl implements IHbaseExampleService {
    @Autowired
    private HBaseDaoUtil hBaseDaoUtil;

    /**
     *
     * @param id 多个rowkey
     * @return
     */
    @Override
    public List<HbaseExampleEntity> getDataByRowkey(String id) {
        HbaseExampleEntity entity = new HbaseExampleEntity();
        List<HbaseExampleEntity> list = hBaseDaoUtil.getListByRowKeys(entity, id);
        return list;
    }

    /***
     *
     * @param list
     * @return
     */
    @Override
    public boolean saveBatch(List<HbaseExampleEntity> list) {
        return hBaseDaoUtil.save(list);
    }
}
