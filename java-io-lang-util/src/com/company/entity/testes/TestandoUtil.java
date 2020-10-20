package com.company.entity.testes;

import com.company.entity.pessoas.Pessoa;

import java.util.ArrayList;

public class TestandoUtil {

    public static void main(String[] args) {
        ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Amanda");
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Larissa");
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Artur");
        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Cely");

        lista.add(pessoa);
        lista.add(pessoa1);
        lista.add(pessoa2);
        lista.add(pessoa3);
        System.out.println(lista.size());
        System.out.println(lista.get(1));
        Pessoa pessoaNome = (Pessoa) lista.get(1);
        System.out.println(pessoaNome.getNome());

        /*lista.remove(0);
        System.out.println(lista.size());*/

        for(int i = 0; i < lista.size(); i++){
            Pessoa novaPessoa1 = lista.get(i);
            System.out.println(novaPessoa1.getNome());
        }

        System.out.println("----------------");
//        for(Object o : lista){
//            System.out.println(o);
//
//        }

        for(Pessoa o : lista){
            System.out.println(o);
        }

        ArrayList novaLista = new ArrayList();

        int numero = 2;
        String nome = "b";
        novaLista.add(numero);
        novaLista.add(nome);

        System.out.println(novaLista.get(0));
        String novo = (String) novaLista.get(1);
        System.out.println(novo);

        String nomeExemplo = "Amanda";
        System.out.println(nomeExemplo);


    }
}
