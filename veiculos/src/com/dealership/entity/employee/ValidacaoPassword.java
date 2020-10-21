package com.dealership.entity.employee;

public interface ValidacaoPassword {

    //recebe uma senha e valida
    boolean validation(Employee funcionario, int pass);
}
