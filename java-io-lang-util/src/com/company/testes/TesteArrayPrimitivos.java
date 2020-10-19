package com.company.testes;

public class TesteArrayPrimitivos {
    public static void main(String[] args) {
        int[] idades = new int[5];
        idades[0] = 3;


        System.out.println(idades[0]);
        System.out.println(idades.length);
        System.out.println("amanda".length());

        for(int i = 0 ; i < idades.length; i++){
            System.out.println(idades[i]);
        }
    }
}
