package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

import java.util.List;

/**
 * ClassName:UserMapper
 * Package: com.atguigu.mybatis.mappers
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/6 - 10:54
 * @Version: v1.0
 */
public interface UserMapper {
    int insertUser();

    int deleteUser();

    int updateUser();

    User queryUserBYId();

    List<User> queryUserByAll();

}
