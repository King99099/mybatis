import com.atguigu.mybatis.mapper.DeptMapper;
import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Dept;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * ClassName:TestRusltMap
 * Package: PACKAGE_NAME
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/8 - 10:50
 * @Version: v1.0
 */
public class TestResultMap {

    @Test
    public void testGetAllEmp() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> allEmp = mapper.getAllEmp();
        allEmp.forEach(System.out::println);
    }
    @Test
    public void getEmpAndDeptByEid() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empAndDeptByEid = mapper.getEmpAndDeptByEid(1);
        System.out.println("empAndDeptByEid = " + empAndDeptByEid);
    }

    @Test
    public void getEmpAndDeptByStep() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDeptByStepOne(2);
        System.out.println("emp = " + emp);
    }

    @Test
    public void getDeptEmpByDid() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptEmpByDid = mapper.getDeptEmpByDid(1);
        System.out.println(deptEmpByDid);
    }
    @Test
    public void getDeptEmpByStep() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptEmpByDid = mapper.getDeptEmpByStep(1);
        System.out.println(deptEmpByDid);
    }


}
