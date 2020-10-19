package com.company.pessoas;

public class GuardadorDeReferencias {

    private Object[] referencias;
    private int posicaoLivre;
    private int total = 0;

    public GuardadorDeReferencias(){
        this.referencias = new Object[10];
        this.posicaoLivre = 0;
        this.total++;
    }

    public void adiciona(Object ref){
        this.referencias[posicaoLivre] = ref;
        this.posicaoLivre++;
    }

    public int quantidadeDeElementos() {
        return this.posicaoLivre;
    }

    public Object getReferencia(int i) {
        return this.referencias[i];
    }
}
