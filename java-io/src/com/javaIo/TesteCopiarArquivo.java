package com.javaIo;

import java.io.*;

public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream("textoTeste.txt"); //entrada
        Reader isr = new InputStreamReader(fis); //bytes em caracteres
        BufferedReader br = new BufferedReader(isr); //Quarda todos os caracteres de uma linha em Buffer

        OutputStream fos = new FileOutputStream("textoTeste2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);


        String line = br.readLine(); //leio 1 linha

        while( line != null){
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }


        br.close();
        bw.close();
    }
}
