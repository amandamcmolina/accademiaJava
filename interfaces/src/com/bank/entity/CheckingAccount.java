package com.bank.entity;

public class CheckingAccount extends Account implements Taxable{

    public String getType(){
        return "CheckingAccount";
    }

    @Override
    public void withdraw(double amount) {
        if (this.amount > amount) {
            this.amount = this.amount + 0.10 - amount;
        } else {
            System.out.println("bateu");
        }
    }

    @Override
    public double getTaxes() {
        return this.amount * 1.01;
    }
}
