package com.atguigu.bean;

/*
姓名：张三
性别：男
年龄：30
工资：8000
电话：010-56253825
邮箱：zhang@abc.com

 */
public class Employee {
    private String name;
    private char gender;
    private int age;
    private double salary;
    private String tel;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfo(){
        return name +"\t" + gender +"\t" + age +"\t" + salary + "\t" + tel + "\t" + email;
    }
}
