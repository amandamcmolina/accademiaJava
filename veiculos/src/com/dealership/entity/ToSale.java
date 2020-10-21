package com.dealership.entity;

import com.dealership.entity.cars.AdaptedCar;
import com.dealership.entity.cars.Car;
import com.dealership.entity.cars.CommonCar;
import com.dealership.entity.client.Client;
import com.dealership.entity.employee.Employee;

public class ToSale {

    private Client client;
    private Employee seller;
    private Car car;
    private boolean financiar = false;
    private boolean ipi;
    private int parcelas = 0;
    private double valorParcela = 0;
    private double finalPrice;

    public ToSale(Client client, Employee seller){
        this.client = client;
        this.seller = seller;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Employee getSeller() {
        return seller;
    }

    public void setSeller(Employee seller) {
        this.seller = seller;
    }

    public Car getCar() {
        if(this.client.isDeficient()){
            int serialNumber = (int) (Math.random() * 100);
            return this.car = new AdaptedCar(serialNumber);
        }else {
            return this.car = new CommonCar();
        }
    }

    public boolean getFinanciar(){
        return this.financiar;
    }

    public boolean isFinanciar(int parcelas) {
        this.parcelas = parcelas;
        return this.financiar = true;
    }

    public int getParcelas(){
        return this.parcelas;
    }

    @Override
    public String toString() {
        return "Vendedor: " + this.seller.getNome() +
                "\nCliente: " + this.client.getName() +
                "\nCarro: " + this.getCar().getModel();
    }

    public double ipiCalculate(){
        if(this.client.isDeficient() == false){
            double priceWithIpi = this.getCar().getPrice() * 1.15;
            return priceWithIpi;
        }else{
            double priceWithIpi= this.getCar().getPrice();
            return priceWithIpi;
        }
    }

    public String finalPriceCalculate(){
        if(financiar == true){
            this.valorParcela = (this.ipiCalculate() / this.parcelas) * 1.0189;
            this.finalPrice = this.valorParcela * this.parcelas;
        }else{
            this.valorParcela = 0;
            this.finalPrice = this.ipiCalculate() * 0.90;
        }

        return "Números de parcelas: " + this.parcelas + "\nValor da parcela: " + this.valorParcela +
                "\nPreço final do carro: " + this.finalPrice;
    }

    public String toFinish(){
        if(seller.getChecked() == true) {
            return "Venda finalizada com sucesso!";
        }else{
            return "Por favor, valide com seu Gerente.";
        }
    }
}
