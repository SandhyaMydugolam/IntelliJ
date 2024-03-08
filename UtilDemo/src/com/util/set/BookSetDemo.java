package com.util.set;

import com.list.custom.Book;

import java.util.*;

public class BookSetDemo {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("java","kathy",900),
                new Book("java","kathy",900),
                new Book("5am club","robin",350),
                new Book("leadership","robin",900),
                new Book("Spring","kathy",1900),
                new Book("jsp&Servlets","kathy",900));


        System.out.println("List Book");
        for (Book book:books){
            System.out.println(book);
        }
        System.out.println();
        System.out.println("Set Books");
        System.out.println();

        Set<Book> bookSet = new LinkedHashSet<>(books);
        for (Book book:bookSet){
            System.out.println(book);
        }

        Set<Book> bookSet1 = new TreeSet<>(books);
        for (Book book:bookSet1){
            System.out.println(book);
        }
    }
}
