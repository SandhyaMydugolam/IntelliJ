package com.util.list;

public class Customer {
    private String name;
    private int CustomerId;
    private String city;

    public Customer() {
    }

    public Customer(String name, int customerId, String city) {
        this.name = name;
        CustomerId = customerId;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", CustomerId=" + CustomerId +
                ", city='" + city + '\'' +
                '}';
    }
}
