package com.kd.controller;

import com.kd.aop.AopExample;
import com.kd.entity.UserEntity;
import com.kd.service.IHelloExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author happy
 * @version 0
 * @Package com.kd.controller
 * @date 2018/5/3 22:13
 * @Description:基础的业务实现类操作
 * 1、返回实体信息
 * 2、异常消息处理全局返回json
 * 3、消息日志打印示例和查询
 */

@RestController
@RequestMapping(value = "/hello")
public class HelloController {
    @Autowired
    private UserEntity userEntity;

    @Autowired
    private IHelloExampleService helloExampleService;
    @GetMapping("/getUserEntity")
    public Object getUserEntity() {
        return userEntity;
    }

    @GetMapping("/getNum")
    public Object getNum() {
        int a = 1 / 0;
        return a;
    }

    @AopExample(desc = "就你知道是什么意思")
    @GetMapping("/getAccessInfo")
    public Object getAccessInfo() {
        return helloExampleService.getHelloExampleUUID("0wK5W8XK");
    }

}
