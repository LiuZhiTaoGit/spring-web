package com.heima.service;

import com.heima.pojo.Dept;

import java.util.List;

/**
 * @author: liuzt
 * @date: 2024/3/20 - 03 - 20 - 13:03
 * @description: com.heima.service
 * @version: 1.0
 */
public interface DeptService {
    /**
     * 查询全部部门数据
     * @return
     */
    List<Dept> list();
}
