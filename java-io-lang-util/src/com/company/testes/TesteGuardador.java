package com.company.testes;

import com.company.pessoas.GuardadorDePessoas;
import com.company.pessoas.Pessoa;

public class TesteGuardador {
    public static void main(String[] args) {
        GuardadorDePessoas guardador = new GuardadorDePessoas();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Amanda");
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Larissa");

        guardador.adiciona(pessoa);
        guardador.adiciona(pessoa1);

        int total = guardador.quantidadeDeElementos();
        System.out.println(total);

        Pessoa ref = guardador.getReferencia(0);
        System.out.println(ref.getNome());

    }
}
