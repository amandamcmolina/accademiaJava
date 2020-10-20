package com.bank.entity;

public class Teste {
    public static void main(String[] args) {
        CheckingAccount cc = new CheckingAccount();
        cc.setAmount(200);
        double taxa = cc.getTaxes();
//        System.out.println(taxa);
        System.out.println("------------");


        LifeInsurence seguro = new LifeInsurence();
        seguro.setOwner(cc);
        seguro.setValue(5000);
        double taxamento = seguro.getTaxes();
        System.out.println("------------");
        System.out.println(taxamento);
        System.out.println("------------");
        System.out.println(seguro.getOwner().getTaxes() + taxamento);

        Taxable tax = cc;
        System.out.println(tax.getTaxes());

    }
}
