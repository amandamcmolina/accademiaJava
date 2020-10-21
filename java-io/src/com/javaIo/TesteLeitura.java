package com.javaIo;

import java.io.*;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {
        //Fluxo de Entrada com Arquivo
        FileInputStream fis = new FileInputStream("textoTeste.txt"); //entrada
        InputStreamReader isr = new InputStreamReader(fis); //bytes em caracteres
        BufferedReader br = new BufferedReader(isr); //Quarda todos os caracterer de uma linha em Buffer
        String line = br.readLine(); //leio 1 linha

        while( line != null){
            System.out.println(line);
            line = br.readLine();
        }


        br.close();

    }
}
