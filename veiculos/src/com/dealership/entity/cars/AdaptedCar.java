package com.dealership.entity.cars;

import com.dealership.entity.client.Client;
import com.dealership.entity.employee.Seller;

public class AdaptedCar extends Car{
    //tipo de cliente
    private int serialNumber;

    public AdaptedCar(int SerialNumber){
        this.serialNumber = serialNumber;
        super.brand = "Jeep";
        super.model = "Carro adaptado";
        super.year = 2020;
        super.price = 90000;
        super.type = "Adaptado";
    }

    public AdaptedCar(){
        super.brand = "Jeep";
        super.model = "Renegade";
        super.year = 2020;
        super.price = 80000;
    }

    public AdaptedCar(String brand, String model, int year, double price, Client client, Seller seller) {
        super(brand, model, year, price, client, seller);
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

}
