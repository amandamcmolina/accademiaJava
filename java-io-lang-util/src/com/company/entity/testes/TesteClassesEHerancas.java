package com.company.entity.testes;

import com.company.entity.pessoas.Pessoa;
import com.company.entity.pessoas.PessoaFisica;
import org.w3c.dom.ls.LSOutput;

public class TesteClassesEHerancas {
    public static void main(String[] args) {
        Pessoa pf = new PessoaFisica();
        pf.setNome("Amanda");
        System.out.println(pf);
        System.out.println("-----");
        PessoaFisica pff =  (PessoaFisica) pf;
        pff.setEstadoCivil("Solteira");
        System.out.println(pff.getEstadoCivil());

        System.out.println(pff);


    }


}
