package com.bank.entity;

abstract class Account {
    private int account;
    protected double amount;
    private String name;

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(double amount) {
        this.amount += amount;
    }

    abstract public void withdraw(double amount);

    public void accountIncome() {
        this.amount *= 0.7;
    }

    public void transfer(double amount, Account account) {
        if (this.amount > amount) {
            withdraw(amount);
            account.deposit(amount);
        } else {
            System.out.println("bateu");
        }
    }

    @Override
    public String toString() {
        return "Conta: " + this.account + "\n" + "Saldo: " + this.amount + "\n" + "Nome: " + this.name;
    }


    public String printAllAccountInfo() {
        String info = "Name: " + this.name;
        info += "\nAccount number: " + this.account;
        info += "\nAmount: R$" + this.amount;

        return info;
    }

}
