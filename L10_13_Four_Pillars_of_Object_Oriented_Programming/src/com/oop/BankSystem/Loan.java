package com.oop.BankSystem;

public class Loan {
    private int loanNumber;
    private double principalAmount;
    private double interestRate;
    private Bank bank;
    private Customer customer;

    public Loan(Bank bank, Customer customer, int loanNumber, double principalAmount, double interestRate) {
        this.bank = bank;
        this.customer = customer;
        this.loanNumber = loanNumber;
        this.principalAmount = principalAmount;
        this.interestRate = interestRate;
        bank.addLoan(this);
        customer.addLoan(this);
    }

    public double calculateInterest() {
        return principalAmount * interestRate / 100;
    }

    public int getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(int loanNumber) {
        this.loanNumber = loanNumber;
    }

    public double getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(double principalAmount) {
        this.principalAmount = principalAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
