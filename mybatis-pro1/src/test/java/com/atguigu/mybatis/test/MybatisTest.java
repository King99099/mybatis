package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * ClassName:MybatisTest
 * Package: com.atguigu.mybatis.test
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/6 - 11:39
 * @Version: v1.0
 */
public class MybatisTest {
    @Test
    public void test() throws IOException {
        //读取Mybatis 核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //创建 SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //通过核心配置文件所对应的字节输入流创建工厂类SqlSessionFactory，生产SqlSession对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都必须手动提交或回滚事务
        //SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都会自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //通过代理模式创建UserMapper接口的代理实现类对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，通过调用的方法名匹配映射文件中的SQL标签，并执行标签中的SQL语句


        //int result = mapper.insertUser();
        //int result = mapper.updateUser();
       // System.out.println("影响行数:" + result);

        User user = mapper.queryUserBYId();
        System.out.println(user);
        List<User> users = mapper.queryUserByAll();
        users.forEach(System.out::println);

    }
}
