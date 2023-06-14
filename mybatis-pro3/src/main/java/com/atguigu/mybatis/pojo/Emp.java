package com.atguigu.mybatis.pojo;

import java.io.Serializable;

/**
 * ClassName:Emp
 * Package: com.atguigu.mybatis.pojo
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/8 - 10:39
 * @Version: v1.0
 */
public class Emp implements Serializable {
    private Integer eid;
    private String empName;
    private Integer age;
    private Character sex;
    private String email;


    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Emp(Object o, String a1, int i, char 男, String s, Object o1) {
    }

    public Emp(Integer eid, String empName, Integer age, Character sex, String email) {
        this.eid = eid;
        this.empName = empName;
        this.age = age;
        this.sex = sex;
        this.email = email;

    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                ", dept=" + dept +
                '}';
    }
}
