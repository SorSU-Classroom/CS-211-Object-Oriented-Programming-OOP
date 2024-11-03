package com.oop.BankSystem;

public class SavingsAccount extends Account {
    private double minimumBalance;
    private double interestRate;

    public SavingsAccount(Customer customer, int accountNumber, double balance, double minimumBalance,
            double interestRate) {
        super(customer, accountNumber, balance);
        this.minimumBalance = minimumBalance;
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}