import com.atguigu.mybatis.mapper.DynamicSqlMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:TestDynamicSql
 * Package: PACKAGE_NAME
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/9 - 15:03
 * @Version: v1.0
 */
public class TestDynamicSql {
    @Test
    public void testDynamicSql() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        List<Emp> empList = mapper.getEmpByCondition(new Emp(null,null,null,null,null));
        System.out.println("empList = " + empList);
    }

    @Test
    public void testDeleteMoreByArray() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        Integer[] eids = new Integer[]{7, 8, 9, 10};
        int i = mapper.deleteMoreByArray(eids);
        System.out.println(i);
    }

    @Test
    public void testInsertMoreByList() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        List<Emp> emps = new ArrayList<>();
        new Emp(null,"www",33,'1',"");
        emps.add(new Emp(null,"A1",22,'男',"A1@qq.com"));
        emps.add(new Emp(null,"A2",23,'女',"A2@qq.com"));
        emps.add(new Emp(null,"A3",24,'男',"A3@qq.com"));
        emps.add(new Emp(null,"A4",25,'女',"A4@qq.com"));
        int i = mapper.insertMoreByList(emps);
        System.out.println("i = " + i);
    }
}
