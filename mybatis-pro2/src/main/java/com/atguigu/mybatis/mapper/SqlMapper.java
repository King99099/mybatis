package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName:SqlMapper
 * Package: com.atguigu.mybatis.mapper
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/7 - 16:28
 * @Version: v1.0
 */
public interface SqlMapper {
    /**
     * 测试根据Username模糊查询
     * @param str
     * @return
     */
    List<User> getUserByLike(@Param("str")String str);

    /**
     * 批量删除
     * @param id
     * @return
     */
    Integer deleteMore(@Param("id") String id);

    /**
     * 根据动态表名查询
     * @param tableName
     * @return
     */
    List<User> getUserByTableName(@Param("tableName")String tableName);

    /**
     * 获取自动递增的住建 ID
     * @param user
     * @return
     */
    Integer insertUser(User user);
}
