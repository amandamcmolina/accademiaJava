package com.javaIo;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
        while(scanner.hasNextLine()){
            String linha = scanner.nextLine();
            System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");
            String tipo = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int conta = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            String valorFormatado = String.format(new Locale("pt", "BR") , "%s - %04d - %08d - %s: %08.2f", tipo, agencia, conta, titular, saldo);
            System.out.println(valorFormatado);

            linhaScanner.close();

        }



        scanner.close();
    }
}
