package com.set;

import java.util.*;

public class TesteSet {
    public static void main(String[] args) {
        System.out.println("-------1-------");
            Set<String> nomes = new HashSet<String>();
            nomes.add("Amanda");
            System.out.println(nomes);
            nomes.add("Larissa");
        System.out.println(nomes);


        System.out.println("\n-------2-------");
            for(String nome: nomes){
                System.out.println(nome);
            }


        System.out.println("\n-------3-------");
            System.out.println(nomes.size());


        System.out.println("\n-------4-------");
            nomes.clear();
            System.out.println(nomes);


        System.out.println("\n-------5-------");
            boolean vazio = nomes.isEmpty();
        System.out.println(vazio);


        System.out.println("\n-------6-------");
            Set<Integer> numeros = new HashSet<Integer>();
            numeros.add(1);
            numeros.add(2);
            numeros.add(3);
            Set<Integer> outrosNumeros = new HashSet<Integer>();
            outrosNumeros.addAll(numeros);
            System.out.println(outrosNumeros);
            System.out.println(numeros.containsAll(outrosNumeros));

        System.out.println("\n-------7-------");
            numeros.toArray();
            System.out.println(numeros);


        //System.out.println("\n-------8-------");


        System.out.println("\n-------9-------"); ///COMO?

//            List lista2 = new ArrayList();
//            for(Integer numero: numeros){
//                lista2.add(numero);
//            }
//            System.out.println(lista2);

            //ou

            List novo = new ArrayList(numeros);
            System.out.println(novo);




        System.out.println("\n-------10-------");
        Set<String> colors = new HashSet<String>();
        Set<String> otherColors = new HashSet<String>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("red");
        otherColors.add("purple");
        otherColors.add("red");
        otherColors.add("green");
        boolean comparador = colors.containsAll(otherColors);
        System.out.println(comparador);


        System.out.println("\n-------11-------");
        colors.retainAll(otherColors);
        System.out.println(colors);

        System.out.println("\n-------12-------");
        otherColors.removeAll(otherColors);
        System.out.println(otherColors);
        System.out.println(otherColors.isEmpty());



    }
}
