import com.atguigu.mybatis.mapper.DynamicSqlMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
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
        List<Emp> empList = mapper.getEmpByCondition(new Emp(null,"张三",22,null,null));
        System.out.println("empList = " + empList);
    }
}
