package com.javaIo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Senha {
    public static void main(String[] args) throws IOException {
//        Properties props = new Properties();
//        props.setProperty("login", "amandamcmolina");
//        props.setProperty("senha", "123456");
//        props.setProperty("endereco", "www.amanda.com.br");
//
//        props.store(new FileWriter("conf.properties"), "algum comentário");
        Properties propsL = new Properties();
        propsL.load(new FileReader("conf.properties"));

        String login = propsL.getProperty("login");
        String senha = propsL.getProperty("senha");
        String endereco = propsL.getProperty("endereco");

        System.out.println(login + ", " + senha  + ", " +  endereco);



    }
}
