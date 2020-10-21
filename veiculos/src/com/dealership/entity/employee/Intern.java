package com.dealership.entity.employee;

public class Intern extends Employee implements ValidacaoPassword {

    private String type = "intern";
//    private boolean result;
    public Intern(String name, String cpf, int number) {
        super(name, cpf, number);
    }

    public String getType(){
        return this.type;
    }

    @Override
    public boolean validation(Employee funcionario, int pass) {
        if(pass == funcionario.getPassword()){
            return super.checked = true;
        }
        return super.checked = false;
    }


}
