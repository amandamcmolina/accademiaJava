package com.bank.entity;

import com.bank.entity.Account;

public class SavingsAccount extends Account {
    public String getType() {
        return "SavingAccount";
    }

    @Override
    public void withdraw(double amount) {
        if (this.amount > amount) {
            this.amount = this.amount + 0.10 - amount;
        } else {
            System.out.println("bateu");
        }
    }
}
