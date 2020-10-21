package com.arrays;

public class Account {
    private int number;
    private String Titutlar;
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitutlar() {
        return Titutlar;
    }

    public void setTitutlar(String titutlar) {
        Titutlar = titutlar;
    }

    @Override
    public String toString(){
        return "nome: " + this.getTitutlar() + "\nsaldo: " + this.amount;
    }
}
