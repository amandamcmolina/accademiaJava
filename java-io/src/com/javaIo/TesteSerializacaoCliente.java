package com.javaIo;

import java.io.*;

public class TesteSerializacaoCliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Cliente cliente = new Cliente();
//        cliente.setCpf("34905866122");
//        cliente.setNome("Amanda");
//        cliente.setProfissao("Dev");
//
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("clienteId.bin"));
//        //Por onde darei uma resposta? Por arquivo
//        //qual arquivo? cliente.bin
//        // o que você vai escrever na respota? cliente///implementar interface
//        oos.writeObject(cliente);//serializar o objeto
//        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente.getNome());
    }
}
