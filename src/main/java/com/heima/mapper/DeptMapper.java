package com.heima.mapper;

import com.heima.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: liuzt
 * @date: 2024/3/20 - 03 - 20 - 13:02
 * @description: com.heima.mapper
 * @version: 1.0
 */
@Mapper
public interface DeptMapper {

    /**
     * 查询全部部门数据
     * @return
     */
    @Select("select * from dept")
    List<Dept> list();
}
