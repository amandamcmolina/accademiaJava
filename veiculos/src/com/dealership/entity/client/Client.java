package com.dealership.entity.client;

public class Client {
    private String name;
    private String cpf;
    private boolean deficient = false;

    public Client(String name, String cpf, boolean deficient){
        this.name = name;
        this.cpf = cpf;
        this.deficient = deficient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isDeficient() {
        return deficient;
    }

    public void setDeficient(boolean deficient) {
        this.deficient = deficient;
    }

    @Override
    public String toString(){
        return "Nome: " + this.name +
                "\ncpf: " + this.cpf +
                "\ndeficiente: " + this.deficient;
    }
}
