package com.dealership.entity.employee;

public class Employee {
    private String name;
    private String cpf;
    private int number;
    private String type;
    protected int password;
    protected boolean checked;

    public Employee(String name, String cpf, int number){
        this.name = name;
        this.cpf = cpf;
        this.number = number;
    }

    public boolean getChecked() {
        return this.checked;
    }

    public void setChecked(boolean validacao){
        this.checked = validacao;
    }

    public int getPassword() {
        return password;
    }

    public String getType() {
        return type;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString(){
        return "Nome: " + this.name +
                "\ncpf: " + this.cpf +
                "\nnúmero de registro: " + this.number;
    }

}
