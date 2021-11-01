package com.basicsstrong.oop;

public interface InterfaceDemo {
    static final String a ="static constant";

    public void m1();

    public int m2();

    static void m3() {}

    default int m4() { return 0;}
    // static and default methods we provide the implementation

    private void m5() {}

}
class Test implements InterfaceDemo{
    @Override
    public void m1() {

    }

    @Override
    public int m2() {
        return 0;
    }

}