package com.dealership.entity;

import com.dealership.entity.cars.Car;
import com.dealership.entity.client.Client;
import com.dealership.entity.employee.Intern;
import com.dealership.entity.employee.Manager;
import com.dealership.entity.employee.Seller;

import java.util.Objects;

public class TesteVendas {
    public static void main(String[] args) {
        Manager gerente = new Manager("Viviar", "123.456.789-55", 50, 123456);
        Client cliente = new Client("Amanda", "349.258.631-11", true);
        Intern estagiario = new Intern("Oi", "oi", 123456);
        Seller vendedor = new Seller("Artur", "123.456.789-11", 123, 12345);
        ToSale novaVenda = new ToSale(cliente, estagiario);

//        novaVenda.isFinanciar();

//        System.out.println(novaVenda.getIpi());
        //false
        System.out.println(novaVenda.ipiCalculate());
//        System.out.println(novaVenda.getCar().getType());
//        System.out.println(novaVenda.ipiCalculate());
//        System.out.println(novaVenda.getIpi());
        novaVenda.isFinanciar(10);

        /*System.out.println(novaVenda.finalPriceCalculate());
        System.out.println(novaVenda.getSeller().getType());*/

        /*System.out.println(novaVenda.getSeller().getChecked());
        System.out.println(gerente.getPassword() == 0);*/
        System.out.println(gerente.getPassword());
        estagiario.validation(gerente, 123456);
        System.out.println(novaVenda.toFinish());
    }


}
