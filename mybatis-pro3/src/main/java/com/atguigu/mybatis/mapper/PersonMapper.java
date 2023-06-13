package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Person;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName:PersonMapper
 * Package: com.atguigu.mybatis.mapper
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/9 - 10:49
 * @Version: v1.0
 */
public interface PersonMapper {
    Person getPersonById(@Param("eid")Integer eid);
}
