package com.company.entity.testes;

import com.company.entity.pessoas.Pessoa;
import com.company.entity.pessoas.PessoaFisica;

import java.util.*;

public class TesteOrdenacao {
    public static void main(String[] args) {
        Pessoa p1 = new PessoaFisica();
        p1.setNome("Amanda");
        p1.setIdade(26);

        Pessoa p2 = new PessoaFisica();
        p2.setNome("Larissa");
        p2.setIdade(24);

        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(p1);
        pessoas.add(p2);


        pessoas.sort(new CompararPorIdade());
        System.out.println(pessoas);

        Collections.sort(pessoas);


        int[] numeros = new int[]{43, 15, 64, 22, 89};
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
    }
}

class CompararPorIdade implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return  o1.getIdade() - o2.getIdade();
    }
}
