package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName:CacheMapper
 * Package: com.atguigu.mybatis.mapper
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/14 - 15:00
 * @Version: v1.0
 */
public interface CacheMapper {
    Emp getEmpById(@Param("eid") Integer eid);

    int insertEmp(@Param("emp") Emp emp);
}
