package com.javaIo;

import java.io.*;

public class TesteEscritaSimplificado {
    public static void main(String[] args) throws IOException {
        //Fluxo de Entrada com Arquivo
//        OutputStream fos = new FileOutputStream("textoTeste2.txt"); //entrada
//        Writer osw = new OutputStreamWriter(fos); //bytes em caracteres
//        BufferedWriter br = new BufferedWriter(osw); //Quarda todos os caracteres de uma linha em Buffer

        FileWriter fw = new FileWriter("textoTeste2.txt");
        fw.write("UUUUUUUUUUUUUU");
        fw.write("\n");
        fw.write(System.lineSeparator());
        fw.write("AAAAAAAAAAA");

        fw.close();

    }
}
