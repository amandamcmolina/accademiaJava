package com.set;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TesteMap {
    public static void main(String[] args) {
        System.out.println("------1------");
            Map<String, String> nomes = new HashMap<>();
            nomes.put("Amanda", "Molina");
            nomes.put("Larissa", "Costa");
            System.out.println(nomes);


        System.out.println("\n------2------");
            System.out.println(nomes.size());


        System.out.println("\n------3------");
            Map<String, String> otherNames = new HashMap<>();
            otherNames.putAll(nomes);
            System.out.println(otherNames);


        System.out.println("\n------4------");
            otherNames.clear();
            System.out.println(otherNames);

        System.out.println("\n------5------");
            Map<String, String> names = new HashMap<>();
            names.put("Amanda", "Molina");
            names.put("Larissa", "Costa");
            System.out.println(names.isEmpty());

        System.out.println("\n------6------");
            

        System.out.println("\n------7------");
            System.out.println(names.containsKey("Amanda"));

        System.out.println("\n------8------");
            System.out.println(names.containsValue("Costa"));


        System.out.println("\n------9------");
            names.forEach((key, value) -> {
                System.out.println("Nome: " + key + "\nSobrenome: " + value);
            });

        System.out.println("\n------10------");
            System.out.println(names.get("Amanda"));

        System.out.println("\n------11------");
            for(String key : names.keySet()){
                System.out.println(key);
            }

        System.out.println("\n------12------");
            System.out.println(names);
    }
}
