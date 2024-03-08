package com.util.list;

import java.util.ArrayList;
import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        List<Customer> customerBycity = new ArrayList<>();
        customerList.add(new Customer("siri",10,"bengaluru"));
        customerList.add(new Customer("sri",16,"tirupathi"));
        customerList.add(new Customer("kutlu",17,"odc"));
        customerList.add(new Customer("ram",14,"bengaluru"));
        customerList.add(new Customer("sandhya",16,"bengaluru"));


        for (Customer customer: customerList){
            System.out.println(customer);
        }
        System.out.println("..................");
        for (Customer customer: customerList){
            if (customer.getCity().equals("bengaluru")){
                customerBycity.add(customer);

            }

        }
        for (Customer city : customerBycity){
            System.out.println(city);
        }
    }
}
