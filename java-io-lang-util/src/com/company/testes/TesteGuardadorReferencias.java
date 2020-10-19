package com.company.testes;

import com.company.pessoas.GuardadorDePessoas;
import com.company.pessoas.GuardadorDeReferencias;
import com.company.pessoas.Pessoa;

public class TesteGuardadorReferencias {
    public static void main(String[] args) {
        GuardadorDeReferencias guardador = new GuardadorDeReferencias();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Amanda");
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Larissa");

        guardador.adiciona(pessoa);
        guardador.adiciona(pessoa1);

        int total = guardador.quantidadeDeElementos();
        System.out.println(total);

        Pessoa ref = (Pessoa) guardador.getReferencia(0);
        System.out.println(ref.getNome());

    }
}
