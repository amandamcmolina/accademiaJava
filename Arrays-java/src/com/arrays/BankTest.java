package com.arrays;

import java.util.Arrays;

public class BankTest {
    public static void main(String[] args) {
        Bank banco = new Bank();
        Account conta1 = new Account();
        Account conta2 = new Account();
        conta1.setAmount(200);
        conta1.setTitutlar("Amanda");
        conta2.setTitutlar("Larissa");
        conta2.setAmount(200);
        banco.adiciona(conta1);
        banco.adiciona(conta2);
        banco.getContas();
        System.out.println(Arrays.toString(banco.getContas()));
        System.out.println(banco.mostraContas());

    }


}
