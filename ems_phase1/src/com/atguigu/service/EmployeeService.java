package com.atguigu.service;

import com.atguigu.bean.Employee;

public class EmployeeService {
    //声明一个数组，用来存储添加的“员工”对象
    private Employee[] employees = new Employee[5];//可以存5个员工对象
    //声明一个int类型变量，记录当前员工对象的“个数”
    private int total;//默认值是0

    /*

public boolean addEmployee(Employee emp)
public boolean removeEmploee(int index)
public Employee[] getAllEmployees()
public Employee getEmployee(int index)

     */
    //添加一个员工对象到数组中
    public boolean addEmployee(Employee emp){
        if(total >= employees.length){//数组满了，就不能存了
            System.out.println("数组已满，无法添加");
            return false;
        }
//        employees[下标] = emp;
        employees[total++] = emp;
        return true;
    }

    //返回所有已添加的员工对象
    public Employee[] getAllEmployees(){
//        return employees;//直接返回employees数组
        /*
        创建一个新数组，长度为total，
        然后把employees数组中的total个员工对象复制到新数组中。
         */
        Employee[] all = new Employee[total];
        /*
        i<total
        i<all.length
        i<employees.length（不对）
         */
        for(int i=0; i<total; i++){
            all[i] = employees[i];
        }
        return all;
    }
}
