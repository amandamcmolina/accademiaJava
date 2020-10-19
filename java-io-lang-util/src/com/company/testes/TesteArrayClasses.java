package com.company.testes;

import com.company.pessoas.Pessoa;

public class TesteArrayClasses {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Amanda");

        Pessoa[] pessoas = new Pessoa[5];
        pessoas[0] = pessoa;

        System.out.println(pessoas[0].getNome());

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("José");

        pessoas[1] = pessoa2;
        System.out.println(pessoas[1].getNome());

        for(int i = 0; i <= pessoas.length; i++){
            System.out.println(pessoas[i].getNome());
        }

        int[] refs = {1, 2, 3, 4};
    }
}
