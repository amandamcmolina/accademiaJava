package com.javaIo;

import java.io.*;
import java.net.Socket;

public class TesteRede {
    public static void main(String[] args) throws IOException {

       Socket s = new Socket();

        InputStream fis = s.getInputStream(); //entrada
        Reader isr = new InputStreamReader(fis); //bytes em caracteres
        BufferedReader br = new BufferedReader(isr); //Quarda todos os caracteres de uma linha em Buffer

        OutputStream fos = s.getOutputStream();
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
