package com.heima.service.impl;

import com.heima.mapper.DeptMapper;
import com.heima.pojo.Dept;
import com.heima.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: liuzt
 * @date: 2024/3/20 - 03 - 20 - 13:03
 * @description: com.heima.service.impl
 * @version: 1.0
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;


    /**
     * 查询全部部门数据
     * @return
     */
    @Override
    public List<Dept> list() {
        return deptMapper.list();
    }
}
