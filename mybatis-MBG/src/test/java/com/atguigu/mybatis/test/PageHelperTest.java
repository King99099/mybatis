package com.atguigu.mybatis.test;

import com.atguigu.mybatis.bean.Emp;
import com.atguigu.mybatis.mapper.EmpMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * ClassName:PageHelperTest
 * Package: com.atguigu.mybatis.test
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/15 - 10:04
 * @Version: v1.0
 */
public class PageHelperTest {
    @Test
    public void test() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //Page<Object> page = PageHelper.startPage(1, 5);
        PageHelper.startPage(10, 5);
        List<Emp> emps = mapper.selectByExample(null);
        PageInfo<Emp> page = new PageInfo<>(emps,5);
        System.out.println(page);
    }
}
