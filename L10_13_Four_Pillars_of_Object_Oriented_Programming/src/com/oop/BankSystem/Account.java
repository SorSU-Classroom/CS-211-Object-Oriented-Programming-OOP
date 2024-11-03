package com.oop.BankSystem;

public class Account {
    private int accountNumber;
    private double balance;
    private Customer customer;

    public Account(Customer customer, int accountNumber, double balance) {
        this.customer = customer;
        this.accountNumber = accountNumber;
        this.balance = balance;
        customer.addAccount(this);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
