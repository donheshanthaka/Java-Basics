package com.heshanthaka;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account(){
        this("000000", 100, "default", "default", "default");
        System.out.println("Default constructor called!");
    }

    public Account(String number, double balance, String customerName, String customerEmail, String customerPhone){
        System.out.println("Constructor with parameters called!");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. Updated balance: " + this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if (this.balance - withdrawalAmount < 0){
            System.out.println("Balance: " + this.balance + " : Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance: " + this.balance);
        }

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
