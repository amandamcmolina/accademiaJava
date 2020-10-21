package com.dealership.entity.cars;
import com.dealership.entity.client.Client;
import com.dealership.entity.employee.Employee;
import com.dealership.entity.employee.Seller;

public class Car {
    protected String brand;
    protected String model;
    protected int year;
    protected double price;
    protected String type;
    protected String color = "black";

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public Car(){

    }

    public Car(String brand, String model, int year, double price, Client client, Employee seller){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString(){
        return "Marca: " + this.brand +
                "\nModelo: " + this.model +
                "\nAno: " + this.year +
                "\nCor: " + this.color;
    }


}
