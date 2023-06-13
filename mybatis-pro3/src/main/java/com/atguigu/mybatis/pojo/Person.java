package com.atguigu.mybatis.pojo;

/**
 * ClassName:Person
 * Package: com.atguigu.mybatis.pojo
 * Description :
 *
 * @Author: zlf
 * @Create 2023/6/9 - 10:44
 * @Version: v1.0
 */
public class Person {
    private Integer eid;
    private String empName;
    private Integer age;
    private Character sex;
    private String email;


    private Department dept;

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public Person() {
    }

    public Person(Integer eid, String empName, Integer age, Character sex, String email) {
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
