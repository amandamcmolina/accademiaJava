package com.javaIo;

import java.io.*;

public class TesteEscritaSimplificado {
    public static void main(String[] args) throws IOException {

//        BufferedWriter bw = new BufferedWriter(new FileWriter("textoTeste2.txt"));
        //sem usar o BufferWriter
//        PrintStream ps = new PrintStream("textoTeste2.txt");
        PrintStream ps = new PrintStream(new File("ola.txt"));
        ps.println("oiii");
        ps.println();
        ps.println("legal");

        ps.close();

    }
}
