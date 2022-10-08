package com.atguigu.view;

import com.atguigu.bean.Employee;
import com.atguigu.service.EmployeeService;
import com.atguigu.util.EMSUtility;

/*
EmployeeView复制界面的展示和调度
 */
public class EmployeeView {
    private EMSUtility ems = new EMSUtility();
    private EmployeeService es = new EmployeeService();

    public void enterMainMenu(){
        while(true){
            System.out.println("-----------------员工信息管理-----------------");

            System.out.println("\t\t1 添加员工");
            System.out.println("\t\t2 修改员工");
            System.out.println("\t\t3 删除员工");
            System.out.println("\t\t4 员工列表");
            System.out.println("\t\t5 退  出");
            System.out.print("请选择(1-5)：");
            //读菜单选择
            char select = ems.readMenuSelection();
            switch (select){
                case '1':
                    addNewEmployee();
                    break;
                case '2':
                    modifyEmployee();
                    break;
                case '3':
                    deleteEmployee();
                    break;
                case '4':
                    listAllEmployees();
                    break;
                case '5':
                    System.out.print("是否真的退出(Y/N)?");
                    char confirm = ems.readConfirmSelection();
                    if(confirm == 'Y') {
                        return;
                    }
            }
        }
    }

    private void addNewEmployee(){
        System.out.println("---------------------添加员工---------------------");
        System.out.print("姓名：");
        String name = ems.readString(20);//20这里表示名字不超过20个字符

        System.out.print("性别：");
        char gender = ems.readChar();

        System.out.print("年龄：");
        int age = ems.readInt();

        System.out.print("工资：");
        double salary = ems.readDouble();

        System.out.print("电话：");
        String tel = ems.readString(13);//13表示电话或手机号码不超过13个字符

        System.out.print("邮箱：");
        String email = ems.readString(32);

        //把键盘输入的每一项信息，赋值给员工对象的属性
        Employee emp = new Employee();
        emp.setName(name);
        emp.setGender(gender);
        emp.setAge(age);
        emp.setSalary(salary);
        emp.setTel(tel);
        emp.setEmail(email);

        //把员工对象添加到EmployeeService类的数组中
//        EmployeeService es = new EmployeeService();
        es.addEmployee(emp);

        System.out.println("---------------------添加完成---------------------");
    }

    private void modifyEmployee (){
        System.out.println("EmployeeView.modifyEmployee");
    }
    private void deleteEmployee (){
        System.out.println("EmployeeView.deleteEmployee");
    }
    private void listAllEmployees(){
        //从EmployeeService类中获取到所有已添加的员工对象，然后遍历
//        EmployeeService es = new EmployeeService();
        Employee[] allEmployees = es.getAllEmployees();
        System.out.println("----------------------------员工列表------------------------------\n");
        System.out.println("编号\t姓名\t性别\t年龄\t工资\t电话\t邮箱");
        for(int i = 0; i < allEmployees.length; i++) {
            System.out.println((i+1) + "\t" + allEmployees[i].getInfo());
        }
        System.out.println("--------------------------员工列表完成----------------------------\n");
    }




}
