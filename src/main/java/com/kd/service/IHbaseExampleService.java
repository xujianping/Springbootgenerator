package com.kd.service;

import com.kd.entity.HbaseExampleEntity;

import java.util.List;

/**
 * @author happy
 * @version 0
 * @Package com.kd.service
 * @date 2018/5/3 22:00
 * @Description:操作Hbase的接口业务接口
 */
public interface IHbaseExampleService {
    /**
     *
     * @Description: 查询多个rowkey返回集合代码
     * @param id 多个rowkey
     * @return 设定文件
     */
    public List<HbaseExampleEntity> getDataByRowkey(String id);

    /**
     *
     * @Description: 批量保存数据信息
     * @param list
     * @return 设定文件
     */
    public boolean saveBatch(List<HbaseExampleEntity> list);
}
