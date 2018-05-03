package com.kd.dao;

import com.kd.entity.HelloExampleEntity;
import com.kd.utils.PageParam;
import com.sun.tools.javac.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author happy
 * @version 0
 * @Package com.kd.dao
 * @date 2018/5/3 21:37
 * @Description:数据操作的接口类
 */
@Mapper
public interface HelloExampleDao {
    /**
     * @Description: 根据id进行数据查询
     * @param uuid
     * @return 设定文件
     */
    public HelloExampleEntity getHelloExampleUUID(@Param("uuid") String uuid);

    /***
     * @Description: 分页查询数据信息
     * @param pageParam 分页参数
     * @return 设定文件
     */
    public List<HelloExampleEntity> findByParams(PageParam pageParam);
}
