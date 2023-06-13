package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import com.mysql.jdbc.MiniAdmin;
import javafx.beans.binding.ObjectExpression;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName:TestMybatis
 * Package: com.atguigu.mybatis.test
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/7 - 11:18
 * @Version: v1.0
 */
public class TestMybatis {
    @Test
    public void testQueryAll() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.queryUserByAll();
        users.forEach(System.out::println);
    }

    @Test
    public void testGetUserByUsername() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserByUsername("admin");
        System.out.println("user = " + user);
    }
    
    @Test
    public void testCheckLogin() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLogin("admin","123");
        System.out.println("user = " + user);
    }
    @Test
    public void testCheckLoginByParam() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLoginByParam("admin","123");
        System.out.println("user = " + user);
    }
    @Test
    public void testCheckLoginByMap() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<>();
        map.put("username","admin");
        map.put("password","123");
        User user = mapper.checkLoginByMap(map);
        System.out.println("user = " + user);
    }

    @Test
    public void testInsertUser() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null,"张三","123",33,'男',"443343@qq.com");
        Integer result = mapper.insertUser(user);
        System.out.println("result = " + result);
    }

    @Test
    public void testCheckLoginByIdToMap() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map map = mapper.checkLoginByIdToMap(2);
        System.out.println("map = " + map);
    }
    @Test
    public void testCheckLoginByIdToMaps() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map map = mapper.checkLoginByIdToMaps();
        System.out.println("map = " + map);
    }
}
