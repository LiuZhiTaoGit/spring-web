package com.heima.controller;

import com.heima.pojo.Dept;
import com.heima.pojo.Result;
import com.heima.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: liuzt
 * @date: 2024/3/20 - 03 - 20 - 13:04
 * @description: com.heima.controller
 * @version: 1.0
 */
@RestController
@Slf4j
public class DeptController {
    //这个是要从ioc中拿的，所以要自动注入
    @Autowired
    private DeptService deptService;

//    @RequestMapping(value = "/depts",method = RequestMethod.GET)
    @GetMapping("/depts")
    public Result selectDepts(){
        List<Dept> list = deptService.list();
        log.info("查询全部数据");
        return Result.success(list);

    }
}
