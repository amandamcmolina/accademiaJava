package com.arrays;

import java.util.Arrays;

public class TestaArraySplit {
    public static void main(String[] args) {
        String text = "Socorram-me, subi no ônibus em Marrocos";
        String[] textArray = text.split(" ");
        System.out.println(Arrays.toString(textArray));

        String[] nova = new String[textArray.length];
        for(int i= 0; i< textArray.length; i++){
            nova[i] = textArray[textArray.length - 1 - i];
        }
        System.out.println(Arrays.toString(nova));

        String fraseFinal = String.join(" ", nova);
        System.out.println(fraseFinal);
    }
}
