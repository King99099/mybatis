package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Dept;
import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.security.PrivateKey;

/**
 * ClassName:DeptMapper
 * Package: com.atguigu.mybatis.mapper
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/8 - 10:42
 * @Version: v1.0
 */
public interface DeptMapper {
    Dept getEmpAndDeptByStepTwo(@Param("did")Integer did);
    Dept getDeptEmpByDid(@Param("did") Integer did);

    Dept getDeptEmpByStep(@Param("did") Integer did);
}
