package com.atguigu.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName:SqlSessionUtil
 * Package: com.atguigu.mybatis.utils
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/7 - 11:25
 * @Version: v1.0
 */
public class SqlSessionUtil {
    public static SqlSession getSqlSession() throws IOException {
        InputStream rs = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(rs);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        return sqlSession;
    }
}
