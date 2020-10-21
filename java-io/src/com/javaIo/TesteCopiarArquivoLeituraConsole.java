package com.javaIo;

import java.io.*;

public class TesteCopiarArquivoLeituraConsole {
    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream("TextoTeste.txt"); //entrada
        Reader isr = new InputStreamReader(fis); //bytes em caracteres
        BufferedReader br = new BufferedReader(isr); //Quarda todos os caracteres de uma linha em Buffer

        OutputStream fos = System.out;
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);


        String line = br.readLine(); //leio 1 linha

        while( line != null && !line.isEmpty()){
            bw.write(line);
            bw.newLine();
            bw.flush();//saída enquanto escreve
            line = br.readLine();
        }


        br.close();
        bw.close();
    }
}
