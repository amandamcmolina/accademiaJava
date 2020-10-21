package com.arrays;

import java.util.Arrays;

public class Bank {
    private String nome;
    private int numero;
    private Account[] contas = new Account[10];
    public int posicao = 0;

    public void adiciona(Account conta) {

            contas[posicao] = conta;
            posicao++;

    }

    public Account[] getContas() {
        return contas;
    }

    public void setContas(Account[] contas) {
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String mostraContas(){
        String texto = "";
        for(Account conta: contas){
            if(conta != null){
                texto = texto.concat(conta.toString() + "\n");
            }
        }
        return texto;
    }
}
