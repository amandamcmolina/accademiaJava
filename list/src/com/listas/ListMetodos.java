package com.listas;

import java.util.*;

public class ListMetodos {
    public static void main(String[] args) {
        System.out.println("----1.0-----");
        java.util.List<String> colors = new ArrayList<String>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("red");

        System.out.println(colors.toString());

        System.out.println("\n----2.0-----");
//        for(String color: colors){
//            System.out.println(color);
//        }

        colors.forEach((color) -> System.out.println(color));

        System.out.println("\n----3.0-----");
        java.util.List vetores = new Vector();
        vetores.add(1);
        vetores.add(2);
        vetores.add(0, 5);
        vetores.forEach((vetor) -> System.out.println(vetor));


        System.out.println("\n----4.0-----");
        java.util.List<String> nomes = new ArrayList<String>();
        nomes.add("Amanda");
        nomes.add("Larissa");
        nomes.add("Artur");

        System.out.println(nomes.get(2));

        System.out.println("\n----5.0-----");
        java.util.List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        java.util.List<Integer> novaLista= new ArrayList<Integer>();
        for(int i =0; i < numeros.size(); i++){
            if( i != 2){
                novaLista.add(numeros.get(i));
            }else{
                novaLista.add(1000);
            }
        }
        novaLista.forEach((numero) -> System.out.println(numero));

        System.out.println("\n----6.0-----");
        numeros.remove(1);
        System.out.println(numeros);

        System.out.println("\n----7.0-----");
        System.out.println(colors.contains("blue"));

        System.out.println("\n----8.0-----");
        Collections.sort(colors);
        System.out.println(colors);

        System.out.println("\n----9.0-----");
        java.util.List<Integer> lista1 = new ArrayList<Integer>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);
        lista1.add(5);
        java.util.List<Integer> lista2 = new ArrayList<Integer>();
        //opcao1
//        lista1.forEach((numero) -> lista2.add(numero));
//        System.out.println(lista2);
        //opcao2
        lista2.addAll(0, lista1);
        System.out.println(lista2);


        System.out.println("\n----10.0-----");
        Collections.shuffle(lista2);
        System.out.println(lista2);

        System.out.println("\n----11.0-----");
        List<String> names = new Vector<String>();
        names.add("Amanda");
        names.add("Larissa");
        names.add("Artur");
        Collections.reverse(names);
        System.out.println(names);//estava em odem alfabética antes


        System.out.println("\n----12.0-----");
        List<Integer> idades = new ArrayList<Integer>();
        idades.add(20); //0
        idades.add(25); //1
        idades.add(30); //2
        idades.add(35); //3
        idades.add(40); //4
        System.out.println(idades.subList(1,3)); //pega a posição 1, mas para antes da posicão 3



        System.out.println("\n----13.0-----");
        List<Integer> comp1 = new ArrayList<Integer>();
        comp1.add(1);
        comp1.add(2);
        comp1.add(3);
        comp1.add(4);
        comp1.add(5);
        List<Integer> comp2 = new ArrayList<Integer>();
        comp2.add(1);
        comp2.add(2);
        comp2.add(3);
        comp2.add(4);
        comp2.add(5);
        System.out.println(comp1.containsAll(comp2));

        System.out.println("\n----14.0-----");





        System.out.println("\n----15.0-----");
        comp1.addAll(comp2);
        System.out.println(comp1);



        System.out.println("\n----16.0-----");
//        List<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);
//        List<Integer> numbers2 = new ArrayList<Integer>();
//        Collections.copy(numbers, numbers2);
//        System.out.println(numbers2);

       










    }
}
