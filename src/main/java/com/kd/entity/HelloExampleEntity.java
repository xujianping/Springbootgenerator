package com.kd.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;

/**
 * @author happy
 * @version 0
 * @Package com.kd.entity
 * @date 2018/5/3 19:35
 * @Description:基本对应的数据库实体信息
 */

public class HelloExampleEntity implements Serializable {
    private static final long serialVersionUID = 302780684394764360L;
    //任务ID
    private int id;
    //接口请求uri
    private String uri;
    //UUID
    private String uuid;
    //查询请求时间
    private String query;
    //接口访问时间
    private long inTime;
    //接口输出时间
    private long outTime;
    //接口数据字节大小
    private long dataBytes;
    //命中的条数
    private long record;
    //状态
    private String status;
    //消耗时间
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss a", locale = "zh", timezone = "GMT+8")
    private Long espTime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public long getInTime() {
        return inTime;
    }

    public void setInTime(long inTime) {
        this.inTime = inTime;
    }

    public long getOutTime() {
        return outTime;
    }

    public void setOutTime(long outTime) {
        this.outTime = outTime;
    }

    public long getDataBytes() {
        return dataBytes;
    }

    public void setDataBytes(long dataBytes) {
        this.dataBytes = dataBytes;
    }

    public long getRecord() {
        return record;
    }

    public void setRecord(long record) {
        this.record = record;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getEspTime() {
        return espTime;
    }

    public void setEspTime(Long espTime) {
        this.espTime = espTime;
    }
    @Override
    public String toString() {
        return "HelloExampleEntity{" +
                "id=" + id +
                ", uri='" + uri + '\'' +
                ", uuid='" + uuid + '\'' +
                ", query='" + query + '\'' +
                ", inTime=" + inTime +
                ", outTime=" + outTime +
                ", dataBytes=" + dataBytes +
                ", record=" + record +
                ", status='" + status + '\'' +
                ", espTime=" + espTime +
                '}';
    }
}
