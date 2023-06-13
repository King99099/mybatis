package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;

import java.util.List;

/**
 * ClassName:DynamicSqlMapper
 * Package: com.atguigu.mybatis.mapper
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/9 - 14:58
 * @Version: v1.0
 */
public interface DynamicSqlMapper {
    /**
     * 多条件查询
     */
    List<Emp> getEmpByCondition(Emp emp);
}
