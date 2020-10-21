package com.javaIo;

import java.io.*;

public class TesteLeituraSimplificando {
    public static void main(String[] args) throws IOException {
        //Fluxo de Entrada com Arquivo
        InputStream fis = new FileInputStream("textoTeste.txt"); //entrada
        Reader isr = new InputStreamReader(fis); //bytes em caracteres
        BufferedReader br = new BufferedReader(isr); //Quarda todos os caracteres de uma linha em Buffer
        String line = br.readLine(); //leio 1 linha

        while( line != null){
            System.out.println(line);
            line = br.readLine();
        }


        br.close();

    }
}
