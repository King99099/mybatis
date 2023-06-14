import com.atguigu.mybatis.mapper.CacheMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName:TestCacheMapper
 * Package: PACKAGE_NAME
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/14 - 15:02
 * @Version: v1.0
 */
public class TestCacheMapper {
    /**
     * 测试一级缓存   范围:SqlSession
     * @throws IOException
     */
    @Test
    public void testOneCache() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Emp emp1 = mapper.getEmpById(1);
        System.out.println("emp1 = " + emp1);
        sqlSession.clearCache();

        Emp emp2 = mapper.getEmpById(1);
        System.out.println("emp2 = " + emp2);
    }

    /***
     * 测试二级缓存 范文 SqlSessionFactory
     * @throws IOException
     */
    @Test
    public void testTwoCache()  {
        try {
            InputStream rs = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(rs);
            SqlSession sqlSession1 = sqlSessionFactory.openSession(true);
            CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
            Emp emp1 = mapper1.getEmpById(1);
            System.out.println("emp1 = " + emp1);
            //mapper1.insertEmp(new Emp(null,"SDFSADF",22,'A',"24234@qq.com"));
            sqlSession1.close();
            SqlSession sqlSession2 = sqlSessionFactory.openSession(true);
            CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
            Emp emp2 = mapper2.getEmpById(1);
            System.out.println("emp2 = " + emp2);
            sqlSession2.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
