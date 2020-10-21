package com.dealership.entity.cars;

import com.dealership.entity.client.Client;
import com.dealership.entity.employee.Seller;

public class CommonCar extends Car{

    public CommonCar(){
        super.brand = "Jeep";
        super.model = "Renegade";
        super.year = 2020;
        super.price = 80000;
        super.type = "Comum";
    }

    public CommonCar(String brand, String model, int year, double price, Client client, Seller seller) {
        super(brand, model, year, price, client, seller);
    }
}
