package com.company.entity.testes;

import com.company.entity.pessoas.Pessoa;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestandoLinkedList {

    public static void main(String[] args) {
        LinkedList<Pessoa> lista = new LinkedList<>();

       Pessoa pessoa = new Pessoa();
       pessoa.setNome("Amanda");

       Pessoa pessoa2 = new Pessoa();
       pessoa2.setNome("Amanda");
       lista.add(pessoa2);

       boolean existe1 = lista.contains(pessoa);
        System.out.println(existe1);

       for(Object o : lista){
           System.out.println(o);
       }

        boolean existe = lista.equals(pessoa);
        System.out.println(existe);



    }
}
