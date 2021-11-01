package com.basicsstrong.oop;

class Add{
    public void sum(int a, int b) {
        System.out.println("Sum is: "+(a+b));
    }
    public void sum(int a, int b, int c) {
        System.out.println(("Sum is: "+(a+b+c)));
    }
    public void sum(double a, double b) {
        System.out.println("Sum is: "+(a+b));
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        Add add = new Add();
        add.sum(1,3);
        add.sum(10,15,20);
        add.sum(10.2,3.33);
        add.sum(1.2f, 2.3f);
        //byte->short->int->long->float->double
        //              ^
        //              |
        //              char
    }
}
