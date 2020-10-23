package com.javaIo;

import java.io.*;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        String nome = "Amanda Molina"; //transforma em fluxo binário
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//        oos.writeObject(nome);//serializar o objeto
        //oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
        String nome = (String) ois.readObject();
        ois.close();
        System.out.println(nome);
    }
}
