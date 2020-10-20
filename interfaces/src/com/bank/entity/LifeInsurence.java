package com.bank.entity;

public class LifeInsurence implements Taxable{
    private double value;
    private CheckingAccount owner;
    private int insurenceNumber;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public CheckingAccount getOwner() {
        return owner;
    }

    public void setOwner(CheckingAccount owner) {
        this.owner = owner;
    }

    public int getInsurenceNumber() {
        return insurenceNumber;
    }

    public void setInsurenceNumber(int insurenceNumber) {
        this.insurenceNumber = insurenceNumber;
    }

    public String getType(){
        return "Conta corrente seguro";
    }

    @Override
    public double getTaxes() {
        return 42 + this.value * 0.02;
    }
}
