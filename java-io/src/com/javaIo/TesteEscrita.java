package com.javaIo;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {
        //Fluxo de Entrada com Arquivo
        OutputStream fos = new FileOutputStream("textoTeste2.txt"); //entrada
        Writer osw = new OutputStreamWriter(fos); //bytes em caracteres
        BufferedWriter br = new BufferedWriter(osw); //Quarda todos os caracteres de uma linha em Buffer
        br.write("olá, gente!");
        br.newLine();
        br.newLine();
        br.write("blers");



        br.close();

    }
}
