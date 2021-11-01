package com.basicsstrong.oop;

class A{

}
//single inheritance
class B extends A{

}
//Multilevel inheritance
class C extends B{

}

//Multiple
interface AA {
    default void method() {
        System.out.println("Method of AA");
    }
}

interface AAA {
    default void method() {
        System.out.println("Method of AAA");
    }
}

class BB extends A implements AA,AAA {
    @Override
    public void method() {
        AA.super.method();
    }
}


//Hierarchical Inheritance
// Single parent more than one child

//Hybrid: Multiple Inheritance + multilevel Inheritance

//Cyclic Inheritance, if a class extends itself its is cyclic
// A extends B and B extends A
// Cyclic Inheritance is not available in java

public class InheritenceDemo {
    public static void main(String[] args) {

    }
}
