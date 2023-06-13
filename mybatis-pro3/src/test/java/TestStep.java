import com.atguigu.mybatis.mapper.DepartmentMapper;
import com.atguigu.mybatis.mapper.PersonMapper;
import com.atguigu.mybatis.pojo.Department;
import com.atguigu.mybatis.pojo.Person;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;

/**
 * ClassName:TestStep
 * Package: PACKAGE_NAME
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/9 - 10:54
 * @Version: v1.0
 */
public class TestStep {
    @Test
    public void testGetPersonById() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
        Person person = mapper.getPersonById(1);
        System.out.println(person.getEmpName());

    }

    @Test
    public void testGetDeptById() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DepartmentMapper mapper = sqlSession.getMapper(DepartmentMapper.class);
        Department department = mapper.getDeptById(1);
        System.out.println(department);
    }
}
