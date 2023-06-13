package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.SqlMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * ClassName:TestSql
 * Package: com.atguigu.mybatis.test
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/7 - 16:31
 * @Version: v1.0
 */
public class TestSql {
    @Test
    public void testLike() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SqlMapper mapper = sqlSession.getMapper(SqlMapper.class);
        List<User> min = mapper.getUserByLike("m");
        min.forEach(System.out::println);
    }

    @Test
    public void testDeleteMore() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SqlMapper mapper = sqlSession.getMapper(SqlMapper.class);
        Integer result = mapper.deleteMore("1,2,3");
        System.out.println("result = " + result);
    }

    @Test
    public void testGetUserByTableName() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SqlMapper mapper = sqlSession.getMapper(SqlMapper.class);
        List<User> t_user = mapper.getUserByTableName("t_user");
        System.out.println("t_user = " + t_user);
    }

    @Test
    public void testInsertUser() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SqlMapper mapper = sqlSession.getMapper(SqlMapper.class);
        User user = new User(null,"李逵","123",33,'男',"443343@qq.com");
        mapper.insertUser(user);
        System.out.println("user = " + user);
    }
}
