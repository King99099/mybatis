package com.atguigu.mybatis.test;

import com.atguigu.mybatis.bean.Emp;
import com.atguigu.mybatis.bean.EmpExample;
import com.atguigu.mybatis.mapper.EmpMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * ClassName:TestMBG
 * Package: com.atguigu.mybatis.test
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/15 - 9:14
 * @Version: v1.0
 */
public class TestMBG {
    @Test
    public void testMBG() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);


        //Emp emp = mapper.selectByPrimaryKey(1);
        EmpExample empExample = new EmpExample();
        empExample.createCriteria().andEidEqualTo(1).andEmpNameIsNotNull();
        empExample.or().andDidIsNotNull();
        List<Emp> emp = mapper.selectByExample(empExample);
        emp.forEach(System.out::println);
    }
}
