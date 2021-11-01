package com.basicsstrong.oop;

class Fan {
    public boolean isOn;
    public static int staticVar;

    Fan(boolean a) {
        this.isOn = a;
    }
    public void turnOn() {
        isOn = true;
        System.out.println("Fans is Spinning");
    }
    public void turnOff() {
        isOn = false;
        System.out.println("Fan has Stopped");
    }
}
public class Demo {
    public static void main(String[] args) {
        Fan myFan = new Fan(true);
        myFan.turnOn();
        myFan.turnOff();

        Fan yourFan = new Fan(false);
        yourFan.isOn = true;

        Fan.staticVar = 4;

        Addition performSum = new Addition();
        int sum = performSum.findSum(10,18);
        System.out.println("Sum is "+sum);

        int val = Addition.get();
        System.out.println("Val is "+val);

    }
}

class Addition{
    private static int val = 0;
    public int findSum(int a, int b) {
        int sum = 0;
        sum = a + b;
        return sum;
    }
    public static int get() {
        return val;
    }
}