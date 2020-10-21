package com.arrays;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        Account[] contas = new Account[10];
        for(int i = 0; i < contas.length; i++){
            Account conta = new Account();
            conta.setAmount(100 * i);
            contas[i] = conta;
        }

        double saldoTotal = 0;
        for(Account conta: contas){
            saldoTotal += conta.getAmount();
        }
        double media = saldoTotal / contas.length;
        System.out.println(media);


    }

}
