package com.book.util;

import com.book.model.Book;

import java.util.Arrays;
import java.util.List;

public class BookDetails {

    public static List<Book> showBooks(){
        return Arrays.asList(
                new Book("motivation","ss","games",7,1000),
                new Book("jaav","ss","games",5,800),
                new Book("kenny","joe","tech",2,500),
                new Book("yes","gei","fiction",1,300),
                new Book("gig","kira","help",7,500)
        );
    }
}
