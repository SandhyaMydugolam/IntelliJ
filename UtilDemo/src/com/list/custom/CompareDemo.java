package com.list.custom;

import com.util.list.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Ags", "siri", 1000);
        Book book2 = new Book("apps", "sri", 589);
        Book book3 = new Book("femine", "kinuu", 720);
        Book book4 = new Book("friend", "vicky", 387);
        Book book5 = new Book("motivation", "gigi", 349);
        List<Book> books = Arrays.asList(book1,book2,book3,book4,book5);

        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println("''''''''''''''");
        Collections.sort(books);

        for (Book book : books){
            System.out.println(book);
        }
    }
}
