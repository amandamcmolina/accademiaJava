package com.dealership.entity.employee;

public class Manager extends Employee{


    private String type = "manager";

    public Manager(String name, String cpf, int number, int password) {
        super(name, cpf, number);
        this.password = password;
    }


    public String getType(){
        return this.type;
    }


}
