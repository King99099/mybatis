package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * ClassName:UserMapper
 * Package: com.atguigu.mybatis.mapper
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/7 - 10:48
 * @Version: v1.0
 */
public interface UserMapper {
    /*
    查询多条数据为List集合
     */
    List<User> queryUserByAll();

    User getUserByUsername(String username);

    User checkLogin(String username,String password);
    User checkLoginByParam(@Param("username") String username, @Param("password") String password);
    User checkLoginByMap(Map<String,Object> map);

    Integer insertUser(User user);

    /**
     * 查询单条数据为Map集合
     * @param id
     * @return
     */
    Map<String,Object> checkLoginByIdToMap(@Param("id")Integer id);

    /***
     * 查询多条数据为Map集合
     * @return
     */
    @MapKey("id")
    Map<String,Object> checkLoginByIdToMaps();
}
