package com.kd.controller;

import com.kd.entity.HbaseExampleEntity;
import com.kd.service.IHbaseExampleService;
import com.kd.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author happy
 * @version 0
 * @Package com.kd.controller
 * @date 2018/5/3 22:12
 * @Description:Hbase 新增、查询、删除操作示例代码
 */

@RestController
@RequestMapping("/hbase")
public class HbaseController {
    @Autowired
    private IHbaseExampleService hbaseService;

    /**
     *
     * @Description: 根据rowkey查询数据
     * @param id hbase中的rowkey
     * @return 设定文件
     */
    @GetMapping("/get/{id}")
    public ResponseResult<List<HbaseExampleEntity>> getBean(@PathVariable String id) {
        List<HbaseExampleEntity> apples = hbaseService.getDataByRowkey(id);
        return ResponseResult.success("成功", apples);
    }

    /**
     *
     * @Description: 批量存储数据
     * @param list 前端传入集合数据
     * @return 设定文件
     */
    @PostMapping("/save")
    public ResponseResult<?> saveList(@RequestBody List<HbaseExampleEntity> list) {
        boolean saveBatch = hbaseService.saveBatch(list);
        if (saveBatch) {
            return ResponseResult.success();
        } else {
            return ResponseResult.error();
        }
    }

}
