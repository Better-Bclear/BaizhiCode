package com.baizhi.jinzhanqing.classInner;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        SEmpolyee aaa = new SEmpolyee("aaa", 3);
        HEmployee bbb = new HEmployee("bbb", 10);
        HEmployee ccc = new HEmployee("ccc", 10);
        employees[0] = aaa;
        employees[1] = bbb;
        employees[2] = ccc;
        for (Employee e :
                employees) {
            if (e.getMonth() == 10)
                System.out.println(e.getName());
        }
    }
}
class Employee{
    private String name;
    private int month;

    public Employee() {
    }

    public Employee(String name, int month) {
        this.name = name;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
class SEmpolyee extends Employee{
    public SEmpolyee() {
    }

    public SEmpolyee(String name, int month) {
        super(name, month);
    }
}
class HEmployee extends Employee{
    public HEmployee() {
    }

    public HEmployee(String name, int month) {
        super(name, month);
    }
}