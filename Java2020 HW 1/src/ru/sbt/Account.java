package ru.sbt;

public class Account {
    private final long id;
    private double balance;

    public Account(long id) {

        this.id = id;
        this.balance = 0;
    }

    /**
     * Withdraws money from account balance
     *
     * @param amount amount of money to withdraw
     * @return true
     * if amount &gt 0 and (balance - amount) &gt 0,
     * otherwise returns false
     */
    public boolean withdraw(double amount) {
        if (this.balance <= amount){
            return false;
        }
        else if (amount < 0){
            System.out.println("Invalid value!");
            return false;
        }
        else {
            this.balance -= amount;
        }
        return true;
    }

    /**
     * Adds money to account balance
     *
     * @param amount amount of money to add on account
     * @return true if amount &gt 0, otherwise returns false
     */
    public boolean add(double amount) {
        if (amount < 0){
            System.out.println("Invalid value!");
            return false;
        }
        else {
            balance += amount;
        }
        return true;
    }
}