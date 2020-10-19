package com.company.pessoas;

public class GuardadorDePessoas {

    private Pessoa[] referencias;
    private int posicaoLivre;
    private int total = 0;

    public GuardadorDePessoas(){
        this.referencias = new Pessoa[10];
        this.posicaoLivre = 0;
        this.total++;
    }

    public void adiciona(Pessoa pessoa){
        this.referencias[posicaoLivre] = pessoa;
        this.posicaoLivre++;
    }

    public int quantidadeDeElementos() {
        return this.posicaoLivre;
    }

    public Pessoa getReferencia(int i) {
        return this.referencias[i];
    }
}
