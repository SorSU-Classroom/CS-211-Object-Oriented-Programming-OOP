package com.oop.BankSystem;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(Customer customer, int accountNumber, double balance, double overdraftLimit) {
        super(customer, accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}
