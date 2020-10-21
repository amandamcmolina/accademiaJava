package com.dealership.entity.employee;

public class Seller extends Employee{

    private String type = "seller";
    private int password;
    public Seller(String name, String cpf, int number, int password) {
        super(name, cpf, number);
        this.password = password;
    }

    public String getType(){
        return this.type;
    }

    @Override
    public boolean getChecked() {
        return super.checked = true;
    }

}
