package com.oops.bean;

public class Vechile {
    private String model;
    private String brand;
    private double price;

    @Override
    public String toString() {
        return "Vechile{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
