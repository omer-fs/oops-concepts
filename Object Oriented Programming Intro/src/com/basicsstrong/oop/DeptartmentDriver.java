package com.basicsstrong.oop;

public class DeptartmentDriver {
    public static void main(String[] args) {
        DeptOne one = new DeptOne();
        int val = one.getEmployee();
        System.out.println("Department One has employees: "+val);
        one.method();
        one.attendence();

//        PublicDemo d = new PublicDemo();
        PublicDemo.displayValue();


    }
}
