package com.atguigu.mybatis.pojo;

import java.util.List;

/**
 * ClassName:Department
 * Package: com.atguigu.mybatis.pojo
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/9 - 10:45
 * @Version: v1.0
 */
public class Department {
    private Integer did;
    private String deptName;
    private List<Person> personList;

    public Department() {
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public String toString() {
        return "Department{" +
                "did=" + did +
                ", deptName='" + deptName + '\'' +
                ", personList=" + personList +
                '}';
    }
}
