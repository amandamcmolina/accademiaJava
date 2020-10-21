package com.arrays;

import java.util.Arrays;

public class Grid {
    public static void main(String[] args) {
        int[] numeros = {323, 3, 4, 345, 12, 433, 9};
        int numero = 1;

        int[] novoArray = new int[numeros.length + 1];
        for(int i= 0; i < novoArray.length; i++){
            if(i == 0){
                novoArray[i] = numero;
            }else{
                novoArray[i] = numeros[i - 1];
            }
        }
        System.out.println(Arrays.toString(novoArray));

        int[] numeros2 = {2, 3, 3, 4, 5, 5, 2};
        int[] array = new int[5];
        int[] array2 = new int[5];
//        for(int i = 0; i < numeros2.length; i++){
//            if(arrays.asList(array).contains(numeros2[i]))
//        }
        


    }

}
