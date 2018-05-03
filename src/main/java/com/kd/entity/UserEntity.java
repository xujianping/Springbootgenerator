package com.kd.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author happy
 * @version 0
 * @Package com.kd.entity
 * @date 2018/5/3 21:31
 * @Description: 资源文件对应的实体信息映射
 */

@Component
@PropertySource(value = { "classpath:properties/dataExample.properties" })
public class UserEntity {
    @Value("${com.example.name}")
    private String name;

    @Value("${com.example.age}")
    private Integer age;

    @Value("${com.example.score}")
    private Double score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
