package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName:EmpMapper
 * Package: com.atguigu.mybatis.mapper
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/8 - 10:42
 * @Version: v1.0
 */
public interface EmpMapper {
    List<Emp> getAllEmp();

    List<Emp> getDeptEmpByStepTwo(@Param("did")Integer did);

    Emp getEmpAndDeptByEid(@Param("eid")Integer eid);

    Emp getEmpAndDeptByStepOne(@Param("eid")Integer eid);
}
