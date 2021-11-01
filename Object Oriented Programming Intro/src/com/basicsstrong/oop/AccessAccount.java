package com.basicsstrong.oop;

class bankAccount{
    private double balance = 10000;
    private String username = "basicsstrong";
    private String password = "password";

    public double getWalletBalance(String username, String password) {
        if(this.username.equals(username) && this.password.equals(password)) {
            return balance;
        }
        else
            return 0;
    }
}
public class AccessAccount {
    public static void main(String[] args) {
        bankAccount acc = new bankAccount();
        double bal = acc.getWalletBalance("basicsstrong","password");
        System.out.println("Balance is : "+bal);
    }
}
