package com.company;

public class AccountManager {
    private  double balance;

    public void deposit(double amount){
        setBalance(getBalance() + amount);
    }
    public void withdraw(double amount) throws BalanceInsufficientException {
        if (balance >= amount){
            setBalance(getBalance() - amount);
        } else{
            throw new BalanceInsufficientException("Insufficient fund.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
