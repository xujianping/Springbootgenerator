package com.kd.entity;

import com.kd.hbase.HbaseColumn;
import com.kd.hbase.HbaseTable;

/**
 * @author happy
 * @version 0
 * @Package com.kd.entity
 * @date 2018/5/3 21:24
 * @Description: 与Hbase中表的rowkey、列簇、列名以及列对应
 */

@HbaseTable(tableName = "t1")
public class HbaseExampleEntity {

    // 标示数据中rowkey，用在新增时候填充
    @HbaseColumn(family = "rowkey", qualifier = "rowkey")
    private String id;

    // 列簇、列映射的实体名称，用于查询的数据返回
    @HbaseColumn(family = "f1", qualifier = "c1")
    private String c1;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getC1() {
        return c1;
    }

    public void setC1(String c1) {
        this.c1 = c1;
    }
}
