package com.kd.interceptor;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author happy
 * @version 0
 * @Package com.kd.interceptor
 * @date 2018/5/3 21:59
 * @Description:定时任务案例代码
 */

@Component
public class ScheduledExample {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 60 * 60 * 1000)
    public void reportCurrentTime() {
        System.out.println("现在时间：" + dateFormat.format(new Date()));
    }
}
