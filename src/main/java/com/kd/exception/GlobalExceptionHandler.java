package com.kd.exception;

import com.kd.utils.ResponseResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author happy
 * @version 0
 * @Package com.kd.exception
 * @date 2018/5/3 21:52
 * @Description:全局异常拦截
 */

public class GlobalExceptionHandler {
    /**
     *
     * @Description: 全局异常处理
     * @param req
     * @param e
     * @return
     * @throws Exception 设定文件
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseResult<String> jsonErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        return ResponseResult.error("系统异常");
    }
}
