package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Department;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName:DepartmentMapper
 * Package: com.atguigu.mybatis.mapper
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/9 - 10:49
 * @Version: v1.0
 */
public interface DepartmentMapper {
    Department getDeptById(@Param("did") Integer did);
}
