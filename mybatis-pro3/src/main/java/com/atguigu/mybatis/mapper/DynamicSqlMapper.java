package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

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

    /**
     * 批量删除  通过数组
     */

    //int deleteMoreByArray(@Param("eids") Integer[] eids);
    int deleteMoreByArray(Integer[] eids);
    /**
     * 批量插入
     */

    int insertMoreByList(List<Emp> emps);
}
