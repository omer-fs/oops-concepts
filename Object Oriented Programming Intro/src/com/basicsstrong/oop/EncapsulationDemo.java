package com.basicsstrong.oop;

class Account{
    private double balance;

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}

public class EncapsulationDemo {
    public static void main(String[] args) {

        Account acc = new Account();
        acc.setBalance(4423.32);
        double bal = acc.getBalance();

        System.out.println("Balance is : "+bal);
    }
}
